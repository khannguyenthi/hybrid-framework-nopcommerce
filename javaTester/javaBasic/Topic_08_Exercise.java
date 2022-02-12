package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_08_Exercise {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	
	//@Test
	public void TC_01() {
		int number = scanner.nextInt();
		
		for(int i = 0; i < number; i++) {
			System.out.println(i);
		}
	}
	//@Test
	public void TC_02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		for(int i = numberA; i < numberB; i++) {
			System.out.println(i);
		}
	}
	//@Test
		public void TC_03() {
		 
		 for(int i = 0; i < 10; i++) {
			 if (i % 2 == 0)
			 System.out.println(i);
		 }
		}
		
		//@Test
		public void TC_04() {
			int numberA = scanner.nextInt();
			int numberB = scanner.nextInt();
			int i = 0;
			int sum = 0;
			for(i = numberA; i <= numberB; i++) {
			sum += i;
			}
			System.out.println(sum);
			
		}
		
		//@Test
				public void TC_05() {
					int numberA = scanner.nextInt();
					int i = 0;
					int sum = 0;
					for(i = 0; i <= numberA; i++) {
						if ( i % 2 != 0)
						sum += i;
					}
					System.out.println(sum);
				}
		//@Test
		public void TC_06() {
			int numberA = scanner.nextInt();
			int numberB = scanner.nextInt();
			int i = 0;
			
			for(i = numberA; i <= numberB; i++) {
				if ( i % 3 == 0)
				System.out.println(i);
			}
		}
		
		@Test
				public void TC_07() {
					int numberA = scanner.nextInt();
					int i = 1;
					int sum=1;	
					for(i = 1; i <= numberA; i++) {
						sum = sum * i;
					}
					
					System.out.println(sum);
				}
}
