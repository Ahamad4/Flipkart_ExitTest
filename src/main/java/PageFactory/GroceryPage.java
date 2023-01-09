package PageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GroceryPage {

WebDriver driver; 

	
	public  GroceryPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement cancel;
	
		
	@FindBy(xpath="//div[contains(text(),'Grocery')]")
	WebElement Grocery;
	
	
	//@FindBy(name="pincode")
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/div/div[1]/form/input")
	WebElement pincodes;
	

	@FindBy(linkText="Ghee & Oils")
	WebElement staples;
	
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[2]/span[1]")
	WebElement Add;
	
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/button[2]/span[1]")
	WebElement Add_More;
	
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/span[1]")
	WebElement basket;
	
		
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]/span[1]")
	WebElement add1;
	

	@FindBy(linkText="All")
	WebElement All;
	
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[1]/div[1]/label[1]")
	WebElement Filter1;
	
	@FindBy(xpath="//div[contains(text(),'Melina')]")
	//@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/section[3]/div[2]/div[1]/div[6]/div[1]/label[1]/div[1]")
	WebElement Filter2;
	
	
	@FindBy(xpath="//div[contains(text(),'POLYSET')]")
	WebElement Filter3;
	
	
	@FindBy(xpath="//div[contains(text(),'4★ & above')]")	
	WebElement RatingFilter;
	
	
	@FindBy(xpath="//div[contains(text(),'Special Price')]")	
	WebElement PriceFilter;
	
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/section[6]/div[1]/div[1]")
	WebElement Discount;
	
	
	@FindBy(xpath="//div[contains(text(),'50% or more')]")
	WebElement Disc;
	
	
	@FindBy(xpath="//div[contains(text(),'Availability')]")
	WebElement Avail;
	
	
	@FindBy(xpath="//div[contains(text(),'Include Out of Stock')]")
	WebElement Availability;

    
	@FindBy(xpath="//span[contains(text(),'more')]")
	WebElement Show;
	
	
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	WebElement cart;
	
	public void cancels() {
		
		cancel.click();	
	}
	
	public void Grocery_Item() throws InterruptedException {
		Grocery.click();
		Thread.sleep(2000);
		
    }
	
	public void Enter_PinCode(String pin) {
		
		pincodes.sendKeys(pin);
		pincodes.sendKeys(Keys.RETURN);
    }
	
	public void staples_item() throws InterruptedException {
		
		staples.click();
		Thread.sleep(2000);
    }
	
	public void Add_oil() throws InterruptedException {
		
		Add.click();
		Thread.sleep(2000);	
    }
	
	public void Add_Ghee() {
		
		Add_More.click();
	}
	
	public void show_basket() throws InterruptedException {
		
		basket.click();
		Thread.sleep(2000);
	}
	
	public void AddforCart1() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)","");
		Thread.sleep(1500);
	    add1.click();
     	Thread.sleep(1500);
	}
	
	public void ChehkGroceryCart() {
	 
		cart.click();	
	}
	
    public void howerOnHomeKitchen() throws InterruptedException {
				
		Actions action =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[7]/a[1]/div[2]/div[1]/div[1]"));
		action.moveToElement(element).build().perform();
		//Thread.sleep(3000);
		All.click();	
	}

	public void Filters() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	    	
		Filter1.click();
	    Thread.sleep(1500);
	    Filter2.click();
	    Thread.sleep(1500);
	    Filter3.click();
	    Thread.sleep(1500);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)","");
	    Thread.sleep(1500);
	    RatingFilter.click();
	    Thread.sleep(1500);  
	    js.executeScript("window.scrollBy(0,400)","");
	    Thread.sleep(1500);
	    PriceFilter.click();
	    js.executeScript("window.scrollBy(0,400)","");
	    Thread.sleep(1500);
	    Discount.click();  	
	    Thread.sleep(1500);
	    Disc.click();
	    Thread.sleep(1500);
	    js.executeScript("window.scrollBy(0,400)","");
	   	Avail.click();
	   	Thread.sleep(1500);
	   	Availability.click();
	   	Thread.sleep(1500);
	   	    	
	}

    public void ShowAppliedFilter() {
    	
    	Show.click();
    }
    
}


	
