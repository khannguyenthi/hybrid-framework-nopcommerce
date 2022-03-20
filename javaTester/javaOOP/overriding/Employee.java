package javaOOP.overriding;

public class Employee extends Person  {
	@Override
	public void eat() {
		System.out.println("Suat > 20k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngu 8h/ngay");
		
	}
}
