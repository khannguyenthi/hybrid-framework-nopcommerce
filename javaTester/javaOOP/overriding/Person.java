package javaOOP.overriding;

public abstract class Person {
	public void eat() {
		System.out.println("Suat 20k");
	}
	
	//Ham cha có 1 ham abstract
	//Thi tat ca cac ham con ke thua deu phai override
	public abstract void sleep();
	
	//Ko dc phep gán lai
	public final void walk() {
		System.out.println("Di bo");
	}
	public static void run() {
		System.out.println("Chay");
	}
	protected static void dating() {
		System.out.println("Hen ho");
	}
 }
