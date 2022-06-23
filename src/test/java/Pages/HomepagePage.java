package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePage {
    WebDriver driver;
    WebElement Elements;
    WebElement Forms;
    WebElement AlertsFramesWindows;
    WebElement Widgets;
    WebElement Interactions;
    WebElement BookStoreApplication;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElements() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]"));
    }

    public WebElement getForms() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]"));
    }

    public WebElement getAlertsFramesWindows() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]"));
    }

    public WebElement getWidgets() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]"));
    }

    public WebElement getInteractions() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[5]"));
    }

    public WebElement getBookStoreApplication() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]"));
    }
    public void ClickOnElements(){
        getElements().click();
    }
    public void ClickOnForms(){
        getForms().click();
    }
    public void ClickOnAlertsFramesWindows(){
        getAlertsFramesWindows().click();
    }
    public void ClickOnWidgets(){
        getWidgets().click();
    }
    public void ClickOnInteractions(){
        getInteractions().click();
    }
    public void ClickOnBookStoreApplication(){
        getBookStoreApplication().click();
    }
}
