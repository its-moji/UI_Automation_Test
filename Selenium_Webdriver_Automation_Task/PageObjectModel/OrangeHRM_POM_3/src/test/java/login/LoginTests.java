package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.SetupTests;

public class LoginTests extends SetupTests {

    //TestNG annotation
    @Test
    public void testVerifyCompanyImage(){
        loginPage.verifyCompanyImage();
    }

    @Test
    public void testVerifyForgotPassword(){
        loginPage.verifyForgotPassword();
    }

    @Test
    public void testVerifyLoginPanel(){
        loginPage.verifyLoginPanel();
    }

    @Test
    //This class extends to the SetupTests as the SetupTests class contains all the setup requirements to run our test
    public void testLogin() throws InterruptedException
    {
        String username = "Admin";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("admin123");

        //Handler for dashboard page

        DashboardPage dashboardPage = loginPage.clickLoginBtn();

        //check whether the pageTitle is correct
        String pageTitle = "OrangeHRM";
        if(pageTitle.equalsIgnoreCase("OrangeHRM")){
            System.out.println("The page title is " + pageTitle);
        }else {
            System.out.println("The page title is incorrect. Actual page title is " + pageTitle);
        }

        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();
    }
}
