package javaOOP;

public class CarOOP {
	protected CarOOP(String carCompany, String carType, String fuelType, Float mileAge, Double carPrice) {
		this.carCompany = carCompany;
		this.carType = carType;
		this.fuelType = fuelType;
		this.mileAge = mileAge;
		this.carPrice = carPrice;
	}
	private String carCompany;
	private String carType;
	private String fuelType;
	private Float mileAge;
	private Double carPrice;
	
	protected final String getCarCompany() {
		return carCompany;
	}

	protected final void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}

	protected final String getCarType() {
		return carType;
	}

	protected final void setCarType(String carType) {
		this.carType = carType;
	}

	protected final String getFuelType() {
		return fuelType;
	}

	protected final void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	protected final Float getMileAge() {
		return mileAge;
	}

	protected final void setMileAge(Float mileAge) {
		this.mileAge = mileAge;
	}

	protected final Double getCarPrice() {
		return carPrice;
	}

	protected final void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}

	protected void showCarInfor() {
		System.out.println("Car company = " + getCarCompany());
		System.out.println("Car type = " + getCarType());
		System.out.println("Car fuel type = " + getFuelType());
		System.out.println("Car mile age type = " + getMileAge());
		System.out.println("Car price = " + getCarPrice());
	}
	public static void main(String[] args) {
		// Honda
		CarOOP honda = new CarOOP("Honda", "City", "Petrol", 150f, 5000d);
		honda.showCarInfor();
		
		//Toyota
		CarOOP toyota = new CarOOP("Toyota", "Camry", "Diesel", 300f, 69999d);
		toyota.showCarInfor();
	}

}
