package com.nopcommerce.user;

import org.testng.annotations.Test;

import commons.BasePage;
import pageObject.HomePageObject;
import pageObject.RegisterPageObject;

import org.testng.annotations.BeforeClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_03_Page_Object extends BasePage{
	private WebDriver driver; 
	private String projectPath = System.getProperty("user.dir");
	private String emailAddress, firstName, lastName, password;
	private HomePageObject homePage; 
	private RegisterPageObject registerPage;

	 @BeforeClass 
	  public void beforeClass() {
		 System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 System.out.println("Driver at class test = " + driver.toString());
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://demo.nopcommerce.com/");	 
		 
		 homePage = new HomePageObject(driver);
		 registerPage = new RegisterPageObject(driver);
		 
		 emailAddress = "khan" + generateFakeNumber() + "@gmail.com";
		 firstName = "Khan";
		 lastName = "Auto";
		 password = "123456";
		 
	 }

 //@Test
  public void TC_01_Register_Empty_Data() {
	 
	 System.out.println("Home page + Step 01: Click to Register link");
	 homePage.clickToRegisterLink(); 
	 
	 System.out.println("Register page + Step 02: Click to Regiser button");
	 registerPage.clickToRegisterButton();
	  
	 
	 System.out.println("Register page + Step 03: Verify error message displayed");
	  Assert.assertEquals(registerPage.getErrorMessageAtFirstNameTextbox(), "First name is required.");
	  Assert.assertEquals(registerPage.getErrorMessageAtLastNameTextbox(), "Last name is required.");
	  Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(), "Email is required.");
	  Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(), "Password is required.");
	  Assert.assertEquals(registerPage.getErrorMessageAtConfirmPasswordTextbox(), "Password is required.");  
  }
  
   //@Test
  public void TC_02_Register_Invalid_Email() {
	  System.out.println("Home page + Step 01: Click to Register link");
	  homePage.clickToRegisterLink(); 
	  
	  System.out.println("Register Page + Step 02: Input  to required fields");
	  registerPage.inputToFirstNameTextbox(firstName);
	  registerPage.inputToLastNameTextbox(lastName);
	  registerPage.inputToEmailTextbox("2342342343");
	  registerPage.inputToPasswordTextbox(password);
	  registerPage.inputToConfirmPasswordTextbox(password);
	  
	  System.out.println("Register page + Step 03: Click to Regiser button");
	  registerPage.clickToRegisterButton();
	  
	  System.out.println("Register page + Step 04: Verify error message displayed at Email");
	  Assert.assertEquals(registerPage.getErrorMessageAtEmailTextbox(), "Wrong email");  
  }
  
 @Test
  public void TC_03_Register_Success() {
	  System.out.println("Home page + Step 01: Click to Register link");
	  homePage.clickToRegisterLink(); 
	  
	  System.out.println("Register Page + Step 02: Input  to required fields");
	  registerPage.inputToFirstNameTextbox(firstName);
	  registerPage.inputToLastNameTextbox(lastName);
	  registerPage.inputToEmailTextbox(emailAddress);
	  registerPage.inputToPasswordTextbox(password);
	  registerPage.inputToConfirmPasswordTextbox(password);
	  
	  System.out.println("Register page + Step 03: Click to Regiser button");
	  registerPage.clickToRegisterButton();

	  System.out.println("Register page + Step 04: Verify success message displayed");
	  Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");  
	  
	  //System.out.println("Register page + Step 05: Click to Logout link");
	  //registerPage.clickToLogoutLink();
	  
  }
  
  //@Test
  public void TC_04_Register_Existing_Email() {
	  System.out.println("Home page + Step 01: Click to Register link");
	  homePage.clickToRegisterLink(); 
	  
	  System.out.println("Register Page + Step 02: Input  to required fields");
	  registerPage.inputToFirstNameTextbox(firstName);
	  registerPage.inputToLastNameTextbox(lastName);
	  registerPage.inputToEmailTextbox(emailAddress);
	  registerPage.inputToPasswordTextbox(password);
	  registerPage.inputToConfirmPasswordTextbox(password);
	  
	  System.out.println("Register page + Step 03: Click to Regiser button");
	  registerPage.clickToRegisterButton();
	  
	  System.out.println("Register page + Step 04: Verify error message displayed at Email");
	  Assert.assertEquals(registerPage.getErrorExistingEmailMessage(), "The specified email already exists");  
  }
  
  //@Test
  public void TC_05_Register_Password_Less_Than_6_Chars() {
	  System.out.println("Home page + Step 01: Click to Register link");
	  homePage.clickToRegisterLink(); 
	  
	  System.out.println("Register Page + Step 02: Input  to required fields");
	  registerPage.inputToFirstNameTextbox(firstName);
	  registerPage.inputToLastNameTextbox(lastName);
	  registerPage.inputToEmailTextbox(emailAddress);
	  registerPage.inputToPasswordTextbox("123");
	  registerPage.inputToConfirmPasswordTextbox("123");
	  
	  System.out.println("Register page + Step 03: Click to Regiser button");
	  registerPage.clickToRegisterButton();
	  
	  System.out.println("Register page + Step 04: Verify error message displayed at Password");
	  Assert.assertEquals(registerPage.getErrorMessageAtPasswordTextbox(), "Password must meet the following rules:\n"
		  		+ "must have at least 6 characters");  
	  
  }
  
  @Test
  public void TC_06_Register_Invalid_Confirm_Confirm_Password() {
	  System.out.println("Home page + Step 01: Click to Register link");
	  homePage.clickToRegisterLink(); 
	  
	  System.out.println("Register Page + Step 02: Input  to required fields");
	  registerPage.inputToFirstNameTextbox(firstName);
	  registerPage.inputToLastNameTextbox(lastName);
	  registerPage.inputToEmailTextbox(emailAddress);
	  registerPage.inputToPasswordTextbox(password);
	  registerPage.inputToConfirmPasswordTextbox("123456999");
	  
	  System.out.println("Register page + Step 03: Click to Regiser button");
	  registerPage.clickToRegisterButton();
	  
	  System.out.println("Register page + Step 04: Verify error message displayed at Confirm Password");
	  
	  Assert.assertEquals(registerPage.getErrorMessageAtConfirmPasswordTextbox(), "The password and confirmation password do not match.");    
  }
 
  //@Test
  public void TC_11_Login_With_Empty_Data() {
	  waitForElementVisible(driver, "//a[@class='ico-login']");
	  clickToElement(driver, "//a[@class='ico-login']");
	 
	  waitForElementVisible(driver, "//button[contains(@class,'login-button')]");
	  clickToElement(driver, "//button[contains(@class,'login-button')]");
	  
	  Assert.assertEquals(getElementText(driver, "//span[@id='Email-error']"), "Please enter your email");      
  }
  //@Test
  public void TC_12_Login_With_Invalid_Email() {
	  waitForElementVisible(driver, "//a[@class='ico-login']");
	  clickToElement(driver, "//a[@class='ico-login']");
	  
	  sendkeyToElement(driver, "//input[@id='Email']", "Automation");
	  sendkeyToElement(driver, "//input[@id='Password'] ", "Testing");
	  
	  waitForElementVisible(driver, "//button[@class='button-1 login-button']");
	  clickToElement(driver, "//button[@class='button-1 login-button']");
	  
	  Assert.assertEquals(getElementText(driver, "//span[@id='Email-error']"), "Wrong email");      
  }
  //@Test
  public void TC_13_Login_With_Not_Yet_Register_Email() {
	  waitForElementVisible(driver, "//a[@class='ico-login']");
	  clickToElement(driver, "//a[@class='ico-login']");
	  
	  sendkeyToElement(driver, "//input[@id='Email']", "Fake_Automation@gmail.com");
	  sendkeyToElement(driver, "//input[@id='Password'] ", "123456");
	  
	  waitForElementVisible(driver, "//button[@class='button-1 login-button']");
	  clickToElement(driver, "//button[@class='button-1 login-button']");
	  
	  Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\n"
			  + "No customer account found");      
  }
  //@Test
  public void TC_14_Login_With_Valid_Email_And_Empty_Password() {
	  
	  waitForElementVisible(driver, "//a[@class='ico-register']");
	  clickToElement(driver, "//a[@class='ico-register']");
	  
	  sendkeyToElement(driver, "//input[@id='FirstName']", "Automation");
	  sendkeyToElement(driver, "//input[@id='LastName']", "Testing");
	  sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
	  sendkeyToElement(driver, "//input[@id='Password']", "123456");
	  sendkeyToElement(driver, "//input[@id='ConfirmPassword']", "123456");
	  
	  waitForElementVisible(driver, "//button[@id='register-button']");
	  clickToElement(driver, "//button[@id='register-button']");
	  
	  Assert.assertEquals(getElementText(driver, "//div[@class='result']"), "Your registration completed");  
	  
	  waitForElementVisible(driver, "//a[@class='ico-logout']");
	  clickToElement(driver, "//a[@class='ico-logout']");
	  
	  
	  waitForElementVisible(driver, "//a[@class='ico-login']");
	  clickToElement(driver, "//a[@class='ico-login']");
	  
	  sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
	  sendkeyToElement(driver, "//input[@id='Password'] ", "");
	  
	  waitForElementVisible(driver, "//button[@class='button-1 login-button']");
	  clickToElement(driver, "//button[@class='button-1 login-button']");
	  
	  Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\n"
			  + "The credentials provided are incorrect");      
  }
  //@Test
  public void TC_15_Login_With_Valid_Email_And_Wrong_Password() {
	 
	  waitForElementVisible(driver, "//a[@class='ico-login']");
	  clickToElement(driver, "//a[@class='ico-login']");
	 
	  sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
	  sendkeyToElement(driver, "//input[@id='Password'] ", "1234567");
	  
	  waitForElementVisible(driver, "//button[@class='button-1 login-button']");
	  clickToElement(driver, "//button[@class='button-1 login-button']");
	  
	  Assert.assertEquals(getElementText(driver, "//div[@class='message-error validation-summary-errors']"), "Login was unsuccessful. Please correct the errors and try again.\n"
	  		+ "The credentials provided are incorrect");      
  }

  //@Test
  public void TC_16_Login_With_Valid_Email_And_Valid_Password() {
	  
	  waitForElementVisible(driver, "//a[@class='ico-login']");
	  clickToElement(driver, "//a[@class='ico-login']");
	 
	  sendkeyToElement(driver, "//input[@id='Email']", emailAddress);
	  sendkeyToElement(driver, "//input[@id='Password'] ", "123456");
	  
	  waitForElementVisible(driver, "//button[@class='button-1 login-button']");
	  clickToElement(driver, "//button[@class='button-1 login-button']");
	  
	  Assert.assertEquals(getElementText(driver, "//a[@class='ico-account']"), "My account");      
  }

  
  @AfterClass
	public void afterClass() {
		//driver.quit();
	}
  
  public int generateFakeNumber() {
	  Random rand = new Random();
	  return rand.nextInt(9999);
  }

	
}
