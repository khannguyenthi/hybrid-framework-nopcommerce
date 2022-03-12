package javaOOP;

public class CarPop {
	static String carCompany;
	static String carType;
	static String fuelType;
	static Float mileAge;
	static Double carPrice;
	
	public static void main(String[] args) {
		carCompany = "Honda";
		carType = "City";
		fuelType = "Petro";
		mileAge = 2000f;
		carPrice = 5000d;
		System.out.println("Car company = " + carCompany);
		System.out.println("Car type = " + carType);
		System.out.println("Car fuel type = " + fuelType);
		System.out.println("Car mile age type = " + mileAge);
		System.out.println("Car price = " + carPrice);
		
		carCompany = "Huyndai";
		carType = "Accent";
		fuelType = "Diesel";
		mileAge = 150f;
		carPrice = 30000d;
		System.out.println("Car company = " + carCompany);
		System.out.println("Car type = " + carType);
		System.out.println("Car fuel type = " + fuelType);
		System.out.println("Car mile age type = " + mileAge);
		System.out.println("Car price = " + carPrice);
		
	}
}
