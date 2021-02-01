package com.qa.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
     private Properties prop;
    /**
     * https://www.toolsqa.com/cucumber-video-tutorials/
     * @return
     */
	 public Properties init_prop()  {
		prop= new Properties();
		
		try {
		FileInputStream ip= new FileInputStream("./src/test/resources/config/config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	  }
	   public String getUrl(String url)
	 {
		String samUrl=prop.getProperty(url+"URL");
		// String samUrl="https://sam.cengage.com/App/login?ReturnUrl=%2f";
		return samUrl;
	  }
     public String getUername(String user)
	 {
	    String username=prop.getProperty(user+"student.userName");
		return username;
	 }
	  public String getPassword(String pwd)
	    {
	   	 String password=prop.getProperty(pwd+"student.password");
			return password;
	    }
	
	

}
