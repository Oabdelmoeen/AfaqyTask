package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SignupPage {

    WebDriver driver;
    WebDriverWait wait;

    private By nameInput = By.xpath("//input[@data-qa='signup-name']");
    private By emailInput = By.xpath("//input[@data-qa='signup-email']");
    private By signupButton = By.xpath("//button[@data-qa='signup-button']");

    private By titleRadio = By.id("id_gender1");
    private By passwordInput = By.id("password");
    private By dayDropdown = By.id("days");
    private By monthDropdown = By.id("months");
    private By yearDropdown = By.id("years");
    private By newsletterCheckbox = By.id("newsletter");
    private By optinCheckbox = By.id("optin");
    private By firstNameInput = By.id("first_name");
    private By lastNameInput = By.id("last_name");
    private By companyInput = By.id("company");
    private By address1Input = By.id("address1");
    private By countryDropdown = By.id("country");
    private By stateInput = By.id("state");
    private By cityInput = By.id("city");
    private By zipcodeInput = By.id("zipcode");
    private By mobileNumberInput = By.id("mobile_number");
    private By createAccountButton = By.xpath("//button[text()='Create Account']");

    private By continueButton = By.xpath("//a[@data-qa='continue-button']");
    private By logoutButton = By.xpath("//a[text()=' Logout']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSignupDetails(String name, String email) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(signupButton).click();
    }

    public void fillAccountInformation(String name, String password) throws InterruptedException {
         wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(titleRadio).click();
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(dayDropdown).sendKeys("6");
        driver.findElement(monthDropdown).sendKeys("August");
        driver.findElement(yearDropdown).sendKeys("1997");
        driver.findElement(newsletterCheckbox).click();
        driver.findElement(optinCheckbox).click();
        driver.findElement(firstNameInput).sendKeys(name);
        driver.findElement(lastNameInput).sendKeys("Test Last Name");
        driver.findElement(companyInput).sendKeys("Afaqy");
        driver.findElement(address1Input).sendKeys("Test Street");
        driver.findElement(countryDropdown).sendKeys("Egypt");
        driver.findElement(stateInput).sendKeys("Test State");
        driver.findElement(cityInput).sendKeys("Test City");
        driver.findElement(zipcodeInput).sendKeys("123456");
        driver.findElement(mobileNumberInput).sendKeys("01012345678");
        driver.findElement(createAccountButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

    public void logout() {
        driver.findElement(logoutButton).click();
    }
}