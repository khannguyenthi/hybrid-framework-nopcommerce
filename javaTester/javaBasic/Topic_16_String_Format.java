package javaBasic;

public class Topic_16_String_Format {

	public static void main(String[] args) {
		String text = String.format("xpath=//div[contains(@class,'account-navigattion')]//a[text()='%s']", "Customer info");
		System.out.println(text);

	}

}
