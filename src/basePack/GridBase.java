package basePack;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;

public class GridBase {

	protected WebDriver driver;


	@BeforeMethod
	@Parameters ({"browser"})
	public void  startUp (String browser) throws MalformedURLException{
		System.out.println ("************************************* Hasan " + browser);
		DesiredCapabilities cap = null;


		if(browser.equals("firefox")){
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox"); // chrome,iexplore
			cap.setPlatform(Platform.ANY);
		}else if (browser.equals("chrome")){
			cap = DesiredCapabilities.chrome(); // no need path of chrome exe
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}else if (browser.equals("iexplore")){
			cap = DesiredCapabilities.internetExplorer(); // no need path of chrome exe
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.WINDOWS);
		}
		// Remote WebDriver
		driver = new FirefoxDriver();
		//driver = new RemoteWebDriver(new URL ("http://localhost:4444/wd/hub"), cap); // Local PC - HUB PC
		//driver = new RemoteWebDriver(new URL ("http://remotePC-IP:NODE-#/wd/hub"), cap);

	}

	@BeforeTest
    public void beforeTest (final ITestContext testContext) {
        //String testName = method.getName(); 
        Log4j.APPLICATION_LOG.debug("=======================================================================");
        Log4j.APPLICATION_LOG.debug("Test Method is: ==>" +testContext.getName() + " just STARTED");
    }
	
	@AfterTest
    public void afterTest (final ITestContext testContext) {
    
        //String testName = method.getName(); 
        Log4j.APPLICATION_LOG.debug("=======================================================================");
        Log4j.APPLICATION_LOG.debug("Test Method is: ==>" +testContext.getName()+ " just ENDED!!");
        Log4j.APPLICATION_LOG.debug("=======================================================================");
    }
	
	
	@AfterMethod 
	public void broseClose (){
		driver.close();
	}



	@AfterClass
	public void tearDown (){
		driver.quit();
	}

}
