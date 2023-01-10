package businessfunctions;

import pagerepository.LoginPage1;
import pagerepository.LogoutPage1;

public class UserAccess1 extends BaseClass1{
	
	public static void Login(String email, String password) {
		

		  LoginPage1.enterEmail(email);
		  LoginPage1.enterPassword(password);
		  LoginPage1.loginBtn();
	}
	
	public static void Logout() {
		
		LogoutPage1.clickAccountLink();
		  LogoutPage1.clickLogOutLink();
	}

}
