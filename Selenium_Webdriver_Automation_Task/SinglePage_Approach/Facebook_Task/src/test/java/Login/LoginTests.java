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
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
        driver = new ChromeDriver();
        //input the webpage url
        driver.get("https://www.facebook.com/");
        //wait for 5 seconds
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("olowokeremojisola@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Nigeria$");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
    }
public static void main (String [] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();}

        @AfterClass
        public void tearDown() {driver.quit();}
}
