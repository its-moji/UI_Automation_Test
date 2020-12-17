package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    //create a webdriver
    private WebDriver driver;

    public LoginPage (WebDriver driver){
        this.driver = driver;
    }

    //locate element using By
    private By username =By.id("username");

    public void enterUsername(String uName){
        //search for username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterUserPassword (String pwd){
        //search for password element
        WebElement passwordField = driver.findElement(By.id("password"));
    }

    public DashboardPage clickLoginBtn(){
        //click login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button"));
        return new DashboardPage(driver);
    }
}
