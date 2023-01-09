package log4j;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogGenerator {

	
public static void main(String[] args) {
	
		
		
		Logger log = Logger.getLogger(LogGenerator.class);
		
		WebDriver driver=new ChromeDriver();
	  
      
     String title = driver.getTitle();
     System.out.println("title value is"+ title);
     log.info("title value is"+ title);
     
     
     if(title.equals("Google")) {
    	 
    	 System.out.println("correct title is google");
    	 log.info("correct title is google and test case is passed");
     }else {
    	 
    	 System.out.println("correct title is not google");
    	 log.info("correct title is google and test case is Failed");
     }
}
}
