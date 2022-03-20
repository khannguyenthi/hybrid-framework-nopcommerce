package javaOOP;

public class Topic_06_Getter_Setter {
	private String personName;
	private int personAge;
	private int personPhone;
	private float personBankAccountAmount;
	
	//Setter
	public void setPersonName(String personName) {
		if(personName == null || personName.isEmpty() || personName.isBlank()) {
			throw new IllegalArgumentException("Ten ko dc null");
		} else
		this.personName = personName;
	}

	public String getPersonName() {
		return this.personName;
	}
}
