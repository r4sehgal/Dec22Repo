package configuration;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config1 {
	
static public String readProperty(String PropName) throws IOException {
		
		FileReader input = new FileReader("C:\\Users\\r3sehgal\\Desktop\\New folder\\TanchanProject06\\src\\main\\java\\configuration\\config1.properties");
        
		Properties p1 = new Properties();
		
		
		p1.load(input);
		
		//System.out.println(p1.getProperty("username"));
		p1.getProperty(PropName);
		
		String Data=p1.getProperty(PropName);
		//return p1.getProperty(PropName);
		return Data;
		

}
}