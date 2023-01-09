package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage {

	
WebDriver driver; 

	
	public  HeaderPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement cancel;
	
		
	@FindBy(linkText="Men's T-Shirts")
	WebElement Fashion;
	
		
	@FindBy(linkText="All")
	WebElement Home;
	
	
	@FindBy(xpath="//div[contains(text(),'Top Offers')]")
	WebElement offer;
	
	
	@FindBy(linkText="Electric Vehicles")
	WebElement vehicle;
	
	
	@FindBy(linkText="Become a Seller")
	WebElement bestSeller;
	
	
	@FindBy(name="registrationNumber")
	WebElement mob_no;
	
	
	@FindBy(xpath="//div[contains(text(),'Start Selling')]")
	WebElement selling;
	
	
	@FindBy(name="email")
	WebElement email;
	
	
	@FindBy(name="gst")
	WebElement GST;
	
	
	@FindBy(xpath="//span[contains(text(),'Register & Continue')]")
	WebElement register;
	
	
	public void cancels() {
		
		cancel.click();	
	}
	
	public void choose_Fashion() throws InterruptedException {
		Actions action =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		Fashion.click();
		Thread.sleep(2000);
	}
	
	public void Select_All() throws InterruptedException {
		
		Actions action =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[2]/div[1]/div[1]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		Home.click();
		Thread.sleep(3000);
	}
	
	public void Click_on_topOffer() throws InterruptedException {
		
		offer.click();
		Thread.sleep(3000);
	}
	
	public void Click_on_MotorVehicle() throws InterruptedException {
		
		Actions action =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[10]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		vehicle.click();
		Thread.sleep(2000);
	}
	
	public void Click_on_BestSeller() throws InterruptedException {

		bestSeller.click();
		Thread.sleep(2000);
	}
	
	public void Enter_mob_no(String mob) throws InterruptedException {

		mob_no.sendKeys(mob);
		Thread.sleep(2000);
	}
	
	
	public void Click_on_StartSelling() throws InterruptedException {
		
		selling.click();
		Thread.sleep(2000);
	}
	
	public void Enter_on_Email(String emails) throws InterruptedException {
		
		email.sendKeys(emails);
		Thread.sleep(2000);
	}
	
	public void Enter_GST(String GSTNO) throws InterruptedException {
		
		GST.sendKeys(GSTNO);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,200)","");
    	Thread.sleep(2000);
	}
	
	public void Click_on_Register() throws InterruptedException {
	
		register.click();
		Thread.sleep(2000);
	}
	
}
