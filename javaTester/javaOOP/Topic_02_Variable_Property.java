package javaOOP;

public class Topic_02_Variable_Property {

	private String studentName = "Khan BR"; //global variable
	
	//access modifier default
	int studentID = 34333;
	
	//static variable co the goi truc tiep trong ham static
	public static String studentAddress = "HCM";
	private static String studentPhone = "29392333";
	
	//final variable: ko dc phép override 
	final String country = "VN";
	
	static final float PI = 3.14766876f;
	
	public static void main(String[] args) {
		
}
	public Topic_02_Variable_Property() {
		String studentName = "Khan d";
		studentAddress = "Phap";
	}
	
	public void display() {
		String studentName = "Khan d";
		studentPhone = "20230";
	}

}