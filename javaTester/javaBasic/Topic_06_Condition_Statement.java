package javaBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_06_Condition_Statement {
 
 public void main(String[] args) {
	 //If: kiem tra 1 dieu kien thôi 
	 //Neu true thì run condition trong if
	 
	 WebDriver driver = null;
	 WebElement languageCheckbox = driver.findElement(By.id("")); 
	 if(languageCheckbox.isSelected()) {
		 languageCheckbox.click();
	 }
	 
	 //Có tới 2 điều kiện: đúng thì vào if  sai thì vào else
	 
 }
}
