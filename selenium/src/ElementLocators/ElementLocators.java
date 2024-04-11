package ElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.calculator.net/");

        // To find by id
        driver.findElement(By.id("calcSearchTerm")).sendKeys("hi");

        // To find by link text
//        driver.findElement(By.linkText("Mortgage Calculator")).click();

        // To find by css selectpr
//        driver.findElement(By.cssSelector(".inlongest")).sendKeys("cssselector");

        // TO find by name
//        driver.findElement(By.name("calcSearchTerm")).sendKeys("by name");

        // To find by partial link text
//        driver.findElement(By.partialLinkText("Mortgage")).click();

        // To find by class name
//        driver.findElement(By.className("inlongest")).sendKeys("by class name");

        // Find the Search caluculator by its XPath
//        WebElement Search = driver.findElement(By.xpath("//INPUT[@id='calcSearchTerm']"));
//        Search.sendKeys("example");
    }
}
