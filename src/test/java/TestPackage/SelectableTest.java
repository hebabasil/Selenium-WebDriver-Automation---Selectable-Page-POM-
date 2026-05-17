package TestPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.SelectablePage;

public class SelectableTest extends TestBase {

    private SelectablePage page;

    @BeforeMethod
    public void setupPage() {
        driver.get(url);
        page = new SelectablePage(driver);
    }

    // Part 1: List tab active by default
    @Test(priority = 1)
    public void listActiveByDefaultTest() {
        Assert.assertTrue(page.isListTabActive(), "List tab is not active");
    }

    // Part 2: Select item from List
    @Test(priority = 2)
    public void checkSelectedList() {
        Assert.assertTrue(page.selectListItem(), "List item is not selected");
    }

    // Part 3: Select item from Grid
    @Test(priority = 3)
    public void checkSelectedGrid() {
        page.openGridTab();
        Assert.assertTrue(page.selectGridItem(), "Grid item is not selected");
    }
}
