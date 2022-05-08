package com.hrm.employee;
	
import org.testng.annotations.Test;

import commons.BasePage;
import commons.BaseTest;
import pageObjects.hrm.AddEmployeePO;
import pageObjects.hrm.DashboardPO;
import pageObjects.hrm.EmployeeListPO;
import pageObjects.hrm.LoginPO;
import pageObjects.hrm.PersonalDetailPO;
import pageObjects.hrm.pageGenerator;

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
	String employeeID, statusValue, lastName;
	
	 @Parameters({ "browser", "url" })
	 @BeforeClass 
	  public void beforeClass(String browserName, String appUrl) {
		 log.info("Pre-condition - Step 01: Open browser '" + browserName + "' and navigate to '" + appUrl + "'");
		 driver = getBrowserDriver(browserName, appUrl);	 
		 loginPage = pageGenerator.getLoginPage(driver);
		 driver.manage().window().maximize();
		 
		 
		 statusValue = "Enabled";
		 lastName = "FC";
		 
		 log.info("Pre-condition - Step 02: Login with admin role");
		 loginPage.enterToTextboxByID(driver, "txtUsername", "Admin");
		 loginPage.enterToTextboxByID(driver, "txtPassword", "admin123");
		 loginPage.clickToButtonById(driver, "btnLogin");
		 dashboardPage = pageGenerator.getDashboardPage(driver);
		 
		 
	 }

 @Test
  public void Employee_01_Add_New_Employee() {
	 log.info("Add_New_01 - Step 01: Open 'Employee List' Page");
	 //employeeListPage = dashboardPage.openEmployeeListPage();
	 dashboardPage.openSubMenuPage(driver, "PIM", "Employee List"); 
	 //Do return void nen phai gan lai page & khoi tao trang Employee List
	 //Khoi tao page tu pageGeneratorManager
	 employeeListPage = pageGenerator.getEmployeeListPage(driver);
	 
	 
	 log.info("Add_New_01 - Step 02: Click to 'Add' button");
	 //addEmployeePage = employeeListPage.clickToAddButton();
	 employeeListPage.clickToButtonById(driver, "btnAdd");
	 addEmployeePage = pageGenerator.getAddEmployeePage(driver); //Khoi tao trang Add Employee Page
	 
	 
	 log.info("Add_New_01 - Step 03: Enter valid info to 'First Name' textbox");
	 addEmployeePage.enterToTextboxByID(driver, "firstName", "Automation");
	 
	 
	 log.info("Add_New_01 - Step 04: Enter valid info to 'Last Name' textbox");
	 addEmployeePage.enterToTextboxByID(driver, "lastName", lastName);

	 log.info("Add_New_01 - Step 05: Get value of 'Employee ID'");
	 //employeeID = addEmployeePage.getEmployeeID();
	 employeeID = addEmployeePage.getTextboxValueByID(driver, "employeeId");
	 addEmployeePage.sleepInSecond(3);
	 System.out.println(employeeID);
	 
	 log.info("Add_New_01 - Step 06: Click to 'Create Login Details' checkbox");
	 addEmployeePage.clickToCheckboxByLabel(driver, "Create Login Details");

	 log.info("Add_New_01 - Step 07: Enter valid info to 'User Name' textbox");
	 addEmployeePage.enterToTextboxByID(driver, "user_name", "automationfc");
	 
	 log.info("Add_New_01 - Step 08: Enter valid info to 'Password' textbox");
	 addEmployeePage.enterToTextboxByID(driver, "user_password", "automationfc");
	 
	 log.info("Add_New_01 - Step 09: Enter valid info to 'Confirm Password' textbox");
	 addEmployeePage.enterToTextboxByID(driver, "re_password", "automationfc");
	 
	 log.info("Add_New_01 - Step 10: Select '" + statusValue + "' value in 'Status' dropdown");
	 addEmployeePage.selectItemInDropdownByID(driver, "status", statusValue);
	 
	 log.info("Add_New_01 - Step 11: Click to 'Save' button");
	 //personalDetailPage = addEmployeePage.clickToSaveButton();
	 addEmployeePage.clickToButtonById(driver, "btnSave");
	 personalDetailPage = pageGenerator.getPersonalDetailPage(driver);
	 
	 
	 log.info("Add_New_01 - Step 12: Open 'Employee List' Page after create employee successfully");
	 //employeeListPage = personalDetailPage.openEmployeeListPage();
	 
	 personalDetailPage.openSubMenuPage(driver, "PIM", "Employee List");
	 employeeListPage = pageGenerator.getEmployeeListPage(driver);
	 
	 log.info("Add_New_01 - Step 13: Enter valid info to 'Employee Name' textbox");
	 verifyTrue(employeeListPage.isJQueryAjaxLoadedSuccess(driver));
	 employeeListPage.enterToTextboxByID(driver, "empsearch_employee_name_empName", "Automation FC");
	 verifyTrue(employeeListPage.isJQueryAjaxLoadedSuccess(driver));
	 
	 log.info("Add_New_01 - Step 14: Click to 'Search' button");
	 //employeeListPage.clickToSearchButton();
	 employeeListPage.clickToButtonById(driver, "searchBtn");
	 verifyTrue(employeeListPage.isJQueryAjaxLoadedSuccess(driver));
	 
	 log.info("Add_New_01 - Step 15: Verify Employee Information displayed at 'Result Table'");
	 verifyEquals(employeeListPage.getValueInTableIDAtColumnNameAndRowIndex(driver, "resultTable", "Last Name", "1"), lastName);
	 
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
  	LoginPO loginPage;
	AddEmployeePO addEmployeePage;
	DashboardPO dashboardPage; 
	EmployeeListPO employeeListPage;
	PersonalDetailPO personalDetailPage;
	
}
