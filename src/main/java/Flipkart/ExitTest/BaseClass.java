package Flipkart.ExitTest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Excel_Utils.ExcelManger;
import RadProd.ExtentManager.Screenshot.ExtentReporter;
import RadProd.ExtentManager.Screenshot.ReadPropertiesFile;
import RadProd.ExtentManager.Screenshot.ScreenShots;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends ExcelManger {

	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver = null;

	@BeforeSuite
	public void launchBrowser() throws IOException {

		String browserName = ReadPropertiesFile.getProperty("browser");
		if (ReadPropertiesFile.getProperty("mode").equalsIgnoreCase("non-headless")) {
			if (browserName.equals("chrome")) {
				extent = ExtentReporter.getInstance("reports/ExtentReports.html");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
		} else if (browserName.equals("edge")) {
			extent = ExtentReporter.getInstance("reports/ExtentReports.html");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

		else {
			System.out.println("");
		}

		if (ReadPropertiesFile.getProperty("mode").equalsIgnoreCase("headless")) {
			if (browserName.equals("chrome")) {
				extent = ExtentReporter.getInstance("reports/ExtentReports.html");
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless", "--window-size=1920,1200");
				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
		} else if (browserName.equals("edge")) {
			extent = ExtentReporter.getInstance("reports/ExtentReports.html");
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("headless", "--window-size=1920,1200");
			driver = new EdgeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

		else {
			System.out.println("");
		}

	}

	@AfterSuite
	public void tearDown() {
		// quitting the driver
		extent.flush();
		driver.quit();
	}

	@BeforeMethod
	public void startTest(Method method) {

		test = extent.startTest(method.getName());
		driver.get(ReadPropertiesFile.getProperty("url"));
	}

	@AfterMethod
	public void reportFlush(ITestResult result) throws IOException {

		System.out.println(result.getMethod().getMethodName());

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.log(LogStatus.SKIP, result.getThrowable());
		} else {
			test.log(LogStatus.PASS, "Test passes");
		}

		if (result.getStatus() == ITestResult.FAILURE) {
			String Saveimg = ScreenShots.captureScreenshot(driver, result.getName());
			test.log(LogStatus.FAIL, test.addScreenCapture(Saveimg));
		}

		else {
			if (result.getStatus() == ITestResult.SUCCESS) {
				test.log(LogStatus.PASS, "Test Case Pass");
			}
		}
	}
}
