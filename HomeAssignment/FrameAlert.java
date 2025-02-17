package HomeAssignment;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
         WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryItButton.click();
        Alert alert = driver.switchTo().alert();
        String alertText = "Selenium Test";
        alert.sendKeys(alertText);
        alert.accept();
        
        WebElement resultText = (WebElement) driver.findElement(By.id("demo"));
        if (resultText.getText().contains(alertText)) {
            System.out.println("Test Passed: Correct text displayed.");
        } else {
            System.out.println("Test Failed: Incorrect text displayed.");
        }
        
         driver.quit();
    }
}

