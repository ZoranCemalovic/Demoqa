package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestElementsPage extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.get(excelReader.getStringData("URL", 39, 1));
    }

    @Test
    public void ButtonsTest(){
        //driver.get(excelReader.getStringData("URL", 12, 1));
        homepagePage.ClickOnElements();
        scrollIntoView(sidebarPage.getButtonsButton());
        sidebarPage.ClickOnButtonsButton();
        buttonsPage.DoubleClickOnDoubleClickMeButton();
        Assert.assertTrue(buttonsPage.getDoubleClickMeMessage().isDisplayed());
        Assert.assertEquals(buttonsPage.getDoubleClickMeMessage().getText(), "You have done a double click");
        buttonsPage.RightClickOnRightClickMeButton();
        Assert.assertTrue(buttonsPage.getRightClickMeMessage().isDisplayed());
        Assert.assertEquals(buttonsPage.getRightClickMeMessage().getText(), "You have done a right click");
        buttonsPage.ClickOnClickMeButton();
        Assert.assertTrue(buttonsPage.getClickMeMessage().isDisplayed());
        Assert.assertEquals(buttonsPage.getClickMeMessage().getText(), "You have done a dynamic click");

    }

    @Test
    public void RadioButton() {
        homepagePage.ClickOnElements();
        scrollIntoView(sidebarPage.getRadioButtonButton());
        sidebarPage.ClickOnRadioButton();
        clickElementJS(radioButtonPage.getYesButton());
        Assert.assertTrue(radioButtonPage.getYesButton().isSelected());
        Assert.assertEquals(radioButtonPage.getWhatIsSelectedMessage().getText(), "You have selected Yes");
        clickElementJS(radioButtonPage.getImpressiveButton());
        Assert.assertTrue(radioButtonPage.getImpressiveButton().isSelected());
        Assert.assertEquals(radioButtonPage.getWhatIsSelectedMessage().getText(), "You have selected Impressive");

    }

    @Test
    public void Links() throws InterruptedException {
        homepagePage.ClickOnElements();
        scrollIntoView(sidebarPage.getLinksButton());
        sidebarPage.ClickOnLinksButton();
        linksPage.getCreatedLink().click();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.getMessageForSelectedLinks().isDisplayed());
        Assert.assertEquals(linksPage.getMessageForSelectedLinks().getText(), "Link has responded with staus 201 and status text Created");
        linksPage.getNoContentLink().click();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.getMessageForSelectedLinks().isDisplayed());
        Assert.assertEquals(linksPage.getMessageForSelectedLinks().getText(), "Link has responded with staus 204 and status text No Content");
        linksPage.getMovedLink().click();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.getMessageForSelectedLinks().isDisplayed());
        Assert.assertEquals(linksPage.getMessageForSelectedLinks().getText(), "Link has responded with staus 301 and status text Moved Permanently");
        linksPage.getBadRequestLink().click();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.getMessageForSelectedLinks().isDisplayed());
        Assert.assertEquals(linksPage.getMessageForSelectedLinks().getText(), "Link has responded with staus 400 and status text Bad Request");
        linksPage.getUnauthorizedLink().click();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.getMessageForSelectedLinks().isDisplayed());
        Assert.assertEquals(linksPage.getMessageForSelectedLinks().getText(), "Link has responded with staus 401 and status text Unauthorized");
        linksPage.getForbiddenLink().click();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.getMessageForSelectedLinks().isDisplayed());
        Assert.assertEquals(linksPage.getMessageForSelectedLinks().getText(), "Link has responded with staus 403 and status text Forbidden");
        linksPage.getNotFoundLink().click();
        Thread.sleep(1000);
        Assert.assertTrue(linksPage.getMessageForSelectedLinks().isDisplayed());
        Assert.assertEquals(linksPage.getMessageForSelectedLinks().getText(), "Link has responded with staus 404 and status text Not Found");
    }

    @AfterMethod
    public void afterMethod() {
        driver.manage().deleteAllCookies();
    }
}
