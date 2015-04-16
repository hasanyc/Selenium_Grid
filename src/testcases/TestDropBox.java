package testcases;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import basePack.GridBase;

public class TestDropBox extends GridBase{

	@Test
	public void dropBox() throws MalformedURLException{
		
		driver.get("http://www.dropbox.com");
		System.out.println (driver.getTitle());
		
	}
	
	
	@Test
	public void facebookTest(){
		driver.get ("http://www.facebook.com");
		System.out.println (driver.getTitle());
	}
	
}

