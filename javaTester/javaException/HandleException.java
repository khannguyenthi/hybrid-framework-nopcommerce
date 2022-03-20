package javaException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleException {
	FirefoxDriver driver;
	WebDriverWait explicitWait;
	//@Test
	public void TC01()   {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 explicitWait = new WebDriverWait(driver, 10);
		 
		 driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		 explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ctl00_ContentPlaceholder1_Panel1']")));
		 
		 WebElement dataNotSelected = driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceholder1_Panel1']"));
		 Assert.assertEquals("No Selected Dates to display.", dataNotSelected.getText().trim());
			
		 WebElement today = driver.findElement(By.xpath("//a[text()='2']"));
		 today.click();		 
		 
		 
		 explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='raDiv']")));
	   	 explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='rcSelected']//a[text()='2']")));
			
		
		Assert.assertEquals("Saturday, March 19, 2022", dataNotSelected.getText().trim());	 
	}
	
	@Test
	public void TC02()   {
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		 
		 driver.get("https://automationfc.github.io/basic-form/index.html");
		//driver.findElement(By.cssSelector("#disable_password")).sendKeys("Auto"); 
		driver.switchTo().frame(0);
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
