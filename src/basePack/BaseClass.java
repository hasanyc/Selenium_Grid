package basePack;


import java.lang.reflect.Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


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
		Log4j.APPLICATION_LOG.debug("==========================================================================================================");
		Log4j.APPLICATION_LOG.debug("Test Method is: ==> " +testName+ " just S-T-A-R-T-E-D");
		Log4j.APPLICATION_LOG.debug("==========================================================================================================");
	}

	@AfterMethod 
	public void broseClose (Method method){
		String testName = method.getName();
		Log4j.APPLICATION_LOG.debug("==========================================================================================================");
		Log4j.APPLICATION_LOG.debug("Test Method is: ==> " +testName+ " just E-N-D-E-D");
		Log4j.APPLICATION_LOG.debug("==========================================================================================================");
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


