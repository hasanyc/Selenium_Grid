package learnListener;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basePack.Log4j;

public class TestingListener {

	// How to add log
	// How to add Listener
	// How to prioritize the test cases
	// How to skip a test
	// Note: to fix the code format, hit Ctrl+A (Select all codes) and Ctrl+I (make sure all codes are selected)

	public WebDriver driver;

	@BeforeClass
	public void tearUP () {
		driver = new FirefoxDriver();
	}


	@Test (priority = 1)
	public void testinTest (){
		driver.get("http://www.workstride.com");
		Log4j.APPLICATION_LOG.debug("Test started");
		System.out.println ("Testing work stide page title");
		System.out.println (driver.getTitle());
		Log4j.APPLICATION_LOG.debug("Page Title is: " +driver.getTitle());
		Log4j.APPLICATION_LOG.debug("Test E-n-d-e-d");		
	}

	@Test ( priority = 2 )
	public void failTest (){
		Assert.assertEquals("A", "Y");
	}

	@Test (enabled=false )
	public void testingSkipping (){
		Assert.assertEquals("skip", "Y");
	}

	@Test ( priority = 4 )
	public void tryCatch (){
		try {
			Assert.assertEquals("Hasan", "rifa");
			Log4j.APPLICATION_LOG.debug("tryCatch test is passed");
		}catch (Throwable t){
			Log4j.APPLICATION_LOG.debug("tryCatch Test failed and error is: ==>> " + t);
			ErrorUtil.addVerificationFailure(t);
		}
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