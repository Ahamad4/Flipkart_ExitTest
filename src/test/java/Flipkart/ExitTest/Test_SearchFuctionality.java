package Flipkart.ExitTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Excel_Utils.ExcelManger;
import PageFactory.SearchFuctionality_Page;
import RadProd.ExtentManager.Screenshot.ReadPropertiesFile;

public class Test_SearchFuctionality extends BaseClass {

	public static String sheetName = "Data";

	@Test(priority = 1)
	public void Test_compare_product() throws InterruptedException {

		String testname = "Test_compare_product";
		SearchFuctionality_Page Obj_SearchPage = new SearchFuctionality_Page(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		log.info(testData);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		Obj_SearchPage.search_bar(ReadPropertiesFile.getProperty("headphones"));
		log.info("Item entered successfully on search bar");
		Obj_SearchPage.search_btn();
		log.info("Search button clicked");
		Obj_SearchPage.Click_on_product();
		log.info("Product Seleced successfully");

		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		driver.switchTo().window(childid);

		Obj_SearchPage.compare_item();
		log.info("checked for compare");
		Obj_SearchPage.compare1_item();
		log.info("Campare button clicked");
		Obj_SearchPage.chooseBrand_for_Compare();
		log.info("Brand Selected successfully");
		Obj_SearchPage.chooseProduct_for_Compare();
		log.info("Product selected successfully");

		driver.close();
		driver.switchTo().window(parentid);

		Obj_SearchPage.BackToHome();

		log.info("Test Case_9 --> Test_compare_product --> Passed ");

	}

	@Test(priority = 2)
	public void Test_SearchAndCheckSpecification() throws InterruptedException {
		String testname = "Test_SearchAndCheckSpecification";
		SearchFuctionality_Page Obj_SearchPage = new SearchFuctionality_Page(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		Obj_SearchPage.search_bar(ReadPropertiesFile.getProperty("SearchItem"));
		log.info("Item entered successfully on search bar");
		Obj_SearchPage.search_btn();
		log.info("Search button clicked");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		Obj_SearchPage.Select_item();
		log.info("Product Seleced successfully");

		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		driver.switchTo().window(childid);

		Obj_SearchPage.Read_More();
		log.info("Raed More Clicked For more Specification");

		driver.close();
		driver.switchTo().window(parentid);

		Obj_SearchPage.BackToHome();
		log.info("Test Case_10 --> Test_SearchAndCheckSpecification --> Passed ");

	}

	@Test(priority = 3)
	public void Test_Hower_on_product() throws InterruptedException {

		String testname = "Test_Hower_on_product";
		SearchFuctionality_Page Obj_SearchPage = new SearchFuctionality_Page(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		Obj_SearchPage.search_bar(ReadPropertiesFile.getProperty("ItemSearch"));
		log.info("Item entered successfully on search bar");
		Obj_SearchPage.search_btn();
		log.info("Search button clicked");
		Obj_SearchPage.choose_item();
		log.info("Product Seleced successfully");

		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		driver.switchTo().window(childid);

		Obj_SearchPage.Hower_on_product();
		log.info("Hower on product successfully");

		driver.close();
		driver.switchTo().window(parentid);

		Obj_SearchPage.BackToHome();
		Thread.sleep(2000);
		log.info("Test Case_11 --> Test_Hower_on_product --> Passed ");
	}
}
