package basePack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class GridBase {

	protected WebDriver driver;

	
	@BeforeClass
	@Parameters ({"browser"})
	public void  tearUp (String browser) throws MalformedURLException{
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
		driver = new RemoteWebDriver(new URL ("http://192.168.0.155:4444/wd/hub"), cap); // Local PC - HUB PC
		//driver = new RemoteWebDriver(new URL ("http://192.168.0.227:5557/wd/hub"), cap);


	}

	@AfterClass
	public void tearDown (){
		driver.close();
		driver.quit();
	}
	
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
	
}
