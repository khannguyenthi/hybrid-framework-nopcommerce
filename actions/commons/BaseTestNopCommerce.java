package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestNopCommerce {
	private WebDriver driver;
	private String projectPath = System.getProperty("user.dir");
	
	protected WebDriver getBrowserDriver(String browserName) {
		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
		
		 if(browserList == BrowserList.FIREFOX) {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 } 
		 else if (browserList == BrowserList.H_FIREFOX) {
			 WebDriverManager.firefoxdriver().setup();
			 FirefoxOptions options = new FirefoxOptions();
			 options.addArguments("--headless");
			 options.addArguments("window-size=1920*1080");
			 driver = new FirefoxDriver(options);
		 }
		 
		 else if(browserList == BrowserList.CHROME) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
		 else if(browserList == BrowserList.H_CHROME) {
			 WebDriverManager.chromedriver().setup();
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("-headless");
			 options.addArguments("window-size=1920*1080");
			 driver = new ChromeDriver(options);
		 }
		 else if(browserList == BrowserList.OPERA) {
			 WebDriverManager.operadriver().setup();
			 driver = new OperaDriver();
		 }
		 else if(browserList == BrowserList.EDGE) {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 } else {
			 throw new RuntimeException("Browser name invalid.");
		 }
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get(GlobalConstants.PORTAL_PAGE_URL);	
		 return driver;
	}
	
	private String getEnvironmentUrl(String serverName) {
		String envUrl = null;
		EnvironmentList environment = EnvironmentList.valueOf(serverName.toUpperCase());
		if(environment == EnvironmentList.DEV) {
			envUrl = "https://demo.nopcommerce.com/";
		} else if (environment == EnvironmentList.TESTING) {
			envUrl = "https://admin-demo.nopcommerce.com/"; 
		} else if (environment == EnvironmentList.STAGING) {
			envUrl = "";
		} else if (environment == EnvironmentList.PRODUCTION) {
			envUrl = "";
		}
		return envUrl;
	}
	
	protected int generateFakeNumber() {
		  Random rand = new Random();
		  return rand.nextInt(9999);
	  }

		
	
}