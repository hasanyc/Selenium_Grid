package learnListener;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.manage().window().maximize();

	}

	@Test (priority = 1)
	public void iAmPassing(){
		driver.get("http://www.workstride.com");
		System.out.println ("Testing work stide page title");
		System.out.println (driver.getTitle());

	}

	@Test ( priority = 2 )
	public void iAmFailing (){

		try{
			Assert.assertEquals("A", "Y");
			Log4j.APPLICATION_LOG.debug("iAmFailing Test  Method Passed");
		} catch (NoSuchElementException e){
			Assert.assertEquals("A", "Y");
			Log4j.APPLICATION_LOG.debug("iAmFailing Test  Method failed" + e);
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