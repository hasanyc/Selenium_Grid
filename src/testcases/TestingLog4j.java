package testcases;

import org.openqa.selenium.WebDriver;
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
	}


	@Test
	public void testinTest (){


		driver.get("http://www.workstride.com");
		Log4j.APPLICATION_LOG.debug("Test started");
		System.out.println ("Testing work stide page title");
		System.out.println (driver.getTitle());
		Log4j.APPLICATION_LOG.debug("Page Title is: " +driver.getTitle());
		Log4j.APPLICATION_LOG.debug("Test Ended");		

	}

	@AfterClass
	public void tearDown(){
		try {
			driver.quit();
		} 	catch (Exception t){
			System.err.println ("Browser didn't get close. " + t);
		}

	}

}