package javaBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import commons.BaseTest;

@Listeners(commons.MethodListener.class)
public class Topic_17_Assert extends BaseTest{
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
		//Login Page Url matching
		System.out.println("Assert 01");
		String loginPageUrl = driver.getCurrentUrl();
		//assertEquals(loginPageUrl, "https://www.facebook.com/");
		verifyEquals(loginPageUrl, "https://www.facebook.com/");
		     
		// Login Page title
		System.out.println("Assert 02 - failed");
		String loginPageTitle = driver.getTitle();
		verifyEquals(loginPageTitle, "Facebook – log in or sign up...");
		
		// Login form displayed
		System.out.println("Assert 03 - Pass");
		verifyTrue(driver.findElement(By.xpath("//form[@data-testid='royal_login_form']")).isDisplayed());

		System.out.println("Assert 04 - Failed");
		assertTrue(driver.findElement(By.xpath("//input[@name='login_source']")).isDisplayed());
		
		System.out.println("Assert 05 - Pass");
		assertTrue(driver.findElement(By.xpath("//div[@id='reg_pages_msg']")).isDisplayed());
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
}