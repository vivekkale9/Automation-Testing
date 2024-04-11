package School;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class School {
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://schooledn.py.gov.in/admission/hsc.html");

        Actions actions = new Actions(driver);

        // Locating the "Schools" link on the webpage
        WebElement school = driver.findElement(By.xpath("//A[@href='#'][text()='Schools']/self::A"));

        WebElement govt = driver.findElement(By.xpath("//A[@href='#'][text()='Government']/self::A"));

        WebElement state = driver.findElement(By.xpath("//A[@href='../schools/stateGovt.html'][text()='State Govt']/self::A"));

        actions.click(school).perform();

        actions.moveToElement(govt).click().perform();

//        actions.click(govt).perform();

        actions.moveToElement(state).perform();

        actions.click(state).perform();
    }
}
