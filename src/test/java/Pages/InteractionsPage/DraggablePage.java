package Pages.InteractionsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DraggablePage {
    WebDriver driver;
    WebElement SimpleTab;
    WebElement AxisRestrictedTab;
    WebElement ContainerRestrictedTab;
    WebElement CursorStyleTab;
    WebElement DragMeField;
    WebElement OnlyXField;
    WebElement OnlyYField;
    WebElement ContainedBoxField;
    WebElement ContainedParentField;
    WebElement CursorAtTheCentreField;
    WebElement CursorAtTopLeftField;
    WebElement CursorAtBottomField;


    public DraggablePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSimpleTab() {
        return driver.findElement(By.id("draggableExample-tab-simple"));
    }

    public WebElement getAxisRestrictedTab() {
        return driver.findElement(By.id("draggableExample-tab-axisRestriction"));
    }

    public WebElement getContainerRestrictedTab() {
        return driver.findElement(By.id("draggableExample-tab-containerRestriction"));
    }

    public WebElement getCursorStyleTab() {
        return driver.findElement(By.id("draggableExample-tab-cursorStyle"));
    }

    public WebElement getDragMeField() {
        return driver.findElement(By.id("dragBox"));
    }

    public WebElement getOnlyXField() {
        return driver.findElement(By.id("restrictedX"));
    }

    public WebElement getOnlyYField() {
        return driver.findElement(By.id("restrictedY"));
    }

    public WebElement getContainedBoxField() {
        return driver.findElement(By.cssSelector(".draggable.ui-widget-content.ui-draggable.ui-draggable-handle"));
    }

    public WebElement getContainedParentField() {
        return driver.findElement(By.cssSelector(".ui-widget-header.ui-draggable.ui-draggable-handle"));
    }

    public WebElement getCursorAtTheCentreField() {
        return driver.findElement(By.id("cursorCenter"));
    }

    public WebElement getCursorAtTopLeftField() {
        return driver.findElement(By.id("cursorTopLeft"));
    }

    public WebElement getCursorAtBottomField() {
        return driver.findElement(By.id("cursorBottom"));
    }


    public void clickOnSimpleTab() {
        getSimpleTab().click();
    }
    public void clickOnAxisRestrictedTab() {
        getAxisRestrictedTab().click();
    }
    public void clickOnContainerRestrictedTab() {
        getContainerRestrictedTab().click();
    }
    public void clickOnCursorStyleTab() {
        getCursorStyleTab().click();
    }

}
