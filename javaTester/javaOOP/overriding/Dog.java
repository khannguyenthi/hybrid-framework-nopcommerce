package javaOOP.overriding;

import javaOOP.Animal;

public class Dog extends Animal {
	private int age;
	private int name;

	public final int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if(age > 0) {
		this.age = age; 
		} else {
			this.age = 0;
		}
	}
	
}
