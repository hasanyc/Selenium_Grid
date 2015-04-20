package testcases;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basePack.GridBase;

public class TestGmail extends GridBase {

	@Test 
	public void  gmailTest () throws MalformedURLException{

		driver.get("http://gmail.com");
		System.out.println ("Gmail e aschilam...tumi kinto dekho nai");
		driver.findElement(By.id("Email")).sendKeys("test");
		driver.findElement(By.id("Passwd")).sendKeys("sdaf");
		//driver.quit();
	}


}