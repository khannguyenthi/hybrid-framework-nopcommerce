package javaOOP;

public final class Topic_04_Non_Access_Modifier {
	//static variable / method
	//Ctr chay thi bat, stop thi chay. Dung cho tat ca cac instance/  pham vi global./co the override dc
	static String browserName = "Chrome";
	
	//Non static 
	String serverName = "Testing";
	
	//
	final String colorCar = "White";
	
	public static void main(String[] args) {
		//co the dung bien static tu ham static truc tiep
		System.out.println(browserName);
		
		
		//Ko the goi bien Non static truc tiep, phai tao ra doi tuong & su dung thong qua doi tuong
		//System.out.println(serverName);
		//Topic_04_Non_Access_Modifier modifiers = new Topic_04_Non_Access_Modifier();
		//System.out.println(modifiers.serverName);
		
		//Testing.sendkeyToElement(browserName);
		//System.out.println(modifiers.colorCar);
	}
	//Final method
	public final void setCarName() {
		
	}
	public void clickToElement(String elementName) {
		System.out.println(elementName);
	}
}
