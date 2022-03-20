package javaOOP;

public class Topic_03_Method {
	
	// Non static 
	void showCarName() {
		System.out.println("hynhdia");
	}
	
	static void showCarColor() {
		System.out.println("White");
	}
	
	public static void main(String[] args) {
		//goi hàm static thì dc
		showCarColor();
		//ko goi truc tiep ham nonstatic showCarName();
		//Muon goi thi phai thong qua 1 instance/object
		Topic_03_Method methods = new Topic_03_Method();
		methods.showCarName();
	}

}
