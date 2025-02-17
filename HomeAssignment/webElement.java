package HomeAssignment;




public class webElement {
 public void click() {
     System.out.println("Element clicked");
 }

 public void setText(String text) {
     System.out.println("Text set to: " + text);
 }

public static void main(String[] args) {
	webElement web=new webElement();
	web.click();
	
	
}
}