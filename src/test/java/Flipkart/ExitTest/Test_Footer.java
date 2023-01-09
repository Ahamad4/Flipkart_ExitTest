package Flipkart.ExitTest;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Excel_Utils.ExcelManger;
import PageFactory.FooterPage;
import RadProd.ExtentManager.Screenshot.ReadPropertiesFile;

public class Test_Footer extends BaseClass {
	public static String sheetName = "Data";

	@Test(priority = 1)
	public void Test_Social_Media() throws InterruptedException {

		String testname = "Test_Social_Media";
		FooterPage Obj_Footer = new FooterPage(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		// driver.get(ReadPropertiesFile.getProperty("url"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		Obj_Footer.click_on_facebook();
		log.info("Facebook Page Opened successfully");


		String ActualTitle = driver.getTitle();
		String ExpectedTitle = ReadPropertiesFile.getProperty("ExpectedTitle_Facebook");
		Assert.assertEquals(ActualTitle, ExpectedTitle);

		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400)", "");
		
		Obj_Footer.click_on_Twitter();
		log.info("Twitter Page Opened successfully");

		
		String TwitterActualTitle = driver.getTitle();
		String ExpectedTitleTwitter = ReadPropertiesFile.getProperty("ExpectedTitle_Twitter");
		Assert.assertEquals(TwitterActualTitle, ExpectedTitleTwitter);

		driver.navigate().back();
		js.executeScript("window.scrollBy(0,400)", "");
		
		Obj_Footer.click_on_YouTube();
		log.info("Youtube Page Opened successfully");
		
		String YouTubeActualTitle = driver.getTitle();
		String ExpectedTitleYouTube = ReadPropertiesFile.getProperty("ExpectedTitle_YouTube");
		Assert.assertEquals(YouTubeActualTitle, ExpectedTitleYouTube);
		driver.navigate().back();
		log.info("Test Case_18 --> Test_Social_Media --> Passed");
	}

	@Test(priority = 2)
	public void Test_FAQ() throws InterruptedException {

		String testname = "Test_FAQ";
		FooterPage Obj_Footer = new FooterPage(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Obj_Footer.click_on_FAQ();
		log.info("FAQ Page Opened");

		Obj_Footer.Select_TypeOf_Issue();
		log.info("Type of Issue Selected");

		Obj_Footer.Select_TypeOf_IssueFacing();
		log.info("Type of Issue Facing Selected");

		Thread.sleep(3000);
		Obj_Footer.Show_Answer();
		log.info("Answer Of Issue open successfully");

		log.info("Test Case_19 --> Test_FAQ --> Passed");
	}

	@Test(priority = 3)
	public void Test_Careers() throws InterruptedException {

		String testname = "Test_Careers";
		FooterPage Obj_Footer = new FooterPage(driver);
		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);
		// OBJ.cancels();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		Obj_Footer.click_on_careers();
		log.info("Careers Page Opened");

		Obj_Footer.Select_JOb_Location();
		log.info("Job Seacherd Successfully");

		js.executeScript("window.scrollBy(0,400)", "");
		log.info("Test Case_20 --> Test_Careers --> Passed");
	}
}