package WebElementMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetObject {
    public static void main(String[] args){
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.calculator.net/");

        StoreObject.loan(driver).click();
    }
}
