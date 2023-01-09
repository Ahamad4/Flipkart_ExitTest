package Flipkart.ExitTest;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import Excel_Utils.ExcelManger;
import PageFactory.HeaderPage;
import PageFactory.TravelPage;
import RadProd.ExtentManager.Screenshot.ReadPropertiesFile;

public class Test_Headers extends BaseClass{
	public static String sheetName = "Data";
	@Test (priority =1)
	public void Test_MensFasion() throws InterruptedException {

		String testname = "Test_MensFasion";
		HeaderPage Obj_HeaderPage = new HeaderPage(driver);
		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		log.info(testData);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);
		
		Obj_HeaderPage.choose_Fashion();
		log.info("Fashion header Opend");
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle=ReadPropertiesFile.getProperty("ExpectedTitle_MensTshirt");
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		log.info("Fashion Page working Properly");
		
		log.info("Test Case_4--> Test_MensFasion --> Passed ");
		
}
	
	@Test (priority =2)
	public void Test_Home_Furnishings() throws InterruptedException {
		
		String testname = "Test_Home_Furnishings";
		HeaderPage Obj_HeaderPage = new HeaderPage(driver);
		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		log.info(testData);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);
		
		Obj_HeaderPage.Select_All();
		log.info("Home Furninshing CLicked");
		
		String ActualTitle=driver.getTitle();
		String ExpectedTitle=ReadPropertiesFile.getProperty("ExpectedTitle_HomeAccessories");
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		log.info("Home Page working Properly");
		
		log.info("Test Case_5 --> Test_Home_Furnishings --> Passed ");
     
}
	
	@Test (priority =3)
	public void Test_Top_offer() throws InterruptedException {
		String testname = "Test_Top_offer";
		
		HeaderPage Obj_HeaderPage = new HeaderPage(driver);
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);
		
		Obj_HeaderPage.Click_on_topOffer();
		log.info("Top Offer Clicked");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		log.info("Top Offer working Properly");
		log.info("Test Case_6 --> Test_Top_offer --> Passed ");
}
	
	@Test (priority =4)
	public void Test_MotorVehicle() throws InterruptedException {

		String testname = "Test_MotorVehicle";
		HeaderPage Obj_HeaderPage = new HeaderPage(driver);
		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		Obj_HeaderPage.Click_on_MotorVehicle();
		log.info("Motor Vehicle Clicked");
		
		//String ActualTitle=driver.getTitle();
		//String ExpectedTitle=ReadPropertiesFile.getProperty("ExpectedTitle_Vehicle");
		//Assert.assertEquals(ActualTitle,ExpectedTitle);
		log.info("Motor Vehicle working Properly");
		
		log.info("Test Case_7 --> Test_MotorVehicle --> Passed ");
}
	
	@Test (priority =5)
	public void Test_BestSeller() throws InterruptedException {

		String testname = "Test_BestSeller";
		HeaderPage Obj_HeaderPage = new HeaderPage(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);
		
		Obj_HeaderPage.Click_on_BestSeller();
		log.info("Best seller clicked");
		
		Obj_HeaderPage.Click_on_StartSelling();
		log.info("clicked on Start selling");
        
		Obj_HeaderPage.Enter_on_Email(ReadPropertiesFile.getProperty("Email"));
		log.info("Email Entered");
       
		Obj_HeaderPage.Enter_GST(ReadPropertiesFile.getProperty("GSt_No"));
		log.info("GST No Entered");
        
		Obj_HeaderPage.Click_on_Register();
		log.info("Best Seller Regiter Complete");
		
		log.info("Test Case_8 --> Test_BestSeller --> Passed ");
}
}