package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass1;

public class LogoutPage1 extends BaseClass1{
	
	//static WebDriver driver = null;
	
		static By accountLink= By.id("dropdown03");
		static By logoutLink= By.linkText("Logout");
		
		public static void clickAccountLink() {
			
			driver.findElement(accountLink).click();
		}
		
		public static void clickLogOutLink() {
			driver.findElement(logoutLink).click();
		}

}
