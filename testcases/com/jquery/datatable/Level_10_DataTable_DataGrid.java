package com.jquery.datatable;

import org.testng.annotations.Test;

import commons.BasePage;
import commons.BaseTest;
import pageObject.portal.nopCommerce.PageGeneratorManager;
import pageObject.portal.nopCommerce.UserAddressPageObject;
import pageObject.portal.nopCommerce.UserCustomerInfoPageObject;
import pageObject.portal.nopCommerce.UserHomePageObject;
import pageObject.portal.nopCommerce.UserLoginPageObject;
import pageObject.portal.nopCommerce.UserMyProductReviewPageObject;
import pageObject.portal.nopCommerce.UserRegisterPageObject;
import pageObject.portal.nopCommerce.UserRewardPointPageObject;
import pageObjects.jQuery.HomePageObject;
import pageObjects.jQuery.PageGeneratorManager_JQuery;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_10_DataTable_DataGrid extends BaseTest {
	HomePageObject homePage;
	List<String> actualAllCountryValue;
	List<String> expectedAllCountryValue;
	 @Parameters({"browser","url"})
	 @BeforeClass 
	  public void beforeClass(String browserName, String appUrl) {
		 driver = getBrowserDriver(browserName, appUrl);	 
		 homePage = PageGeneratorManager_JQuery.getHomePage(driver);
	 }

 //@Test
  public void Table_01_Paging() {
	 homePage.openPagingByPageNumber("10");
	 homePage.sleepInSecond(3); 
	 Assert.assertTrue(homePage.isPageNumerActived("10"));
	 
	 homePage.openPagingByPageNumber("19");
	 homePage.sleepInSecond(3); 
	 Assert.assertTrue(homePage.isPageNumerActived("19"));
	 
	 homePage.openPagingByPageNumber("1");
	 homePage.sleepInSecond(3); 
	 Assert.assertTrue(homePage.isPageNumerActived("1"));
	 
  }
 
 //@Test
 public void Table_02_Enter_To_Header() {
	 homePage.refreshCurrentPage(driver);
	 
	 homePage.enterToHeaderTextBoxByLabel("Country", "Afghanistan");
	 homePage.enterToHeaderTextBoxByLabel("Females", "384187");
	 homePage.enterToHeaderTextBoxByLabel("Males", "407124");
	 homePage.enterToHeaderTextBoxByLabel("Total", "791312");
	 homePage.sleepInSecond(3); 
	 
	 homePage.enterToHeaderTextBoxByLabel("Country", "Angola");
	 homePage.enterToHeaderTextBoxByLabel("Females", "276880");
	 homePage.enterToHeaderTextBoxByLabel("Males", "276472");
	 homePage.enterToHeaderTextBoxByLabel("Total", "553353");
	 homePage.sleepInSecond(3); 
 }
 
 @Test
 public void Table_03_E_All_Rows() {
	 //Doc du lieu cua file country.txt
	 //Luu vao 1 List<String> = Expected Value = expectedAllCountryValues
	 
	 //Actual 
	 actualAllCountryValue = homePage.getValueEachRowAtAllPage();
	 Assert.assertEquals(actualAllCountryValue, expectedAllCountryValue);
 }
   
  @AfterClass
	public void afterClass() {
		driver.quit();
	}
    private WebDriver driver; 
	 
}
