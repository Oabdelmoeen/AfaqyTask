package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest {
    public static ExtentReports report;
    public static ExtentTest test;
    protected WebDriver driver;
    @BeforeMethod
    public void setUpBaseTest(Method method) {

        report = ReportManager.getReportInstance();
        test = report.createTest(method.getName());
        driver = DriverFactory.getDriver();


    }

    @AfterMethod
    public void tearDownBaseTest(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test Passed");
        }
        DriverFactory.quitDriver();  // <-- Use factory method here
        report.flush();
    }
}