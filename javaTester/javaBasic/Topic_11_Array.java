package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic_11_Array {

	public static void main(String[] args) {
		//Dc define co dinh bao nhieu phan tu khi code
		int number[] = {1, 8, 21, 17};
		String studentName[] = {"Nam", "Long", "An"};
		
		//Lay 1 phan tu cua mang dung index as 0
		System.out.println(number[0]);
		
		int b[] = new int[5];
		b[0] = 10;
		
		//duyet qua tat ca phan tu cua mang
		for(int i = 0; i < b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		//Phần tử dc add vào trong mảng lúc chạy 
		
		for (String std : studentName) {
			if (std.equals("Long")) {
				System.out.println("Click vao Long");
			}
		}
		ArrayList<String> stdName = new ArrayList<String>();
		
		//Khi chay code moi add
		for (String std : studentName) {
			stdName.add(std);
			}
		//Neu dung for dyet qua mảng thì có the kiem tra dk được
		List<String> names = Arrays.asList("Tom", "Jerry");
		for(String name : names) {

			System.out.println("Name: " + name);
		}
		
		//For-each thì ko the kiem tra dk duoc
		for (String std_Name : names) {
			System.out.println(std_Name);
		}
	
	}
	
	
	

}
