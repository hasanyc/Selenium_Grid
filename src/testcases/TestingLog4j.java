package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import basePack.Log4j;


public class TestingLog4j  {
	

	
	@Test
	public void testinTest (){
			
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.workstride.com");
		Log4j.APPLICATION_LOG.debug("Test started");
		System.out.println ("Testing work stide page title");
		System.out.println (driver.getTitle());
		Log4j.APPLICATION_LOG.debug("Page Title is: " +driver.getTitle());
		Log4j.APPLICATION_LOG.debug("Test Ended");		
		driver.quit();
	}
}