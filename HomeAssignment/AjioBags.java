package HomeAssignment;




import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioBags {

	public static void main(String[] args) {
		// Set up ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		// Launch the Ajio website
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		// Wait for the page to load (we'll assume it works fine)
        try {
            Thread.sleep(3000); // Wait for the page to load
        } catch (InterruptedException e) {
            // Just let it pass, no handling.
        }

        // Search for "bags"
        WebElement searchBox = driver.findElement(By.name("searchVal"));
        searchBox.sendKeys("bags");
        searchBox.submit();

        // Wait for the results to load
        try {
            Thread.sleep(3000); // Wait for the results to load
        } catch (InterruptedException e) {
            // Just let it pass, no handling.
        }

        // Click on "Men" under "Gender"
        WebElement menFilter = driver.findElement(By.xpath("//label[contains(text(), 'Men')]"));
        menFilter.click();

        // Wait for the filter to apply
        try {
            Thread.sleep(3000); // Wait for the filter to apply
        } catch (InterruptedException e) {
            // Just let it pass, no handling.
        }

        // Click on "Fashion Bags" under "Category"
        WebElement fashionBagsFilter = driver.findElement(By.xpath("//label[contains(text(), 'Fashion Bags')]"));
        fashionBagsFilter.click();

        // Wait for the filter to apply
        try {
            Thread.sleep(3000); // Wait for the filter to apply
        } catch (InterruptedException e) {
            // Just let it pass, no handling.
        }

        // Get the count of items found
        WebElement itemCount = driver.findElement(By.className("length"));
        System.out.println("Total items found: " + itemCount.getText());

        // Get the list of brands
        List<WebElement> brandElements = driver.findElements(By.xpath("//div[@class='brand']"));
        List<String> brands = new ArrayList<>();
        for (WebElement brand : brandElements) {
            brands.add(brand.getText());
        }
        System.out.println("List of brands:");
        for (String brand : brands) {
            System.out.println(brand);
        }

        // Get the list of bag names
        List<WebElement> productNameElements = driver.findElements(By.xpath("//div[@class='nameCls']"));
        List<String> productNames = new ArrayList<>();
        for (WebElement productName : productNameElements) {
            productNames.add(productName.getText());
        }
        System.out.println("List of bag names:");
        for (String productName : productNames) {
            System.out.println(productName);
        }

        // Close the browser
        driver.quit();
    }
}