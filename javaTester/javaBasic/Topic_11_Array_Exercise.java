package javaBasic;

import org.testng.annotations.Test;

public class Topic_11_Array_Exercise {
	int number[] = {5, 8, 15, 7, 60, 1};
	
	//@Test
	public void TC_01_Find_Max_Number() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if(x < number[i]) {
				x = number[i];
			}
			}
		System.out.println("Max number = " + x);
		}
	
	//@Test
	public void TC_02_First_Last() {
		int sum = 0;
		sum = number[0] + number[number.length - 1];
		System.out.println(sum);
	}
	//@Test
		public void TC_03_Sochan_Sum() {
			int sum = 0; 
			for(int i = 0; i < number.length; i++) {
				if(number[i] % 2 == 0)
					sum += number[i];
			}
			System.out.println(sum);
	}
		//@Test
		public void TC_04_Sole_Sum() {
			int sum = 0; 
			for(int i = 0; i < number.length; i++) {
				if(number[i] % 2 != 0)
					sum += number[i];
			}
			System.out.println(sum);
		}
		
		//@Test
		public void TC_05_TenZero_Sum() {
			int number[] = {3, -7, 2, 5, 9, -6, 10, 12};
			for(int i = 0; i < number.length; i++) {
				if(number[i] > 0 && number[i] < 10) {
					System.out.println(number[i]);
				}
			}
		}
			@Test
			public void TC_06_Avg_Sum() {
				int number[] = {3, 5, 9, 29, 0, -5};
				int sum = 0;
				for(int i = 0; i < number.length; i++) 
				{		sum += number[i];
						System.out.println(sum);
				}
				System.out.println("TB cộng " + sum/(number.length));
		}
			
			
	
}
