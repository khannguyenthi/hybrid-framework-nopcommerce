package javaOOP;

public class Testing {

	public static void main(String[] args) {
		Topic_06_Getter_Setter topic = new Topic_06_Getter_Setter();
		
		topic.setPersonName("Khan");
		System.out.println(topic.getPersonName());
		
		topic.setPersonName("");
		System.out.println(topic.getPersonName());
	
	}

}
