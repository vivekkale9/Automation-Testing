package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreObject {
    public static WebElement loan(WebDriver driver){
        WebElement link = driver.findElement(By.partialLinkText("Loan"));
        return (link);
    }
}
