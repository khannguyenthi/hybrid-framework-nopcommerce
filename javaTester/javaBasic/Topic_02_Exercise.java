package javaBasic;

import org.testng.annotations.Test;

public class Topic_02_Exercise {
	//@Test
	public void TC_01() {
		int a = 6;
		int b = 2;
		int P1 = a+b;
		//System.out.println("Tong: " + "a + b" + " = " + P1 );
		System.out.println("Tong: " + (a + b));
		
		int P2 = a-b;
		System.out.println("Hieu: " + "a - b" + " = " + P2 );
		
		int P3 = a*b;
		System.out.println("Tich: " + "a * b" + " = " + P3 );
		
		double P4 = a/b;
		System.out.println("Tich: " + "a / b" + " = " + P4 );
	}
	//@Test
	public void TC_02() {
		float dai = 7.5f;
		float rong = 3.8f;
		
		System.out.println("Dien Tich: " + (dai * rong));
	}
	@Test 
	public void TC_03() {
		String name = "Automation Testing";
		System.out.println("Hello " + name);
	}
	
}
