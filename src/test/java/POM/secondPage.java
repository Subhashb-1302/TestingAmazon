package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class secondPage extends BasePage{

	public secondPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[normalize-space()='Women']")
	WebElement women;
	
	
	public void women() {
		women.click();
	}
	
}
