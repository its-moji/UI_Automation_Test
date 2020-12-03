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
            driver.get("https://monosnap.com/");
            //wait for 5 seconds
            Thread.sleep(5000);
            //maximize the window
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[6]/input[1]")).sendKeys("olowokeremojisola@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[6]/input[2]")).sendKeys("123Moji$2020");
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
        }
        public static void main (String[] args) throws InterruptedException {
            Login.LoginTests test = new Login.LoginTests();
            test.setUp();}

        @AfterClass
        public void tearDown(){
            driver.quit(); }
}
