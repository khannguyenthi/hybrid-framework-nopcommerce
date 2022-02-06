package javaBasic;

import org.openqa.selenium.WebDriver;

public class Topic_02_Data_Type {
 // Global variable
	//static int number; // Phai khai báo static de goi hàm static ben dưới, get default value kieu int
	
	// Neu dung bien ko phai static thi phai truy cap thong qua doi tuong class
	//static String address = "Ho Chi Minh"; // ko gán giá trị thì nó sẽ lấy giá trị NULL 
	
	// Primitive type/ value type: nguyen thuy
	byte bNumber;
	
	short sNumber;
	
	int iNumber;
	
	long lNumber;
	
	float fNumber = 15.98f;
	
	double dNumber = 155.98d;
	
	char cChar = '1'; //chi dc 1 ký tự  
	
	boolean bBoolean = false; //true or false
	
	
	// Kieu du lieu tham chieu non-primitive: array/ String/ Class/ Interface/ Object/ Collection
	// Se có những FUNCTION đi kèm theo, còn Primittive thì KO address.length()
	
	//String
	String address = "Ho Chi Minh";
	
	//Array
	String[] studentAddress = {address, "Ha Noi", "Da Nang"};
	Integer[] studentNumber = {15, 20, 50};
	
	//Class 
	Topic_02_Data_Type topic; 
	
	//Interface: là 1 biến đại diện cho kiểu dữ liệu này
	WebDriver driver;
	
	//Object: co the convert qua kieu du lieu khac
	Object aObject; 
	
	//Collection
	//List/ Set/ Queue/ Map
	//List<WebElement> - Ko luu trung 
	//Set<String> - Cho phep luu trùng
	//List<String>
	
 public static void main(String[] args) {
	 // Local variable
	 // static có nghĩa là gọi trực tiếp từ tên lớp tới tên hàm dc 
	 //  Topic_01_Variable topic = new Topic_01_Variable();
	 //  System.out.println(topic.studentName);
	 // Neu ko co static thi se ko chạy dc
	 //System.out.println(number);
	 
	 // bien local khai bao phai khoi tao du lieu
	//int studentNumber = 4 ; 
	 //System.out.println(studentNumber);
	 
//	 Topic_02_Data_Type topic = new Topic_02_Data_Type();
//	 System.out.println(topic.address);
	 //System.out.println(address);
	 //26;18
 }
 
 public void clickToElement() {
	 address.trim();
	 studentAddress.clone();
	 driver.getCurrentUrl();
	 aObject.toString();
	 
 }
 
}
