import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://www.redbus.com/");
        driver.findElement(By.xpath("//A[@href='/info/redcare'][text()='Help']")).click();
        Thread.sleep(2000);

        // Wait for the new page to load by waiting for an element on the new page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//I[@class='icon-close']")));

        driver.findElement(By.xpath("//I[@class='icon-close']")).click();

//        Actions act = new Actions(driver);
//        act.moveToElement(help).click().perform();
//        Thread.sleep(2000);
//        act.moveToElement(close).click().perform();

//        driver.findElement(By.partialLinkText("Triangle")).click();
//
//        WebElement dropdown = driver.findElement(By.name("angleunits"));
//
//        Select select = new Select(dropdown);
//        select.selectByIndex(1);
//        List<WebElement> l=select.getOptions();
//        l.size();
//
//
//        for (int i=0;i<l.size();i++)
//        {
//            String k=l.get(i).getText();
//            System.out.println(k);
//
//        }


        // Interact with elements

        // To find by id
//        driver.findElement(By.id("calcSearchTerm")).;

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
//        driver.findElement(By.xpath("(//SPAN[@class='rbmark'])[2]")).click();


    }
}