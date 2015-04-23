package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePack.Log4j;


public class TestingLog4j  {

	public WebDriver driver;

	
	@BeforeClass
	public void tearUP () {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}


	@Test
	public void testinTest () throws Exception{
	
		Log4j.APPLICATION_LOG.debug("Test S-T-A-R-T");
		driver.get("http://www.workstride.com/contact-corporate-rewards/");
		String xyx = "//input[@name='first-name']";
		typeByXpath (xyx, "hasan");
		Log4j.APPLICATION_LOG.debug("T-E-S-T  P-A-S-S-E-D");
		Log4j.APPLICATION_LOG.debug("Test E-n-d-e-d");		
		Log4j.APPLICATION_LOG.debug("=======================================================================");
	}
	
	@Test ( priority = 2 )
	public void failingTest () throws Exception{
		Log4j.APPLICATION_LOG.debug("Test S-T-A-R-T");
		driver.get("http://www.workstride.com/contact-corporate-rewards/");
		String xyx = "//input[@name='first-nameZxx']"; // this
		typeByXpath (xyx, "hasan");
		Log4j.APPLICATION_LOG.debug("Test E-n-d-e-d");
		Log4j.APPLICATION_LOG.debug("=======================================================================");
	}

	@AfterClass
	public void tearDown(){
		
		driver.quit();
		
	}

	
	public boolean typeByXpath(String locator, String value) throws Exception{
		try{
			WebElement typeByXpath = driver.findElement(By.xpath(locator)); 
			typeByXpath.clear();
			typeByXpath.sendKeys(value);
			return true;
		} catch (NoSuchElementException e){
			System.err.println (e.getMessage());
			Log4j.APPLICATION_LOG.debug("Element not Found and Reason is :==> " + e);
			return false;
		}
	}
}