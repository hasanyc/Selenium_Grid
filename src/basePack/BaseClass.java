package basePack;


import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;


public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void tearUP () {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void beforeMethodTest (Method method){
		String testName = method.getName();
		Log4j.APPLICATION_LOG.debug("=======================================================================");
		Log4j.APPLICATION_LOG.debug("Test Method is: ==>" +testName+ " just Started!!");
		Log4j.APPLICATION_LOG.debug("=======================================================================");
	}

	@AfterMethod 
	public void broseClose (Method method){
		String testName = method.getName();
		Log4j.APPLICATION_LOG.debug("=======================================================================");
		Log4j.APPLICATION_LOG.debug("Test Method is: ==>" +testName+ " just E-N-D-E-D!!");
		Log4j.APPLICATION_LOG.debug("=======================================================================");
	}

	@AfterTest
	public void closeBrowser (){
		driver.close();
	}

	@AfterSuite
	public void tearDown (){
		driver.quit();
	}

}


