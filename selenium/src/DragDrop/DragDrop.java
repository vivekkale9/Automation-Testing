package DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a website
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

        // Locate draggable element
        WebElement draggableElement = driver.findElement(By.id("draggable"));

        // Locate droppable element
        WebElement droppableElement = driver.findElement(By.id("droppable"));

        // Create an instance of Actions class
        Actions actions = new Actions(driver);

        // Perform drag and drop operation
        actions.dragAndDrop(draggableElement, droppableElement).build().perform();
    }
}
