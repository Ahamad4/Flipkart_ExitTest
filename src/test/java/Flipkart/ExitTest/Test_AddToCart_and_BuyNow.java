package Flipkart.ExitTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import Excel_Utils.ExcelManger;
import PageFactory.AddToCart_and_BuyNowPage;

public class Test_AddToCart_and_BuyNow extends BaseClass {

	Logger log = Logger.getLogger(ExcelManger.class);
	public static String sheetName = "Data";

	@Test(priority = 1)
	public void Test_Add_to_cart() throws InterruptedException {
		String testname = "Test_Add_to_cart";
		AddToCart_and_BuyNowPage Obj_CartAndBuyNow = new AddToCart_and_BuyNowPage(driver);

		Obj_CartAndBuyNow.go_to_electronics();
		log.info("Electronis Page open");
		
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		log.info(testData);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		Obj_CartAndBuyNow.select_item1_for_AddToCart();
		log.info("Item Selected For Add to Cart");
		
		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		driver.switchTo().window(childid);

		Obj_CartAndBuyNow.click_on_AddToCart();
		log.info("clicked on Add to Cart");
		
		driver.close();
		driver.switchTo().window(parentid);
		
		Obj_CartAndBuyNow.BackToHome();
		log.info("Item added To Cart Successfully");
		Thread.sleep(2000);
		log.info("Test Case_12 --> Test_Add_to_cart --> Passed");
	}

	@Test(priority = 2)
	public void Test_Buy_Now() throws InterruptedException {

		String testname = "Test_Buy_Now";

		AddToCart_and_BuyNowPage Obj_CartAndBuyNow = new AddToCart_and_BuyNowPage(driver);

		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		ExcelManger.toCheckExecutionRequired(executionRequired);

		Obj_CartAndBuyNow.go_to_electronics();
		log.info("Electronis Page open");
		
		Obj_CartAndBuyNow.select_item_for_Buy();
		log.info("Item Selected For Add to Cart");
		
		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String) it.next();
		String childid = (String) it.next();
		driver.switchTo().window(childid);

		Obj_CartAndBuyNow.click_on_Buy_Now();
		log.info("clicked on Add to Cart");
		
		driver.close();
		driver.switchTo().window(parentid);
		
		Obj_CartAndBuyNow.BackToHome();
		log.info("Item Buy Now Successfully");
		Thread.sleep(2000);
		log.info("Test Case_13 --> Test_Buy_Now --> Passed");

	}
}
