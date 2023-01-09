package PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicTestPage {
	
WebDriver driver; 
	
	public  BasicTestPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement cancel;
	
		
	@FindBy(linkText="Login")
	WebElement Login;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement text;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement otp;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement Search;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	WebElement searching;
	
	
	public void cancels() {
		
		cancel.click();	
	}
	
	public void Login_btn() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Login.click();	
		Thread.sleep(2000);
	}
	
    public void Enter_Mob(String mob) throws InterruptedException {
		
		text.sendKeys(mob);	
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

    public void Request_otp() {
		
		otp.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

    public void search_bar(String item) throws InterruptedException {
		
		Search.sendKeys(item);	
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}	

	public void search_btn() throws InterruptedException {
		
		searching.click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}

}
