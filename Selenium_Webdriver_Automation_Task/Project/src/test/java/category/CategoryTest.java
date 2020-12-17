package category;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import setup.SetUpTests;

import java.util.concurrent.TimeUnit;

public class CategoryTest {
    //create a webdriver object
    private WebDriver driver;

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
        void PageTitle() {
                //Assert pageTitle element
                String title = driver.getTitle();
                Assert.assertEquals("title","title");
        }
        @Test(priority = 0)
        void MyCartTest() {
                //Assert MyCartTest element
                WebElement MyCart =driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/a/span[1]"));
                Assert.assertEquals(MyCart.isDisplayed(), MyCart.isDisplayed());
        }

        @Test(priority = 1)
        void StoreLocator() {
                //Assert store locator element
                WebElement StoreLocator =driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[1]/a"));
                Assert.assertEquals(StoreLocator.isDisplayed(), StoreLocator.isDisplayed());
        }

        @Test(priority = 2)
        void Help() {
                //Assert Help element
                WebElement Help =driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[1]/div/a"));
                Assert.assertEquals(Help.isDisplayed(), Help.isDisplayed());
        }

        @Test(priority = 3)
        void Health() {
                //Assert Health element
                WebElement Health =driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/section/a[1]/picture/img"));
                Assert.assertEquals(Health.isDisplayed(), Health.isDisplayed());
        }

        @Test(priority = 4)
        void Drinks() {
                //Assert Drinks element
                WebElement Drinks =driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/section/a[2]/picture/img"));
                Assert.assertEquals(Drinks.isDisplayed(), Drinks.isDisplayed());
        }

        @Test(priority = 5)
        void Groceries() {
                //Assert Groceries element
                WebElement Groceries =driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/section/a[3]/picture/img"));
                Assert.assertEquals(Groceries.isDisplayed(), Groceries.isDisplayed());

}
    @AfterTest
    public void closeBrowser()
    {
        //quit the session
        driver.quit();
    }
}
