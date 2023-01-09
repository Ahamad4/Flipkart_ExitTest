package Flipkart.ExitTest;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Excel_Utils.ExcelManger;
import PageFactory.GroceryPage;
import PageFactory.TravelPage;
import RadProd.ExtentManager.Screenshot.ReadPropertiesFile;

public class Test_Travel extends BaseClass {
	public static String sheetName = "Data";

	@Test
	public void Test_searchFlight() throws InterruptedException {

		String testname = "Test_searchFlight";
		TravelPage Obj_TravelPage = new TravelPage(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);
		
		Obj_TravelPage.Click_On_Travel();
		log.info("Travel Clicked");
		
		Obj_TravelPage.Click_On_twoWAY();
		log.info("Round Trip Selected successfully");
		
		Obj_TravelPage.From_city(ReadPropertiesFile.getProperty("City_From"));
		log.info("From City entered successfully");
		
		Obj_TravelPage.To_city(ReadPropertiesFile.getProperty("City_To"));
		log.info("To City entered successfully");
		
		Obj_TravelPage.Return_Date();
		log.info("Return Date selected");
		
		Obj_TravelPage.Sreach_Flight();
		log.info("Flight Pune To Delhi searched Successfully");
		
		log.info("Test Case_17 --> Test_searchFlight --> Passed");
	}
}
