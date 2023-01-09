package Flipkart.ExitTest;

import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;
import Excel_Utils.ExcelManger;
import PageFactory.BasicTestPage;
import RadProd.ExtentManager.Screenshot.ReadPropertiesFile;



public class Test_Basic_Flipkart extends BaseClass{
	
	public static String sheetName = "Data";

	@Test(priority=1)
	public void Test_verify_Title()
	{
		BasicTestPage Obj_BasicPage = new BasicTestPage(driver);	
		log.info("Flipkart url Opened");
		Obj_BasicPage.cancels();
		log.info("Login Pop up cancelled");
		String testname = "Test_verify_Title";
		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);	
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle=ReadPropertiesFile.getProperty("ExpectedTitle_Flipkart");
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		log.info("Flipkart Title Assertion successfully");
		log.info("Test Case_1 --> Test_verify_Title --> Passed");
		
	}

	@Test(priority=2)
	public void Test_loginFlipkart () throws InterruptedException
	{
		
		String testname = "Test_loginFlipkart";
		BasicTestPage Obj_BasicPage = new BasicTestPage(driver);	
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);	
		
		Obj_BasicPage.Login_btn();
		log.info("Login Button Clicked");
		Obj_BasicPage.Enter_Mob(ReadPropertiesFile.getProperty("mob"));
		log.info("Mob No. Entered");
		Obj_BasicPage.Request_otp();
		log.info("Clicked On Request OTP");
		log.info("Test Case_2 --> Test_loginFlipkart --> Passed");
	}
	
	
	@Test(priority=3)
	public void Test_Search_Item () throws InterruptedException
	{
		BasicTestPage Obj_BasePage= new BasicTestPage(driver);
        String testname = "Test_Search_Item";		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);	
		Obj_BasePage.search_bar(ReadPropertiesFile.getProperty("item"));
		log.info("Item Entered For Searching");
		Obj_BasePage.search_btn();		
		log.info("Searche button clicked");
		log.info("Test Case_3 --> Test_Search_Item --> Passed");
	}

}
