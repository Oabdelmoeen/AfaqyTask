package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.SignupPage;
import utils.BaseTest;
import utils.DataGenerator;
import utils.DriverFactory;

public class SignupTest extends BaseTest {


    HomePage homePage;
    SignupPage signupPage;

    @BeforeMethod
    public void setUpSignUpTest() {
        driver.get("https://automationexercise.com");
        homePage = new HomePage(driver);
        signupPage = new SignupPage(driver);
    }

    @Test(dataProvider = "userData")
    public void testSignUp(String name, String email, String password) throws InterruptedException {
        homePage.clickSignupLogin();
        signupPage.enterSignupDetails(name, email);
        signupPage.fillAccountInformation(name, password);
        signupPage.logout();

    }

    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        return new Object[][]{
            {DataGenerator.getName(), DataGenerator.getEmail(), DataGenerator.getPassword()},
            {DataGenerator.getName(), DataGenerator.getEmail(), DataGenerator.getPassword()}
        };
    }



}