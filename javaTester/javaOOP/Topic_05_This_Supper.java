package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_05_This_Supper extends BaseOOP {
	private WebDriver driver;
	private long shortTimeout = 15;
	private long longTimeout = 45;
 
	public void setImplicitWait() {
		//super();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(this.shortTimeout, TimeUnit.SECONDS);
		
	}
	
	public void clickToElement() {
		//Ko dung super thì nó se goi qua ham con cua lop đó
		setImplicitWait();
		//Dung supper thi goi qua lop extends
		//super.setImplicitWait();
	}
	
	public Topic_05_This_Supper() {
		super();
		System.out.println("Constructor tai class con");
	}
	
	public static void main(String[] args) {
		//Topic_05_This_Supper topic = new Topic_05_This_Supper(); 
		BaseOOP base = new BaseOOP();
	}
	}

