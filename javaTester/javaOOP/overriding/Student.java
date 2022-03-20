package javaOOP.overriding;

public class Student extends Person implements IWork {
	@Override
	public void eat() {
		System.out.println("Suat 15k");
	}

	@Override
	public void sleep() {
		System.out.println("Ngu 12h/ day");
		
	}
	@Override 
	public void workingTime() {
		System.out.println("hoc 3h/ngay");
	}
	
	//Ko override dc private/ final, static
	
	//@Override
	//public void walk() {
	//	System.out.println("Ngu 12h/ngay");
	//}
	//@Override
	//public void run() {
	//	System.out.println("chay");
	//}
	
	//@Override
	 //protected void dating() {
		//	System.out.println("hen ho");
		//}
}
