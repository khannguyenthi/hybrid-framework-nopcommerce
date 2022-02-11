package javaBasic;

public class Topic_10_Break_Continous {
 
 public static void main(String[] args) {
	 for(int i = 0; i < 10; i++) {
		 System.out.println("Lan chay thu 1: " + i);
		 
		 //i = 1
		 //moi lan chay cua for tren se apply cho tat ca cac lan chay cua for duoi nay
		 for(int j = 0; j <= 5; j++)
		 {
			 if(j==4) {
				 continue;
			 }
			 System.out.println("Lan chay cua j (for thu 2) " + j);
			
			 for(int x = 1; x <= 5; x++) {
				 if(x == 4) {
					 continue;
				 }
				System.out.println("x = " + x); 
			 }
		 }
	 }
 }
}
