package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    //create a webDriver object for this class
    private WebDriver driver;

    //Create a constructor
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //locate elements
    private By welcomeAdmin = By.cssSelector("#branding a:nth-child(2)");
    private By logOut = By.linkText("Logout");
    private By companyImage = By.xpath("//*[@id=\"branding\"]/a[1]/img");
    private By dashboardText =By.xpath("//*[@id=\"content\"]/div/div[1]/h1");

    //Functions to interact with the element
    public void clickWelcomeAdmin() throws InterruptedException
    {
        //Wait for 10 seconds before executing the action
        Thread.sleep(10000);
        driver.findElement(welcomeAdmin).click();
    }

    public LoginPage clickLogout() throws InterruptedException
    {
        //wait for 3 seconds before executing the action
        Thread.sleep(3000);
        driver.findElement(logOut).click();
        return new LoginPage(driver);
    }

    public void verifyCompanyImage (){
        //Find the company Image element
        driver.findElement(companyImage).isDisplayed();
    }

    public void verifyDashboardText (){
        //Find the DashboardText element
        driver.findElement(dashboardText).isDisplayed();
    }
}
