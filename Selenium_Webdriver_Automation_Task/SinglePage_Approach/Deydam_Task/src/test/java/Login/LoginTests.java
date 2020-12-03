package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import the selenium webDriver
    private WebDriver driver;

    @BeforeClass
    public void setUp () throws InterruptedException {
        //import chromeDriver
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
        driver = new ChromeDriver();
        //input the webpage url
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //wait for 5 seconds
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("itsmojee");
        driver.findElement(By.id("password")).sendKeys("Mojee123$");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
    }
public static void main (String[] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();}

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

