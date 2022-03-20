package javaAccModSecond;

import javaAccModFirst.Computer;

public class PC extends Computer {

	public void showCPUProductName() {
		cpuProductName = "Intel";
		System.out.println(cpuProductName);
		
		setCpuProductName("AMD");
		System.out.println(cpuProductName);
	}
}
