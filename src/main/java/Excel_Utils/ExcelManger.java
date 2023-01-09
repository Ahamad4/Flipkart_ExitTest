package Excel_Utils;

import org.apache.log4j.Logger;
import org.testng.SkipException;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Flipkart.ExitTest.BaseClass;
import RadProd.ExtentManager.Screenshot.ExtentReporter;
import RadProd.ExtentManager.Screenshot.ReadPropertiesFile;

public class ExcelManger {
	//public static ExtentTest test;
	public static final Logger log = Logger.getLogger(ExcelManger.class);
	public static ExcelUtils reader = null;
	public static ExtentReports extent;
	public static ExtentTest test;
	static  {
		try {

			reader = new ExcelUtils(ReadPropertiesFile.getProperty("Excel_Path"));
		} catch (Exception e) {

			log.error(e.getMessage());
		}
	}
	
	
	public static void toCheckExecutionRequired(String executionRequired) {
		
		// if execution required fieinfold is no
		if (executionRequired.equals("no")) {

			BaseClass.test.log(LogStatus.WARNING, "Execution Required : " + executionRequired.toUpperCase());
			log.info("Execution required is no , skipping the test");
			throw new SkipException("Skipping this exception");
		}

		// if execution required field is empty
		if (executionRequired.equals("")) {

			BaseClass.test.log(LogStatus.WARNING, "Execution Required : " + executionRequired.toUpperCase());
			log.info("Execution required is empty , skipping the test");
			throw new SkipException("Skipping this exception");
		}
	}
}
