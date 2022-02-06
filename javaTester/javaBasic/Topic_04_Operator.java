package javaBasic;

public class Topic_04_Operator {

	public static void main(String[] args) {
	//	int number = 10;
		
		//number +=5; // number = number + 5;
	//	System.out.println(number);
		
		// Chia lay phan nguyen
	//	System.out.println(number / 5);
		
		//Chia lay phan du => 3
//		System.out.println(number % 6);
//		
//		System.out.println(number++); // In ra trước rồi mới tăng lên 1 => 10 thành 11
//		
//		System.out.println(++number); // Tăng 1 trước rồi in ra [12] 
//		
//		System.out.println(number--); //In ra number [12], sau đó trừ 1 còn 11
//		
//		System.out.println(number++); // In ra 11, sau đó tăng len 1 [12]
//		
		for (int i = 0; i < 3; ++i) {
			System.out.println(i);
		}
		 
		String address = "Ho Chi Minh";
		if(!(address == "Ha Noi")) {
			System.out.println("Address is not the same");
		}
		
		// bieu thuc tam nguyen 
		boolean status = (address == "Ha Noi") ? true : false;
		System.out.println(status);
	}
	
}
  