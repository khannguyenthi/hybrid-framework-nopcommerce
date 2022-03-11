package javaBasic;

public class Topic_14_StringFormat {
	//public static String CUSTOMER_INFO = "div[contains(@class,'account-navigation')]//a[text()='Customer info']";
	//public static String ADDRESS_LINK = "div[contains(@class,'account-navigation')]//a[text()='Addresses']";
	//public static String MY_PRODUCT_REVIEW_LINK = "div[contains(@class,'account-navigation')]//a[text()='My product reviews']";
	//public static String REWARD_POINTS_LINK = "div[contains(@class,'account-navigation')]//a[text()='Reward points']";
	
	public static String DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME = "div[contains(@class,'account-navigation')]//a[text()='%s']";
	
	public static String DYNAMIC_LINK_BY_PAGE_NAME = "div[contains(@class,'%s')]//a[text()='%s']";

	public static void  main(String[] args) {
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "Customer info");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "Addresses");
		
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "account-navigation", "Addresses");
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "footer-upper", "Search");
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "header-upper", "My account");
	}
	//1 - n tham số tự động
	public static void clickToLink(String dynamicLocator, String...params) {
		String locator = String.format(dynamicLocator, (Object[]) params);
		System.out.println("Click to: " + locator);
	}
}
