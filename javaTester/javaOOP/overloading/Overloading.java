package javaOOP.overloading;
	
public class Overloading {
	private int firstNumber;
	private int secondNumber;
	//Overloading 
	//
	public void sumNuber() {
		System.out.println(this.firstNumber + this.secondNumber);
	}
	public void sumNumber(int firstNumber, int secondNumber) {
		System.out.println(firstNumber + secondNumber);
		}
	public void sumNumber(float firstNumber, int secondNumber) {
		System.out.println(firstNumber + secondNumber);
	}

	public void sumNuber(int number) {
		System.out.println(number * 100);
		
	}
	
	public static void main(String[] args) {
		Overloading over = new Overloading();
		over.sumNuber(15);
	}
 }
