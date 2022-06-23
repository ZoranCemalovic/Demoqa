package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SidebarPage {
    WebDriver driver;
    WebElement AlertsButton;
    WebElement AlertsWindowsButton;
    WebElement BrowserWindowsButton;
    WebElement FramesButton;
    WebElement ModelDialogsButton;
    WebElement NestedFrames;
    WebElement BooksButton;
    WebElement BookStoreAPIButton;
    WebElement BookStoreButton;
    WebElement LoginButton;
    WebElement ProfileButton;
    WebElement BrokenLinksImagesButton;
    WebElement ButtonsButton;
    WebElement CheckBoxButton;
    WebElement DynamicPropertiesButton;
    WebElement ElementsButton;
    WebElement LinksButton;
    WebElement RadioButtonButton;
    WebElement TextBoxButton;
    WebElement UploadAndDownloadButton;
    WebElement WebTablesButton;
    WebElement FormsButton;
    WebElement PracticeFormButton;
    WebElement DraggableButton;
    WebElement DroppableButton;
    WebElement InteractionsButton;
    WebElement ResizableButton;
    WebElement SelectableButton;
    WebElement SortableButton;
    WebElement AccordianButton;
    WebElement AutoCompleteButton;
    WebElement DatePickerButton;
    WebElement MenuButton;
    WebElement ProgressButton;
    WebElement SelectMenuButton;

    public WebElement getAlertsButton() {
        return AlertsButton;
    }

    public WebElement getAlertsWindowsButton() {
        return AlertsWindowsButton;
    }

    public WebElement getBrowserWindowsButton() {
        return BrowserWindowsButton;
    }

    public WebElement getFramesButton() {
        return FramesButton;
    }

    public WebElement getModelDialogsButton() {
        return ModelDialogsButton;
    }

    public WebElement getNestedFrames() {
        return NestedFrames;
    }

    public WebElement getBooksButton() {
        return BooksButton;
    }

    public WebElement getBookStoreAPIButton() {
        return BookStoreAPIButton;
    }

    public WebElement getBookStoreButton() {
        return BookStoreButton;
    }

    public WebElement getLoginButton() {
        return LoginButton;
    }

    public WebElement getProfileButton() {
        return ProfileButton;
    }

    public WebElement getBrokenLinksImagesButton() {
        return BrokenLinksImagesButton;
    }

    public WebElement getButtonsButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]"));
    }

    public WebElement getCheckBoxButton() {
        return CheckBoxButton;
    }

    public WebElement getDynamicPropertiesButton() {
        return DynamicPropertiesButton;
    }

    public WebElement getElementsButton() {
        return ElementsButton;
    }

    public WebElement getLinksButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[6]"));
    }

    public WebElement getRadioButtonButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]"));
    }

    public WebElement getTextBoxButton() {
        return TextBoxButton;
    }

    public WebElement getUploadAndDownloadButton() {
        return UploadAndDownloadButton;
    }

    public WebElement getWebTablesButton() {
        return WebTablesButton;
    }

    public WebElement getFormsButton() {
        return FormsButton;
    }

    public WebElement getPracticeFormButton() {
        return PracticeFormButton;
    }

    public WebElement getDraggableButton() {
        return DraggableButton;
    }

    public WebElement getDroppableButton() {
        return DroppableButton;
    }

    public WebElement getInteractionsButton() {
        return InteractionsButton;
    }

    public WebElement getResizableButton() {
        return ResizableButton;
    }

    public WebElement getSelectableButton() {
        return SelectableButton;
    }

    public WebElement getSortableButton() {
        return SortableButton;
    }

    public WebElement getAccordianButton() {
        return AccordianButton;
    }

    public WebElement getAutoCompleteButton() {
        return AutoCompleteButton;
    }

    public WebElement getDatePickerButton() {
        return DatePickerButton;
    }

    public WebElement getMenuButton() {
        return MenuButton;
    }

    public WebElement getProgressButton() {
        return ProgressButton;
    }

    public WebElement getSelectMenuButton() {
        return SelectMenuButton;
    }

    public WebElement getSliderButton() {
        return SliderButton;
    }

    public WebElement getTabsButton() {
        return TabsButton;
    }

    public WebElement getToolTipsButton() {
        return ToolTipsButton;
    }

    public WebElement getWidgetsButton() {
        return WidgetsButton;
    }

    WebElement SliderButton;
    WebElement TabsButton;
    WebElement ToolTipsButton;
    WebElement WidgetsButton;



    public SidebarPage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickOnButtonsButton(){
        getButtonsButton().click();
    }
    public void ClickOnRadioButton(){
        getRadioButtonButton().click();
    }
    public void ClickOnLinksButton(){
        getLinksButton().click();
    }
}
