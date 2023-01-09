package RadProd.ExtentManager.Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
public static String captureScreenshot(WebDriver driver , String testName) throws IOException {
		
		String Saveimg = System.getProperty("user.dir")+"./FailedScreenshot/"+ testName+".png";
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File(Saveimg));	
		return Saveimg;
		
	}
}