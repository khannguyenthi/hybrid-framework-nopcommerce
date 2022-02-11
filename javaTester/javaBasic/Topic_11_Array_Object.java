package javaBasic;

public class Topic_11_Array_Object {
	//Thuoc tính/biến
	String ID;
	String name;
	int age;
	double score;
	
	
	//Constructor: hàm khởi tạo
	public Topic_11_Array_Object(String ID, String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.ID = ID;
		this.score = score;
	}
	
	public void display() {
		System.out.println("ID: " + ID);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("score: " + score);
	}
	
	public static void main(String[] args) {
		Topic_11_Array_Object[] students = new Topic_11_Array_Object[3];
		students[0] = new Topic_11_Array_Object("ID123", "Tuan", 24, 4.5);
		students[1] = new Topic_11_Array_Object("ID124", "Lan", 23, 9.5);
		students[2] = new Topic_11_Array_Object("ID125", "Hog", 27, 2.5);
		for(int i = 0; i < students.length; i ++) {
				students[i].display();
		}
	}
	
	
	
}
