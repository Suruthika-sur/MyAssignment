package HomeAssignment;


public class Elements extends Button {
    public static void main(String[] args) {
        // Creating objects and demonstrating method calls
        Button button = new Button();
        button.click();
        button.submit();

        TextField textField = new TextField();
        textField.setText("Hello World");
        System.out.println(textField.getText());

        CheckBoxButton checkBoxButton = new CheckBoxButton();
        checkBoxButton.click();
        checkBoxButton.clickCheckButton();

        RadioButton radioButton = new RadioButton();
        radioButton.click();
        radioButton.selectRadioButton();
    }
}