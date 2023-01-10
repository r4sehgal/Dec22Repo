package pagerepository;

import org.openqa.selenium.By;

import businessfunctions.BaseClass1;

public class LoginPage1 extends BaseClass1 {
	
	static By email = By.name("LEmail");

	 static By password = By.name("LPwd");
	 
	 static By loginBtn = By.id("LBtn");
	 
	  public static void enterEmail(String uemail) {
		  //driver.findElement(email).sendKeys("admin@yahoo.com");
		  driver.findElement(email).sendKeys(uemail); 
	  }
	  public static void enterPassword(String pwd) {
		//  driver.findElement(password).sendKeys("123456");
		driver.findElement(password).sendKeys(pwd);
	  }
	  public static void loginBtn() {
		  driver.findElement(loginBtn).click();
	  }

}
