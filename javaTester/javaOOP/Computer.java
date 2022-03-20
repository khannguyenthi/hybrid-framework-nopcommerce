package javaOOP;

public abstract class Computer {
	
	//Normal method
	public void showComputerPerformance() {
		System.out.println("Show computer performance");
	}
	// Ham abstrract ko co phan than, ko co {} 
	//Khung de cho cac class con kế thừa nó phải overide lại (implement)
	public abstract void showComputerRam();
}
