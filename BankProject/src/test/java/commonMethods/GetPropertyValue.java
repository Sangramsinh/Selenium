package commonMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class GetPropertyValue {
	String result = "";
	InputStream inputStream = null;
	
	public String getPropertyValues(String fileName,String keyToSearch){
		
		try {
			Properties prop = new Properties();
			
			inputStream = new FileInputStream(fileName);
			
			if(inputStream != null){
				prop.load(inputStream);
			}else{
				throw new FileNotFoundException("Property file " + fileName + "not found ");
			}
			
			Enumeration<?> e = prop.propertyNames();
			
			while(e.hasMoreElements()){
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				if(key.toLowerCase().equals(keyToSearch)){
					result = value;
					break;
				}
			}			
		} catch (IOException e) {
			System.out.println("Exception : " + e);
		}		
		return result;
	}
	
}
