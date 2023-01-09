package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFuctionality_Page {

WebDriver driver; 

	
	public  SearchFuctionality_Page(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement cancel;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement Search;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	WebElement searching;
	
	
	//@FindBy(xpath="//div[contains(text(),'SONY Bravia 125.7 cm (50 inch) Ultra HD (4K) LED S')]")
	@FindBy(css="#container > div > div._36fx1h._6t1WkM._3HqJxg > div._1YokD2._2GoDe3 > div:nth-child(2) > div:nth-child(3) > div > div > div > a > div._3pLy-c.row > div.col.col-7-12 > div._4rR01T")
	WebElement Select;
	
	
	@FindBy(xpath="//button[contains(text(),'Read More')]")
	WebElement specification;
	
	
	@FindBy(xpath="/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
	WebElement Home;
	
		
	@FindBy(css="div._36fx1h._6t1WkM._3HqJxg div._1YokD2._2GoDe3:nth-child(1) div._1YokD2._3Mn1Gg:nth-child(2) div._1AtVbE.col-12-12:nth-child(2) div._13oc-S div._4ddWXP a._2rpwqI div:nth-child(1) div:nth-child(1) div.CXW8mj > img._396cs4")
	WebElement itemselect;
	
		
	@FindBy(xpath="//label[contains(text(),'Compare')]")
	//@FindBy(css="div._2c7YLP.UtUXW0._6t1WkM._3HqJxg div._1YokD2._2GoDe3 div._1YokD2._3Mn1Gg.col-8-12:nth-child(2) div._1YokD2._2GoDe3:nth-child(1) div._1AtVbE.col-12-12:nth-child(2) div._3PzNI-._3EPyR5 span.f3A4_V label._2iDkf8 > div._24_Dny")
	WebElement compare;
	
	
	@FindBy(xpath="//span[contains(text(),'COMPARE')]")
	WebElement compare1;
	
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
	WebElement brand;

	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
	//@FindBy(linkText="A S Enterprises")
	WebElement Brandname;
	
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]")
	WebElement product;

	
	@FindBy(xpath="//div[contains(text(),'0beet NB extra bass Music 1 Bluetooth Headset')]")
	WebElement Productname;
	
	
	@FindBy(css="div._36fx1h._6t1WkM._3HqJxg div._1YokD2._2GoDe3:nth-child(1) div._1YokD2._3Mn1Gg:nth-child(2) div._1AtVbE.col-12-12:nth-child(2) div._13oc-S div._4ddWXP a._2rpwqI div:nth-child(1) div:nth-child(1) div.CXW8mj > img._396cs4")
	WebElement howeritem;
	
	
	@FindBy(xpath="//a[contains(text(),'Me-billa Cubes 3x3 High Speed Sticker Less Magic P')]")
	//@FindBy(css="div._36fx1h._6t1WkM._3HqJxg div._1YokD2._2GoDe3:nth-child(1) div._1YokD2._3Mn1Gg:nth-child(2) div._1AtVbE.col-12-12:nth-child(2) div._13oc-S div._1xHGtK._373qXS a._2UzuFa div:nth-child(1) div:nth-child(1) div._3ywSr_ div._312yBx.SFzpgZ > img._2r_T1I")
	WebElement items;
	
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/img[1]" + 
			"")
	WebElement hower;
	
	public void cancels() {
		
		cancel.click();	
	}
	
	public void search_bar(String item) {
		
		Search.sendKeys(item);	
	}	
	
	public void search_btn() {
		
		searching.click();
	}
	
	public void Select_item() {
		
		Select.click();
	}
	
    public void Read_More() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2300)","");
		Thread.sleep(3000);
		specification.click();
		js.executeScript("window.scrollBy(0,400)","");
	}

    public void BackToHome() {
		
		Home.click();
	}

    public void Click_on_product() {
		
		itemselect.click();
	}

    public void compare_item() {
		
		compare.click();
	}

    public void compare1_item() {
		
		compare1.click();
	}

    public void chooseBrand_for_Compare() throws InterruptedException {
		
		brand.click();
		Thread.sleep(3000);
		Brandname.click();
	}

    public void chooseProduct_for_Compare() throws InterruptedException {
		
		product.click();
		Thread.sleep(3000);
		Productname.click();	
	}

    public void Click_on_item() throws InterruptedException {
		
		howeritem.click();
		Thread.sleep(3000);
	}

    public void choose_item() throws InterruptedException {
		
		items.click();
		Thread.sleep(2000);
	}
    
	public void Hower_on_product() throws InterruptedException {
		
		Actions action =new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/img[1]"));
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		
		hower.click();
		Thread.sleep(3000);
		
		
	}
		
	
}
