package javaBasic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Topic_05_Reference_Casting {
	String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void showStudentName() {
		System.out.println("Student name = " + studentName);
	}
	
	public static void main(String[] args) {
		Topic_05_Reference_Casting fistStudent = new Topic_05_Reference_Casting();
		
		Topic_05_Reference_Casting secondStudent = new Topic_05_Reference_Casting();
		
		fistStudent.setStudentName("ABC");
		secondStudent.setStudentName("DEF");
		
		fistStudent.showStudentName();
		secondStudent.showStudentName();
		
		// Ép kiểu
		fistStudent = secondStudent; // 
		
		fistStudent.showStudentName();
		secondStudent.showStudentName();
		
		secondStudent.setStudentName("Khan Nguyen");
		
		fistStudent.showStudentName();
		secondStudent.showStudentName();
		
		WebDriver driver = null; 
		JavascriptExecutor jsExcecutor = (JavascriptExecutor) driver;
		
		
		
	}
}
