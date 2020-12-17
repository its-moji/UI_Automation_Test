package logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogoutTest {
    //create a webdriver object
    private WebDriver driver;

    public LogoutTest (WebDriver driver) {
        this.driver = driver;
    }

    @BeforeClass
    public void SetUpTests() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        //get URL page
        driver.get("https://www.konga.com");

        //wait 5 secs
        Thread.sleep(5000);

        //Maximize window size
        driver.manage().window().maximize();

        //wait 10 secs
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Locate Sign in/Login Button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/a")).click();

        //locate username field
        driver.findElement(By.id("username")).sendKeys("");

        //locate password field
        driver.findElement(By.id("password")).sendKeys("");

        //locate and select login button
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();

        //wait for 5 secs
        Thread.sleep(5000);
    }

    @Test
    public void testLogout()throws InterruptedException {
        //click on the profile button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[3]/div[2]/div/a/span")).click();

        //click on the logout button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[3]/div[2]/div/ul/li[7]/a")).click();

        //print out a response
        if (driver.getCurrentUrl().contains("https://www.konga.com"))
            System.out.println("Account logged out. Page URL is https://www.konga.com");
    }

    @AfterTest
    public void closeBrowser(){
        //quit Browser
        driver.quit();
    }
}
