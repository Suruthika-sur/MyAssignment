package HomeAssignment;

import org.openqa.selenium.remote.RemoteWebElement;

public class TextField extends RemoteWebElement {
	 public String getText() {
	     
	     return "Sample text";
	 }
	
public static void main(String[] args) {
	TextField txt=new TextField();
	txt.getText();
	txt.click();
	txt.setText("Happy");
}

void setText(String string) {
	
}
}