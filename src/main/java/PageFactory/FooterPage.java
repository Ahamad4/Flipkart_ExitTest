package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

	
WebDriver driver; 

	
	public  FooterPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement cancel;
	
	
	@FindBy(linkText="Facebook")
	WebElement fb;
	
		
	@FindBy(linkText="Twitter")
	WebElement tw;
	
				
	@FindBy(linkText="YouTube")
	WebElement YT;
	
		
	@FindBy(linkText="FAQ")
	WebElement FAQoption;
		
	
	@FindBy(xpath="//span[contains(text(),'Help with other issues')]")
	WebElement help;
		
	
	@FindBy(xpath="//div[contains(text(),'I want help with returns & refunds')]")
	WebElement issue;
		
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[5]/div[1]")
	WebElement QA1;
	
	
	@FindBy(xpath="//div[contains(text(),'What is the Flipkart return policy for cash on del')]")
	WebElement QA2;
	
	
	@FindBy(xpath="//div[contains(text(),'What if I miss my Flipkart order pickup?')]")
	WebElement QA3;	
	
	
	@FindBy(linkText="Careers")
	WebElement career;
		
	
	@FindBy(linkText="Jobs @ India")
	WebElement JobLocation;
	
	public void cancels() {
		
		cancel.click();	
	}
	
	public void click_on_facebook() throws InterruptedException {
		
		fb.click();
		Thread.sleep(3000);
	}
	
	public void click_on_Twitter() throws InterruptedException {
		
		tw.click();
		Thread.sleep(6000);
	}	
	
	public void click_on_YouTube() throws InterruptedException {
		
		YT.click();	
		Thread.sleep(3000);
	
	}
	
	public void click_on_FAQ() {
		
		FAQoption.click();
			
	}
	
	public void Select_TypeOf_Issue() {
		
		help.click();
    
	}
	
	public void Select_TypeOf_IssueFacing() {
		
		issue.click();
		
	}
	
	public void Show_Answer() throws InterruptedException {
		
		QA1.click();
		QA2.click();
		QA3.click();
		Thread.sleep(3000);
    
	}
	
	public void click_on_careers() throws InterruptedException {
		
		career.click();
		Thread.sleep(3000);
			
	}
	
	public void Select_JOb_Location() throws InterruptedException {
		
		Actions action =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//header/nav[@id='main-navbar']/div[1]/div[2]/ul[1]/li[3]/a[1]"));
		//WebElement element = driver.findElement(By.cssSelector("body.home.enable-preloader.ng-scope.done-preloader:nth-child(2) div.custdocument:nth-child(1) div.customMinHeightAllPages.customHeightJobview.displayInitially:nth-child(4) div.ng-scope div.ng-scope:nth-child(2) nav.navbar.navbar-default.navbar-fixed-top div.container div.navbar-collapse.collapse.mob-responsive-bg ul.nav.navbar-nav.navbar-right li.dropdown.xs-hidden:nth-child(3) > a.dropdown-toggle"));
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);		
	    JobLocation.click();
	    Thread.sleep(6000);
	
    }
	
}
