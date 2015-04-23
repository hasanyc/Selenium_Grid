package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basePack.BaseClass;
import basePack.Log4j;

public class BeforeTesting extends BaseClass {

	@Test (description = "Gmail Test")
	public void  gmailTest () throws MalformedURLException{

		driver.get("http://gmail.com");
		System.out.println ("Gmail e aschilam...tumi kinto dekho nai");
		driver.findElement(By.id("Email")).sendKeys("test");
		driver.findElement(By.id("Passwd")).sendKeys("sdaf");
		Log4j.APPLICATION_LOG.debug("| My logs is: - TESTING GMAIL");
			
	}



	@Test ()
	public void hasanTest () throws MalformedURLException{

		driver.get("http://www.facebook.com");
		Log4j.APPLICATION_LOG.debug("| My logs is: - facebook test");
			
	}
	
}