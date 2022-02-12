package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_String_Exercise {
	String courseName = "Automation Testing Advance";
	String courseTitle = "Automation Testing 345 Tutorials Online 789";
	
	//@Test
	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLower = 0;
		for (char character : courseNameArr) {
			//Upper case
			if(character <= 'Z' && character >= 'A') {
				countUpper++;
			}
			
			//Lower case
			if(character <= 'z' && character >= 'a') {
				countLower++;
			}
		}
		System.out.println("So luong tu Upper case: " + countUpper);
		System.out.println("So luong tu Lower case: " + countLower);
	}
	//@Test
		public void TC_02() {
		char courseTitleArr[] = courseTitle.toCharArray();
		int countLetterA = 0;
		for (char character : courseTitleArr) {
			//Count letter a
			if(character == 'a'|| character == 'A' ) {
				countLetterA++;
			}
	}
		System.out.println("So luong letter a: " + countLetterA);	
		
		// Kiem tra chuoi co chua tu Testing hay ko? 
		System.out.println("Co chứa 1 chuoi or ki tu: " + courseTitle.contains("Testing"));
		
		// Kiem tra co start with Automation 
		System.out.println("Co start chuoi or ki tu: " + courseTitle.startsWith("Automation"));
		
		//Kiem tra co ket thuc bang Online
		System.out.println("Co end chuoi or ki tu: " + courseTitle.endsWith("Online"));
		
		//Lay vi tri cua 1 tu trong chuoi
		System.out.println("Co end chuoi or ki tu: " + courseTitle.indexOf("Tutorials"));
		
		//Thay the tu Online = Offline
		String courseTitleReplace; 
		courseTitleReplace = courseTitle.replace("Online", "Offline");
		System.out.println(courseTitleReplace);
		
		//Dem so luong ki tu trong chuoi 
		String result = "Automation Testing 345 Tutorials Online 789";
		String results[] = result.split(" ");
		System.out.println(results.length);
	}
		@Test
		public void TC_03() {
			//dao nguoc chuoi 
			String courseOriginal = "Automation FC";
			System.out.println("Original string: " + courseOriginal);

			System.out.println("Reversed string :  ");
		    int i = courseOriginal.length();
		    while(i>0) {
		      System.out.print(courseOriginal.charAt(i-1));
		      i--;
		    }
			
		}

}

