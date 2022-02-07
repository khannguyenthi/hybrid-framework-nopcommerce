package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_06_Topic06_Exercise {
  WebDriver driver;
  String projectPath = System.getProperty("user.dir");
  Scanner scanner = new Scanner(System.in);
  //@Test
  public void TC_01() {
	  Scanner scanner = new Scanner(System.in);
	  int number = scanner.nextInt();
	 
	  if (number % 2 == 0) {
		  System.out.println("Số: " + number + " là số chẵn");
	  }
	  else {
		  System.out.println("So lẻ");
	  }
  }
  
  //@Test
  public void TC_02() {
	  Scanner scanner = new Scanner(System.in);
	  int A = scanner.nextInt();
	  int C = scanner.nextInt();
	  
	  if (A > C) {
	  System.out.println(A + " lớn hơn " + C);
	  }
	  else {
		  System.out.println(A + " nhỏ hơn " + C);
	 }   
  }
  
  //@Test
  public void TC_03() {
	  Scanner scanner = new Scanner(System.in);
	  String name1 = scanner.nextLine();
	  String name2 = scanner.nextLine();
	  
	  if (name1 == name2) {
	  System.out.println(name1 + " trùng tên " + name2);
	  }
	  else {
		  System.out.println(name1 + " khác tên " + name2);
	 }   
  }
  
  //@Test
  public void TC_04() {
	 
	  int E = scanner.nextInt();
	  int F = scanner.nextInt();
	  int D = scanner.nextInt();
	  
	  if(E > F && E > D) {
		  System.out.println(E + " là số lớn nhất");
	  }
	  else if (F > D) {
		  System.out.println(F + " la so lon nhat");
	  } else {
		  System.out.println(D + " là số lớn nhất");
	  }
  }
  //@Test
  public void TC_05() {
	  Scanner scanner = new Scanner(System.in);
	  int A = scanner.nextInt();
	  
	  if( 10 < A && A < 100) {
		System.out.println( A + "trong khoảng");  
	  }
	  else {
		  System.out.println(A + "ngoai khoang");
	  }
	  }
  //@Test
  public void TC_06() {
	  float studentPoint = scanner.nextFloat();
	  
	  if (studentPoint <= 10 && studentPoint >=8.5)
	  {
		  System.out.println("He so A");
	  }
	  else if (studentPoint < 8.5) {
		  	System.out.println("He so khac A");
	  }
	  else {
		  System.out.println("Vui long nhap dung ");
	  }

  }
  @Test
  public void TC_07() {
	  int month = scanner.nextInt();
	  if (month==1 || month==3 || month==5 || month==7 || month==8) {
		  System.out.println("Thang co 31 days");
	  }
	  else if (month==2) {
		  System.out.println("Thang co 28 days");
	  }
  }
  }
   

