package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BaseOOP {
	public WebDriver driver;
	public long shortTimeout = 15;
	protected long longTimeout = 45;
	
	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
			
	}
	
	public BaseOOP() {
		System.out.println("Constructor tai class cha");
		System.out.println("Constructor tai class cha");
		System.out.println("Constructor tai class cha");
		System.out.println("Constructor tai class cha");
	}
	/*public BaseOOP(String name) {
		System.out.println("Constructor tai class cha" + name);
	}
	public BaseOOP(int number) {
		System.out.println("Constructor tai class cha" + number);
		}*/

	
}
