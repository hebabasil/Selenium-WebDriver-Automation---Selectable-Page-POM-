package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SelectablePage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Tabs
    private By listTab = By.id("demo-tab-list");
    private By gridTab = By.id("demo-tab-grid");

    // Items
    private By listItem = By.xpath("//li[text()='Dapibus ac facilisis in']");
    private By gridItem = By.xpath("//li[text()='Three']");

    public SelectablePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Check if List tab is active
    public boolean isListTabActive() {
        WebElement tab = wait.until(ExpectedConditions.visibilityOfElementLocated(listTab));
        String classValue = tab.getAttribute("class");
        return  classValue.contains("active");
    }

    // Select item from List
    public boolean selectListItem() {
        WebElement item = wait.until(ExpectedConditions.elementToBeClickable(listItem));
        item.click();

        // Wait for the class to contain 'active'
        wait.until(ExpectedConditions.attributeContains(listItem, "class", "active"));
        
        WebElement updatedItem = driver.findElement(listItem);
        String classValue = updatedItem.getAttribute("class");
        return classValue.contains("active");
    }

    // Switch to Grid tab
    public void openGridTab() {
        WebElement tab = wait.until(ExpectedConditions.elementToBeClickable(gridTab));
        tab.click();
        // Wait until the grid tab becomes active
        wait.until(ExpectedConditions.attributeContains(gridTab, "class", "active"));
    }

    // Select item from Grid
    public boolean selectGridItem() {
        WebElement item = wait.until(ExpectedConditions.elementToBeClickable(gridItem));
        item.click();

        // Wait for the class to contain 'active'
        wait.until(ExpectedConditions.attributeContains(gridItem, "class", "active"));

        WebElement updatedItem = driver.findElement(gridItem);
        String classValue = updatedItem.getAttribute("class");
        return  classValue.contains("active");
    }
}
