package Flipkart.ExitTest;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Excel_Utils.ExcelManger;
import PageFactory.GroceryPage;
import RadProd.ExtentManager.Screenshot.ReadPropertiesFile;

public class Test_Grocery extends BaseClass {
	public static String sheetName = "Data";

	@Test(priority = 1)
	public void Test_checkGroeryCart() throws InterruptedException {

		String testname = "Test_checkGroeryCart";
		GroceryPage Obj_Grocery = new GroceryPage(driver);
		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);
		
		Obj_Grocery.Grocery_Item();
		log.info("Grocery opend successfully");

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = ReadPropertiesFile.getProperty("ExpectedTitle_Grocery");
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		Obj_Grocery.Enter_PinCode("474011");
		log.info("PinCode entered successfully");
		Thread.sleep(1500);
	
		Obj_Grocery.AddforCart1();
		log.info("Items Added In grocery cart successfully");

		Thread.sleep(3000);
		Obj_Grocery.ChehkGroceryCart();
		log.info("Cart Open Successfully");

		log.info("Test Case_14 --> Test_checkGroeryCart --> Passed");


	}

	@Test(priority = 2)
	public void Test_AddGroceryItem() throws InterruptedException {

		String testname = "Test_AddGroceryItem";
		GroceryPage Obj_Grocery = new GroceryPage(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		Obj_Grocery.Grocery_Item();

		Obj_Grocery.staples_item();
		log.info("Staples Item Opned");

		Obj_Grocery.Add_oil();
		log.info("Oil Added to Bascket successfully");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");

		Obj_Grocery.Add_Ghee();
		log.info("Oil Added to Bascket successfully");

		Obj_Grocery.show_basket();
		log.info("Basket Open successfully");

		log.info("Test Case_15 --> Test_AddGroceryItem --> Passed");


	}

	@Test(priority = 3)
	public void Test_CheckGrocetyFilter() throws InterruptedException {
		String testname = "Test_CheckGrocetyFilter";
		GroceryPage Obj_Grocery = new GroceryPage(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		Obj_Grocery.Grocery_Item();

		Obj_Grocery.howerOnHomeKitchen();
		log.info("Home Kitchen opened");
	
		Obj_Grocery.Filters();
		log.info("All Filter Applied Successfully");
		
		Obj_Grocery.ShowAppliedFilter();
		log.info("All Applied Filtered Showed ");
		
		log.info("Test Case_16 --> Test_CheckGrocetyFilter --> Passed");


	}
}
