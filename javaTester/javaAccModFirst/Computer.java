package javaAccModFirst;

public class Computer {
	//property
	private int ssdSize;
	String ramProductName;
	protected String cpuProductName;
	
	//Method
	private void setssdSize(int ssdSize) {
		//ssdSize = ssd_Size;
		this.ssdSize = ssdSize;
	}
	
	void setRamProductName(String ramProduct) {
		ramProductName = ramProduct; 
	}
	
	public static void main(String[] args) {
		Computer comp = new Computer();
		comp.ssdSize = 500; 
		
		comp.cpuProductName = "Intel";
		System.out.println(comp.cpuProductName);
	
		System.out.println(comp.cpuProductName);
		
		comp.setCpuProductName("AMD");
		System.out.println(comp.cpuProductName);
		
		comp.setRamProductName("Kingmax");
		System.out.println(comp.ramProductName);
		
		
	}
	
	protected void setCpuProductName(String cpuProduct) {
		cpuProductName = cpuProduct;
	}

}
