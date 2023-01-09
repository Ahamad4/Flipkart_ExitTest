package PageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelPage {

	
WebDriver driver; 

	
	public  TravelPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement cancel;
	
		
	@FindBy(xpath="//div[contains(text(),'Travel')]")
	WebElement Travel;
	
		
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[2]/div[1]\r\n" + 
			"")
	WebElement TwoWay;
	
			
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement city1;
	//@FindBy(css="div._2I_P4n._6t1WkM._3HqJxg div._1AtVbE.col-12-12:nth-child(1) div._3-tSyS._36bm8T div._3XCEEm div._1dTDqB div._2ffI1H form._1DLh40 div._2NKqZI div._3REAgv div._1OSdiW:nth-child(1) div.GTbXbG div._1fa_Yn.HQlQNF._18Y7Fu div._24hoQ2._1EzOls div._3uA4ax:nth-child(2) > div._2B0KQx:nth-child(2)")
	
	
	@FindBy(xpath="//div[contains(text(),'PNQ')]")
	WebElement Selectcity1;
	
	
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement city2;
	//@FindBy(css="div._2I_P4n._6t1WkM._3HqJxg div._1AtVbE.col-12-12:nth-child(1) div._3-tSyS._36bm8T div._3XCEEm div._1dTDqB div._2ffI1H form._1DLh40 div._2NKqZI div._3REAgv div._1OSdiW:nth-child(3) div.GTbXbG div._1fa_Yn.HQlQNF._18Y7Fu div._24hoQ2._1EzOls div._3uA4ax:nth-child(3) > div._2B0KQx:nth-child(2)")
	
	
	@FindBy(xpath="//div[contains(text(),'DEL')]")
	WebElement Selectcity2;
	
	@FindBy(name="0-dateto")
	WebElement RDate;
	
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/button[1]")
	WebElement date;
	
		
	@FindBy(xpath="//span[contains(text(),'SEARCH')]")
	WebElement Search;
	
	public void cancels() {
		
		cancel.click();	
		
	}
	
	public void Click_On_Travel() throws InterruptedException {
		
		Travel.click();	
		Thread.sleep(1500);
	}
	
	public void Click_On_twoWAY() throws InterruptedException {
		
		TwoWay.click();	
		Thread.sleep(2000);
	}
	
	public void From_city(String From) throws InterruptedException {
		
		city1.sendKeys(From);	
		Thread.sleep(2000);
		Selectcity1.click();
		Thread.sleep(2000);
	}
	
	public void To_city(String TO) throws InterruptedException {
		
		city2.sendKeys(TO);
		Thread.sleep(2000);
		Selectcity2.click();
		Thread.sleep(2000);
	}
	
	public void Return_Date() throws InterruptedException {
		
		RDate.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,200)","");
    	Thread.sleep(2000);
		date.click();
		Thread.sleep(2000);
	}
	
	public void Sreach_Flight() throws InterruptedException {
		Search.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,500)","");
    	Thread.sleep(3000);
	}
	
}
