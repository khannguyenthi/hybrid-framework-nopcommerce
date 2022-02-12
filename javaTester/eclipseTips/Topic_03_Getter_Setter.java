package eclipseTips;

public class Topic_03_Getter_Setter {
	private String carName;
	private String carType;
	private String carColor;
	private String carMachine;
	
	/**
	 * Get car name
	 * @author nashtech
	 * @return the carType
	 */
	public final String getCarType() {
		return carType;
	}

	/**
	 * @param carType the carType to set
	 */
	public final void setCarType(String carType) {
		this.carType = carType;
	}

	/**
	 * @return the carColor
	 */
	public final String getCarColor() {
		return carColor;
	}

	/**
	 * @param carColor the carColor to set
	 */
	public final void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	/**
	 * @return the carMachine
	 */
	public final String getCarMachine() {
		return carMachine;
	}

	/**
	 * @param carMachine the carMachine to set
	 */
	public final void setCarMachine(String carMachine) {
		this.carMachine = carMachine;
	}

	//Getter
	public String getCarName() {
		return carName;
	}
	
	//Setter
	public void setCarName(String carName) {
		this.carName = carName;
	}
}
	
	