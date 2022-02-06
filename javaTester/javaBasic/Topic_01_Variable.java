package javaBasic;

public class Topic_01_Variable {
 static int studentNumber;
 static boolean status;
 static final String BROWSER_NAME = "Chrome"; // Constant, in đậm
 static int studentPrice; //khai báo static để dùng dc static của hàm bên dưới (ngoài)
 
 String studentName = "AutomationFC";
 
 
 public static void main(String[] args) {
	 System.out.println(studentNumber); //return default value '0' 
	 System.out.println(status); //return default value 'false' 
	 
	 //int studentPrice = 1;
	 System.out.println(studentPrice);
	 
	 //Nếu cần dùng biến ko phải static thì phải khai báo new
	 //System.out.println(studentName); 
	 //Tra ve kieu static, nhung no lai la string
	 // Phai truy cap thong qua hàm mới dc 
	 Topic_01_Variable topic = new Topic_01_Variable();
	 System.out.println(topic.studentName);
	 
	 // Ctrl + Shift + C comment code
 }
}
