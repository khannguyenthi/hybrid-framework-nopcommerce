package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_12_String {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		String studentName = "Automation Testing";
		String courseName = "AUTOMATION TESTING";
		String schoolAddress = "Ho Chi Minh City"; 
		System.out.println(studentName.length()); //27
		
		//Get a charater from 1 kitu nao do
		System.out.println("Lay ra ki tu: " + studentName.charAt(1)); // s
		
		// Nối chuỗi
		System.out.println("Noi 2 chuoi: " + studentName + schoolAddress);
		
		//Kiem tra 2 chuoi bang nhau
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi: " + studentName.equals(schoolAddress));
		
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi: " + studentName.equals("Automation Testing"));
		
		System.out.println("Kiem tra 2 chuoi bang nhau tương doi: " + studentName.equals(courseName));
		System.out.println("Kiem tra 2 chuoi bang nhau tương doi: " + studentName.equalsIgnoreCase(courseName));
        
		//Start-with/ end-with
		System.out.println("Co bat dau bang 1 chuoi ki tu: " + studentName.startsWith("A"));
		System.out.println("Co bat dau bang 1 chuoi ki tu: " + studentName.startsWith("Automation"));
		System.out.println("Co bat dau bang 1 chuoi ki tu: " + studentName.startsWith("T"));
		
		//Co chứa
		System.out.println("Co chứa 1 chuoi or ki tu: " + studentName.contains("T"));
		System.out.println("Co chứa 1 chuoi or ki tu: " + studentName.contains("Testing"));
		
		//Ket thuc
		System.out.println("Ket thu 1 chuoi or ki tu: " + studentName.endsWith("Testing"));
		System.out.println("Ket thu 1 chuoi or ki tu: " + studentName.endsWith("A"));
		
		//Index: vi tri tu trong chuoi
		System.out.println("Vi tri cua 1 ki tu trong chuoi: " + studentName.indexOf("A"));
		System.out.println("Vi tri cua 1 ki tu trong chuoi: " + studentName.indexOf("u"));
		System.out.println("Vi tri cua 1 ki tu trong chuoi: " + studentName.indexOf("Testing"));
		
		//Sub string
		System.out.println("Tach 1 kitu or chuoi trong chuoi: " + studentName.substring(11));
		System.out.println("Tach 1 kitu or chuoi trong chuoi: " + studentName.substring(1, 5));
		
		//Tach chuoi split: tach chuoi thanh mảng dua vao ki tu/ chuoi ki tu 
		String result = "Viewing 48 of 132 results";
		String results[] = result.split(" ");
		System.out.println(results[1]);
		
		//Replace: neu muon sx tang dan hay giam dan for sorting data
		String productPrice = "$100.00";
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);
		
		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF);
		
		productPrice = String.valueOf(productPriceF);
		System.out.println(productPrice);
		
		//Split & substring
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		//Windows 10
		// Handle multiple browser 
		
		if(osName.toLowerCase().contains("windows")) {
			Keys key = Keys.CONTROL;
		} else {
			Keys key = Keys.COMMAND;
		}
		
		//Multiple browser: upper case
		
		//String driverInstanceName = driver.toString();
		//System.out.println(driverInstanceName);
		
		//Close browser
		//if(driverInstanceName.contains("internetexplore")) {
			
		//}
		
		//Khoang trang/ xuong dong/ tab - trim
		String helloWorld = " \n \t    Hello World!     ";
		System.out.println(helloWorld);
		System.out.println(helloWorld.trim());
		
		helloWorld = " ";
		System.out.println("Co empty ko?" + helloWorld.isEmpty());
		System.out.println("Co blank ko?" + helloWorld.isBlank());
		
		//Dynamic locator
		//Dai dien cho 1 chuoi: %s
		// %b, %t, %d
		String dynamicButtonXpath = "//button[@id='%s']";
		System.out.println("Click to Login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		System.out.println("Click to Search button = " + dynamicButtonXpath.format(dynamicButtonXpath, "search"));
		System.out.println("Click to Register button = " + dynamicButtonXpath.format(dynamicButtonXpath, "register"));
	}

}
