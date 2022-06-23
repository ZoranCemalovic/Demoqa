package Pages.ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage {
    WebDriver driver;
    WebElement ToggleHomeButton;


    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getToggleHomeButton() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-close"));
    }
    public void ClickOnToggleHomeButton(){
        getToggleHomeButton().click();
    }
}
