package Pages.ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
    WebDriver driver;
    WebElement YesButton;
    WebElement ImpressiveButton;
    WebElement NoButton;
    WebElement WhatIsSelectedMessage;

    public WebElement getYesButton() {
        return driver.findElement(By.id("yesRadio"));
    }

    public WebElement getImpressiveButton() {
        return driver.findElement(By.id("impressiveRadio"));
    }

    public WebElement getNoButton() {
        return driver.findElement(By.id("noRadio"));
    }

    public WebElement getWhatIsSelectedMessage() {
        return driver.findElement(By.className("mt-3"));
    }

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickOnYesButton(){
        getYesButton().click();
    }
    public void ClickOnImpressiveButton(){
        getImpressiveButton().click();
    }
    public void ClickOnNoButton(){
        getNoButton().click();
    }
}
