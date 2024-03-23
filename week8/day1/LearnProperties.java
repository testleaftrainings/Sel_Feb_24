package week8.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LearnProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop  = new Properties();
		
		FileInputStream fis = new FileInputStream("./src/main/resources/credential.properties");
		
		prop.load(fis);
		
		String uname = prop.getProperty("username");
		
		String pwd = prop.getProperty("password");
		
		System.out.println(uname);
		System.out.println(pwd);
		
		String un = prop.getProperty("userName");
		System.out.println(un);
		
		
	}

}
