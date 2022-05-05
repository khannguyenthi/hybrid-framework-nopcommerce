package com.hrm.employee;

import org.testng.annotations.Test;

import commons.BasePage;
import commons.BaseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_19_Live_Coding extends BaseTest{
	
	 @Parameters({"browser","url"})
	 @BeforeClass 
	  public void beforeClass(String browserName, String appUrl) {
		 log.info("Pre-condition - Step 01: Open browser '" + browserName + "' and navigate to '" + appUrl + "'");
		 driver = getBrowserDriver(browserName, appUrl);	 
		 
		 log.info("Pre-condition - Step 02: Login with admin role");
		 
	 }

 @Test
  public void Employee_01_Add_New_Employee() {
	 log.info("Add_New_01 - Step 01: Open Employee List Page");
	 
	 log.info("Add_New_01 - Step 01: Open Employee List Page");
	 
  }
 
 
  @Test
  public void Employee_02_Upload_Avatar() { 
	  
  }
  
  @Test
  public void Employee_03_Personal_Details() {
	  
  }
  
  @Test
  public void Employee_04_Contact_Details() {
	  
  }
  
  @Test
  public void Employee_05_Emergency_Contacts() {
	  
  }
 
  @Test
  public void Employee_06_Dependents() {
	  
  }
  
  @Test
  public void Employee_07_Edit_View_Job() {
	  
  }
 
  @Test
  public void Employee_08_Edit_View_Salary() {
	  
  }
  
  @Test
  public void Employee_09_Edit_View_Tax() {
	  
  }
  
  @Test
  public void Employee_10_Qualifications() {
	  
  }
 
  @Test
  public void Employee_11_Search_Employee() {
	  
  }
 
 
 
  @AfterClass(alwaysRun = true)
 	public void afterClass() {
 	  closeBrowserAndDriver();
 	}
  
  private WebDriver driver; 
	
}
