package basePack;

import java.net.MalformedURLException;
<<<<<<< HEAD
=======
import java.net.URL;
>>>>>>> 16493d2d409f158039a9b8b788524de6d0ce9882
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

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
<<<<<<< HEAD
		//driver = new RemoteWebDriver(new URL ("http://192.168.0.155:4444/wd/hub"), cap); // Local PC - HUB PC
		//driver = new RemoteWebDriver(new URL ("http://192.168.0.227:5557/wd/hub"), cap);
		driver = new FirefoxDriver();
=======
		driver = new RemoteWebDriver(new URL ("http://localhost:4444/wd/hub"), cap); // Local PC - HUB PC
		//driver = new RemoteWebDriver(new URL ("http://remotePC-IP:NODE-#/wd/hub"), cap);
>>>>>>> 16493d2d409f158039a9b8b788524de6d0ce9882


	}

	@AfterMethod 
	public void broseClose (){
		driver.close();
	}



	@AfterClass
	public void tearDown (){
		driver.quit();
	}

<<<<<<< HEAD
	//	@DataProvider(parallel=true, name="dataProvider")
	//	public Object[][] getData() {
	//		
	//		Object data[][] = new Object[2][1];
	//		// row 1
	//		data[0][0]="chrome";
	//		// row 2
	//		data[1][0]="firefox";
	//				
	//		return data;
	//		
	//	}

=======
>>>>>>> 16493d2d409f158039a9b8b788524de6d0ce9882
}
