package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DashboardPage {
    //create a webDriver object for this class
    private WebDriver driver;

    //Create a constructor
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //locate elements
    private By welcomeAdmin = By.id("welcome");
    private By logOut = By.linkText("Logout");


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
}
