package testcases;

import org.testng.annotations.Test;
import basePack.BaseClass;
import basePack.Log4j;

public class TestDropBox extends BaseClass{

	//private WebDriver driver = new FirefoxDriver();
	@Test
	public void WorkStride_Test(){

		driver.get("http://www.workstride.com");
		Log4j.APPLICATION_LOG.debug("The page title is: " + driver.getTitle());

	}


	@Test
	public void facebook_Test(){
		driver.get ("http://www.facebook.com");
		Log4j.APPLICATION_LOG.debug("The page title is: " +driver.getTitle());

	}

}