package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //using By as a locator for elements
    private By username = By.xpath("//input[@name='txtUsername']");
    private By companyImage = By.xpath("//*[@id=\"divLogo\"]/img");
    private By forgotPassword = By.linkText("Forgot your password?");
    private By loginPanel = By.xpath("/html//div[@id='logInPanelHeading']");

    public void verifyCompanyImage ()
    {
        //Find the company logo element and verify
        driver.findElement(companyImage).isDisplayed();
    }

    public void verifyForgotPassword ()
    {
        //Find the forgot password element and verify
        driver.findElement(forgotPassword).isDisplayed();
    }

    public void verifyLoginPanel ()
    {
        //Find the login panel  element and verify
        driver.findElement(loginPanel).getText();
    }


    public void enterUsername(String uName)
    {
        //find the username element and enter the username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterUserPassword(String pwd)
    {
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(pwd);
    }

    public DashboardPage clickLoginBtn()
    {
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        return new DashboardPage(driver);
    }

}
