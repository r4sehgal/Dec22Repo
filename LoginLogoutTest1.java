package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import businessfunctions.BaseClass1;
import businessfunctions.UserAccess1;
import configuration.Config1;
import pagerepository.LoginPage1;
import pagerepository.LogoutPage1;

import utilityfunctions.ExcelUtil1;

public class LoginLogoutTest1 extends BaseClass1 {
  @Test
  public void test1() throws InterruptedException, IOException {
	 // System.setProperty("webdriver.crome.driver", "C:\\Users\\kulpa\\Downloads\\chromedriver_win32\\chromedriver");
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("http://tanchan-001-site3.btempurl.com/production/login");
	  
	  BaseClass1.openBrowserWithApp();
		
  //  WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(6000));
		
	//	WebElement usernamefield=wait.until(ExpectedConditions.elementToBeClickable(By.name("LEmail")));
	//	usernamefield.sendKeys("admin@yahoo.com");
	  
//	  LoginPage1.enterEmail("admin@yahoo.com");
//	  LoginPage1.enterPassword("123456");
//	  LoginPage1.loginBtn();
	  
	//  UserAccess1.Login("admin@yahoo.com", "123456");
	// UserAccess1.Login(Config1.readProperty("email"), Config1.readProperty("password"));
	  
	  int rowcount= ExcelUtil1.getNoOfRows();
		 
		 for (int i=1; i<rowcount-1; i++) {
		  
	  //  UserAccess1.Login(Config1.readProperty("email"), Config1.readProperty("password"));
	  UserAccess1.Login(ExcelUtil1.getData(i, 0), ExcelUtil1.getData(i, 1));
	  // UserAccess1.Logout();
		 }
	  
	  
//		driver.findElement(By.name("LEmail")).sendKeys("admin@yahoo.com");
//        driver.findElement(By.name("LPwd")).sendKeys("123456");
//		driver.findElement(By.id("LBtn")).click();
	  
	  UserAccess1.Logout();
//        LogoutPage1.clickAccountLink();
//        LogoutPage1.clickLogOutLink();
	  
	  
		//WebElement abc=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")));
		//abc.click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[1]/label")).sendKeys("Admin");
		//driver.findElement(By.linkText("-- Select --")).click();
	 
  }
}
