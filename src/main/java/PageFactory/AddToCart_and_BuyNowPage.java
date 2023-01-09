package PageFactory;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_and_BuyNowPage {

WebDriver driver; 
	
	public  AddToCart_and_BuyNowPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement cancel;
	
	@FindBy(xpath="/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
	WebElement Home;
		
	@FindBy(linkText="Remote Control")
	WebElement electronics;
	   
	@FindBy(xpath="//a[contains(text(),'Tata Sky 100% Original Universal (Works With All T')]")
	WebElement select1;
	    
    @FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
   	WebElement Addtocart;
    
    @FindBy(xpath="//a[contains(text(),'Airtel DTH Remote Compatible with SD and HD Record')]")
	WebElement item;
   
    @FindBy(xpath="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]/span[1]")
    WebElement cart;
        
    @FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/form[1]/button[1]")
    WebElement buy;
    
    public void cancels() {
    		
    	cancel.click();	
    }
        
    public void BackToHome() {
    		
    	Home.click();
    }
        
    public void go_to_electronics() throws InterruptedException {
    		
    	Actions action =new Actions(driver);
    	WebElement element = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[1]/div[1]/img[1]"));
    	action.moveToElement(element).build().perform();
    	Thread.sleep(2000);
    	electronics.click();
    }
        
    public void select_item1_for_AddToCart() throws InterruptedException {
        	
    	Thread.sleep(2000);
        select1.click();
        	
          	
    }
        
    public void click_on_AddToCart() throws InterruptedException {
        	
        Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,400)");
    	Thread.sleep(2000);
        Addtocart.click(); 
        Thread.sleep(2000);
    }
        
    public void select_item_for_Buy() throws InterruptedException {
        	
    	item.click();
        Thread.sleep(2000);
     
    }
        
    public void open_cart() throws InterruptedException {
        	
        cart.click();
        Thread.sleep(2000);
         	
    }

    public void click_on_Buy_Now() throws InterruptedException {

        buy.click();
        Thread.sleep(2000);
           		
    }
        
}
