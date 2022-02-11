package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_09_While_Do_While {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		//TC_01_For();
		//TC_02_While();
		//TC_03_Do_While();
		TC_08_While();
	}

	 
		  public static void TC_01_For() {
			  int number = scanner.nextInt();
			  for (int i = number; i < 100; i++) {
				  if(i % 2 == 0)
				  {
					  System.out.println(i);
				  }
			  }
		  }
		  
	
		  public static void TC_02_While() {
			  int number = scanner.nextInt();
			  while (number < 100) {
				  if(number % 2 == 0)
				  {
					  System.out.println(number);
					  number ++;
				  }
			  }
		  }
		  
		
		  public static void TC_03_Do_While() {
			  int number = scanner.nextInt();
			  do {
				  if(number % 2 == 0)
				  {
					  System.out.println(number);
					  number ++;
				  }
			} while (number < 100);
		  }
		
		  //@Test
		  public static void TC_04_While() {
			int numberA = scanner.nextInt();
			int numberB = scanner.nextInt();
			  while (numberA < numberB) {
				  if(numberA % 3 == 0 & numberA % 5 == 0)
				  {
					  System.out.println(numberA);
				  }
				  numberA ++;
			  }
		  }
		  //@Test
		  public static void TC_05_While() {
			int numberA = scanner.nextInt();
			int i = 0;
			  while (numberA > 0) {
				  if(numberA % 2 != 0)
				  {
					  System.out.println(numberA);
					  i += numberA;
				  }
				  numberA --;
			  }
			  System.out.println(i);
		  }
		  
		  //@Test
		  		public static void TC_06_While() {
					int numberA = scanner.nextInt();
					int numberB = scanner.nextInt();
					  while (numberA < numberB) {
						  if(numberA % 3 == 0)
						  {
							  System.out.println(numberA);
						  }
						  numberA ++;
					  }
				  }
		  		
		  	@Test
				  public static void TC_07_While() {
					int numberA = scanner.nextInt();
					int i = 0;
					int sum = 1; 
					  while (numberA > i) {
						  i ++;
						  sum *=i;
					  }
					  System.out.println(sum);
				  }
		  	
		  	//@Test
			  public static void TC_08_While() {
				int numberA = scanner.nextInt();
		  		int numberB = scanner.nextInt();
				int i = 0;
				int sum = 0; 
				  while (numberB > numberA) {
					  if(numberA % 2 == 0)
					  sum +=i;
				  }
				  i++;
				  System.out.println(sum);
			  }

	}
 
