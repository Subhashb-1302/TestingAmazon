package TestCase;

import org.testng.annotations.Test;

import POM.HomePage;
import TestBase.testBase;

public class TC01_Home extends testBase{
	
	@Test
	public void Home() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		hp.searchBox();
		
		Thread.sleep(2000);
		hp.under2000();
	}

}
