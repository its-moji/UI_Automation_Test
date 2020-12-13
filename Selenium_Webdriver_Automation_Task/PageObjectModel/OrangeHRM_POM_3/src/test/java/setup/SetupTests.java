package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.LoginPage;

public class SetupTests {
    //create a Webdriver Object
    private WebDriver driver;
    //create LoginPage object
    protected LoginPage loginPage;

    @BeforeTest
    public void setUp()
    {
        //selenium webdriver needs this executable in order to know which browser to run your test
        //Browser setup for chrome
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //Instantiate Webdriver object
        driver = new ChromeDriver();

        //maximize window size
        driver.manage().window().maximize();

        //Launch the application
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

        //Instantiate login page after launching the browser -Handle
        loginPage = new LoginPage(driver);
    }

    @AfterTest
    public void closeBrowser()
    {
        //".close" would close the window but the ".quit" would exit the session
        driver.quit();
    }

}
