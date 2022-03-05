package pageObject;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.RegisterPageUI;


public class RegisterPageObject extends BasePage {
	private WebDriver driver; 
	
	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	
	public void clickToRegisterButton() {
		waitForElementClickable(driver,RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver,RegisterPageUI.REGISTER_BUTTON);
	}

	public String getErrorMessageAtFirstNameTextbox() {
		waitForElementClickable(driver,RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
		return getElementText(driver,RegisterPageUI.FIRST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtLastNameTextbox() {
		waitForElementClickable(driver,RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
		return getElementText(driver,RegisterPageUI.LAST_NAME_ERROR_MESSAGE);
	}

	public String getErrorMessageAtEmailTextbox() {
		waitForElementClickable(driver,RegisterPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver,RegisterPageUI.EMAIL_ERROR_MESSAGE);
	}

	public String getErrorMessageAtPasswordTextbox() {
		waitForElementClickable(driver,RegisterPageUI.PASSWORD_ERROR_MESSAGE);
		return getElementText(driver,RegisterPageUI.PASSWORD_ERROR_MESSAGE);
	}

	public String getErrorMessageAtConfirmPasswordTextbox() {
		waitForElementClickable(driver,RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
		return getElementText(driver,RegisterPageUI.CONFIRM_PASSWORD_ERROR_MESSAGE);
	}

	public void inputToFirstNameTextbox(String firstName) {
		waitForElementVisible(driver,RegisterPageUI.FIRST_NAME_TEXTBOX);
		sendkeyToElement(driver,RegisterPageUI.FIRST_NAME_TEXTBOX,firstName);
	}

	public void inputToLastNameTextbox(String lastName) {
		waitForElementVisible(driver,RegisterPageUI.LAST_NAME_TEXTBOX);
		sendkeyToElement(driver,RegisterPageUI.LAST_NAME_TEXTBOX,lastName);

		
	}

	public void inputToEmailTextbox(String emailAddress) {
		waitForElementVisible(driver,RegisterPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver,RegisterPageUI.EMAIL_TEXTBOX,emailAddress);

		
	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver,RegisterPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver,RegisterPageUI.PASSWORD_TEXTBOX,password);

		
	}

	public void inputToConfirmPasswordTextbox(String confirmPassword) {
		waitForElementVisible(driver,RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
		sendkeyToElement(driver,RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX,confirmPassword);
		
	}

	public String getRegisterSuccessMessage() {
		waitForElementClickable(driver,RegisterPageUI.CONFIRM_REGISTER_SUCCESS_MESSAGE);
		return getElementText(driver,RegisterPageUI.CONFIRM_REGISTER_SUCCESS_MESSAGE);
	}
	public void clickToLogoutLink() {
		waitForElementClickable(driver,RegisterPageUI.LOGOUT_LINK);
		clickToElement(driver,RegisterPageUI.LOGOUT_LINK);
		
	}

	public String getErrorExistingEmailMessage() {
		waitForElementVisible(driver,RegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
		return getElementText(driver,RegisterPageUI.EXISTING_EMAIL_ERROR_MESSAGE);
	}

}
