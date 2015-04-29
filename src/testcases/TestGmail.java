package testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePack.GridBase;
import basePack.Log4j;

public class TestGmail extends GridBase {

	@Test 
	public void  gmailTest () throws MalformedURLException{

		driver.get("http://gmail.com");
		Log4j.APPLICATION_LOG.debug("Page Title is: " + driver.getTitle());
		System.out.println ("Gmail e aschilam...tumi kinto dekho nai");
		driver.findElement(By.id("Email")).sendKeys("test");
		driver.findElement(By.id("Passwd")).sendKeys("sdaf");

		
	}


}