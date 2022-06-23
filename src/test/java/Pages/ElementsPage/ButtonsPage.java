package Pages.ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage {
    WebDriver driver;
    WebElement DoubleClickMeButton;
    WebElement RightClickMeButton;
    WebElement ClickMeButton;
    WebElement DoubleClickMeMessage;
    WebElement RightClickMeMessage;
    WebElement ClickMeMessage;

    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDoubleClickMeButton() {
        return driver.findElement(By.id("doubleClickBtn"));
    }

    public WebElement getRightClickMeButton() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getClickMeButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
    }

    public WebElement getDoubleClickMeMessage() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getRightClickMeMessage() {
        return driver.findElement(By.id("rightClickMessage"));
    }

    public WebElement getClickMeMessage() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    public void DoubleClickOnDoubleClickMeButton() {
        Actions actions = new Actions(driver);
        actions.doubleClick(getDoubleClickMeButton()).perform();
    }
    public void RightClickOnRightClickMeButton() {
        Actions actions = new Actions(driver);
        actions.contextClick(getRightClickMeButton()).perform();
    }
    public void ClickOnClickMeButton() {
        getClickMeButton().click();
    }
}
