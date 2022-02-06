package javaBasic;

public class Topic_03_Compare {
  int number = 8;
   
 public static void main(String[] args) {
	 //1 vung nho cho x
	 int x = 5;
	 //1 vung nho cho y
	 int y = x;
	 
	 System.out.println("x= " + x);
	 System.out.println("y= " + y);
	 
	 y = 10;
	 System.out.println("x= " + x);
	 System.out.println("y= " + y);
	 
	 Topic_03_Compare firstVariable = new Topic_03_Compare();
	  Topic_03_Compare secondVariable = firstVariable;
	 
	  System.out.println("number = " + firstVariable.number);
	  System.out.println("number = " + secondVariable.number);
	  
	 
	 secondVariable.number = 15; 
	 
	 System.out.println("number = " + firstVariable.number);
	 System.out.println("number = " + secondVariable.number);
	 
	 
 }
}
  