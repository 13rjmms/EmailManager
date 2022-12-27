package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import Model.Email;

public class EmailController {
	
	private Email email;
	
	public EmailController() {
		this.email = new Email();
	}
	
	public void configurateEmail() {
		Properties properties = new Properties();
		try (InputStream input = new FileInputStream("C:\\Git\\Pessoal\\EmailManager\\src\\main\\resources\\config.properties")) {
		    properties.load(input);
		} catch (IOException ex) {
		    ex.printStackTrace();
		}

		
		this.email.setPass(properties.getProperty("email.password"));
		this.email.setUser(properties.getProperty("email.user"));
	}
	
	

}
