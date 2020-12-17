package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    //Create webdriver
    private WebDriver driver;

    //create a constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    //locate elements
    By pageTitle = By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/a/img");
    By menu = By.className("menu");
    By computers = By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/div[1]/div/div/div[1]/ul/li[1]");
    By laptopSub = By.xpath("//*[@id=\"mainContent\"]/section[1]/div[1]/div/div[2]/h1");
    By AppleMacbook = By.xpath("//*[@id=\"mainContent\"]/section[1]/div[1]/div/div[2]/h1");
    By MyAccount = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/a/span");
    By logout = By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/ul/li[7]/a");

    //Functions to action elements
    public void clickMyAccount() throws InterruptedException{
        //wait for 10 secs
        Thread.sleep(10000);
        driver.findElement(MyAccount).click();
    }

    public LoginPage clickLogout()throws InterruptedException{
        //wait for 3 secs
        Thread.sleep(3000);
        driver.findElement(logout).click();
        return new LoginPage(driver);
    }
}
