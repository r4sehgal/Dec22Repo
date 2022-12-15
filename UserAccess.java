package businessfunctions;

import pagerepository.AdminPage;
import pagerepository.LogOutPage;
import pagerepository.LoginPage;

public class UserAccess extends BaseClass{
	
	static public  void Login( String username, String Password) {
		
		LoginPage.enterUserName(username);	
		LoginPage.enterPassword(Password);
		LoginPage.loginBtn();
		AdminPage.clickOnAdmin();
		
		
	}
	
//	static public void addUser(String aname) {
		
	//	AdminPage.enterName(aname);
	//	AdminPage.clickSearch();
	//}
	
	
	static public void Logout() {
		LogOutPage.clickAccountLink();
		LogOutPage.clickLogOutLink();;
	}

}
