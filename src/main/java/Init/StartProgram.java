package Init;

import Controller.EmailController;
import Model.Email;

public class StartProgram {
	
	public StartProgram() {
		
	}
	
	public void start() {
		
		EmailController emailController = new  EmailController();
		emailController.configurateEmail();
	}

}
