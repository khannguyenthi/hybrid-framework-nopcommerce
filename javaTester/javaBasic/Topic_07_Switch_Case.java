package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_07_Switch_Case {
	WebDriver driver; 
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	@Parameters("browser")
	//@Test
	public void TC_01(String browserName) {
		driver = getBrowserDrivers(browserName);
		System.out.println(browserName);
		
		driver.quit();
	}
	
	public WebDriver getBrowserDrivers(String browserName) {
		switch (browserName) {
		case "chrome":
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		return new ChromeDriver();
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			return new FirefoxDriver();	
}
		return driver;
	}
	
	//@Test
	public void TC_Switch_Month_02() {
		int month = scanner.nextInt();
		switch (month) {
		case 1:
			break;
		case 3:
			break;
		case 5:
		case 7:
		case 8:
			System.out.println("Thang co 31 days");
		case 2:
			System.out.println("Thang co 28 days");
		default:
			System.out.println("Nhap 1 - 12 only");
			
		}
	}
	// @Test
	  public void TC_Switch_Number_03() {
		  int month = scanner.nextInt();
		  switch (month) {
		  case 1:
			  System.out.println("One");
			  break;
		  case 2:
			  System.out.println("Two");
			  break;
			  
		  case 3:
			  System.out.println("Three");
			  break;
		  default:
			  System.out.println("Ko phai so");
			  break;
		// Switch - case thì ko xử lý dk dc như if else (check trùng lặp)
			  // chi nhan int/string/ enum
			  // ko dùng voi toan tử == != > <
		  }
	  }
	  }
	
