package businessfunctions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Config1;

public class BaseClass1 {

public static WebDriver driver = null;
	
	static public void openBrowserWithApp() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\r3sehgal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //implicit wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));  
	  driver.get(Config1.readProperty("url"));  
	}
	
	static public void closeBrowser() {
	driver.close();
		driver.quit();
	}
}
