package javaAccModFirst;

public class Laptop extends Computer {
	
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.cpuProductName = "Intel";
		System.out.println(comp.cpuProductName);
		
		comp.setCpuProductName("AMD");
		System.out.println(comp.cpuProductName);
		
			}
}
