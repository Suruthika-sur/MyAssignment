package HomeAssignment;

import org.testng.TestNG;

public class loginTestData extends TestNG {
	 public void enterUsername() {
	     System.out.println("Entering username...");
	 }

	 public void enterPassword() {
	     System.out.println("Entering password...");
	 }
	
	 public static void main(String[] args) {
    loginTestData log=new loginTestData();
    log.enterUsername();
    log.enterPassword();
    log.enterCredentials();
    log.enterPassword();
}

	private void enterCredentials() {
		
	}
}
