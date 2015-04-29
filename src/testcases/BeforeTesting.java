package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;
import basePack.Log4j;

public class BeforeTesting extends BaseClass {

	@Test ()
	public void  Gmail_Test () throws MalformedURLException{

		driver.get("http://gmail.com");
		System.out.println ("Gmail e aschilam...tumi kinto dekho nai");
		driver.findElement(By.id("Email")).sendKeys("test");
		driver.findElement(By.id("Passwd")).sendKeys("sdaf");
		Log4j.APPLICATION_LOG.debug("TESTING GMAIL");
			
	}



	@Test ()
	public void SpaFinder_Test () throws MalformedURLException {
		driver.get("http://www.spafinder.com");
		Log4j.APPLICATION_LOG.debug("The page title is: " +driver.getTitle());
		
	}
	
	@Test ()
	public void failingTest () throws Exception{
		driver.get("http://www.workstride.com/contact-corporate-rewards/");
		String xyx = "//input[@name='first-nameZxx']"; // this
		Assert.assertTrue(typeByXpath (xyx, "hasan"));
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