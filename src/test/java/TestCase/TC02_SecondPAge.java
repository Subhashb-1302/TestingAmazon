package TestCase;

import org.testng.annotations.Test;

import POM.secondPage;
import TestBase.testBase;

public class TC02_SecondPAge extends testBase {

	@Test
	public void secondPagee() {
		secondPage sp=new secondPage(driver);
		sp.women();
	}
	
}
