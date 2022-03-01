package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;
import pageUIs.RegisterPageUI;

public class MyAccountPageObject extends BasePage {
	//bien gloal
	private WebDriver driver;
		
	public	MyAccountPageObject(WebDriver driver) {
		//neu co có tao thì nó se tạo ngầm mac dinh ko có tham so ntn
		//ien local
		this.driver = driver;
		System.out.println("Driver at class MyAccountPageOject = " + driver.toString());
	}
	

}
