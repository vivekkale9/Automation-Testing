package redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Redbus {
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.redbus.com/");

        // Click on Help
        driver.findElement(By.xpath("//A[@href='/info/redcare'][text()='Help']")).click();

        // Wait for the new Help Center page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        // Switch focus to the Help Center window
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        String currentWindowHandle = driver.getWindowHandle();
        String helpCenterWindow = "";
        for (String handle : windowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                helpCenterWindow = handle;
                break;
            }
        }
        driver.switchTo().window(helpCenterWindow);

        // Wait for close button visibility and click
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//I[@class='icon-close']")));
        driver.findElement(By.xpath("//I[@class='icon-close']")).click();
    }
}
