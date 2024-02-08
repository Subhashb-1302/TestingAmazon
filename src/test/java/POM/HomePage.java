package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath="//div[@id='priceRefinements']//div[@id='p_36-title']")
	WebElement price;
	
	@FindBy(xpath="//*[@id=\"p_36/3439817031\"]/span/a/span")
	WebElement under2000;
	
	
	public void searchBox() {
		searchBox.sendKeys("Watch");
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	public void under2000() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", price);
		
		under2000.click();
	}

}
