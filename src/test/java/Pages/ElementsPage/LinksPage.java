package Pages.ElementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksPage {
    WebDriver driver;
    WebElement HomeLink;
    WebElement HomeZ1CryLink;
    WebElement CreatedLink;
    WebElement NoContentLink;
    WebElement MovedLink;
    WebElement BadRequestLink;
    WebElement UnauthorizedLink;
    WebElement ForbiddenLink;
    WebElement NotFoundLink;
    WebElement MessageForSelectedLinks;

    public LinksPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHomeLink() {
        return driver.findElement(By.id("simpleLink"));
    }

    public WebElement getHomeZ1CryLink() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public WebElement getCreatedLink() {
        return driver.findElement(By.id("created"));
    }

    public WebElement getNoContentLink() {
        return driver.findElement(By.id("no-content"));
    }

    public WebElement getMovedLink() {
        return driver.findElement(By.id("moved"));
    }

    public WebElement getBadRequestLink() {
        return driver.findElement(By.id("bad-request"));
    }

    public WebElement getUnauthorizedLink() {
        return driver.findElement(By.id("unauthorized"));
    }

    public WebElement getForbiddenLink() {
        return driver.findElement(By.id("forbidden"));
    }

    public WebElement getNotFoundLink() {
        return driver.findElement(By.id("invalid-url"));
    }

    public WebElement getMessageForSelectedLinks() {
        return driver.findElement(By.id("linkResponse"));
    }

    public void ClickOnHomeLink(){
        getHomeLink().click();
    }
    public void ClickOnCreatedLink(){
        getCreatedLink().click();
    }
    public void ClickOnNoContentLink(){
        getNoContentLink().click();
    }
    public void ClickOnMovedLink(){
        getMovedLink().click();
    }
    public void ClickOnBadRequestLink(){
        getBadRequestLink().click();
    }
    public void ClickOnUnauthorizedLink(){
        getUnauthorizedLink().click();
    }
    public void ClickOnForbiddenLink(){
        getForbiddenLink().click();
    }
    public void ClickOnNotFoundLink(){
        getNotFoundLink().click();
    }
}
