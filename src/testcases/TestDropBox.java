package testcases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import basePack.GridBase;
import basePack.Log4j;

public class TestDropBox extends GridBase{

	//private WebDriver driver = new FirefoxDriver();
	@Test
	public void dropBox() throws MalformedURLException{
		
		Log4j.APPLICATION_LOG.debug("Dropbox Test started");
		driver.get("http://www.dropbox.com");
		System.out.println (driver.getTitle());
		Log4j.APPLICATION_LOG.debug("Dropbox Test E-N-D-E-D");
		
	}
	
	
	@Test
	public void facebookTest(){
		Log4j.APPLICATION_LOG.debug("Facebook Test Started");
		driver.get ("http://www.facebook.com");
		System.out.println (driver.getTitle());
		Log4j.APPLICATION_LOG.debug("Facebook Test E-N-D-E-D");
	
}

}