package javaBasic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_08_For_Foreach {
	WebDriver driver;
	
	//@Test
	public void TC_01_For_Foreach() {
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}		
//		
		// Ve 1: bien tam dung de tang gia tri len sau moi lan duyet
		// Dung de ss voi tong gia tri
	
	//Array / Queue/ Set start with 0
	//	
		
	String[] cityName = { "Ha Noi", "Ho Chi Minh", "Da Nang", "Can Tho" };
	
    for(int i = 0; i < cityName.length; i++) {
    	System.out.println(cityName[i]);
    }
    
    System.out.println("=============================");
    
    //for ket hop voi if: thoa dk thi moi action
    // bien dem dug de dk de filter
    for (int i = 0; i < cityName.length; i++) {
    	if(cityName[i].equals("Ha Noi")) {
    		//Do action
    		System.out.println("Do action");
   		break; // kiem tra toi luc gap dk cần roi dừng đỡ mất thời gian
    	}
	}
    
    System.out.println("=============================");
	
    // dung de chay qua het cac gia tri 
    for (String city : cityName) {
    		System.out.println(city);
	}
    
	}
	@Test
	public void TC_02_Foreach() {
		String[] cityName = { "Ha Noi", "Ho Chi Minh", "Da Nang", "Can Tho" };
		for (String city : cityName) {
			System.out.println(city);
		}
	}
	// Neu muon them mới dữ liệu
	List<String> cityAddress = new ArrayList<String>();
	
	//Compile 
}
