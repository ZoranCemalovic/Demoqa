package Base;

import Pages.AlertsWindowsPage.*;
import Pages.BooksPage.*;
import Pages.ElementsPage.*;
import Pages.FormsPage.PracticeFormPage;
import Pages.HomepagePage;
import Pages.InteractionsPage.*;
import Pages.SidebarPage;
import Pages.WidgetsPage.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public AlertsPage alertsPage;
    public BrowserWindowsPage browserWindowsPage;
    public FramesPage framesPage;
    public ModelDialogsPage modelDialogsPage;
    public NestedFramesPage nestedFramesPage;
    public BookStoreAPIPage bookStoreAPIPage;
    public BookStorePage bookStorePage;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public BrokenLinksImagesPage brokenLinksImagesPage;
    public ButtonsPage buttonsPage;
    public CheckBoxPage checkBoxPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public LinksPage linksPage;
    public RadioButtonPage radioButtonPage;
    public TextBoxPage textBoxPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public WebTablesPage webTablesPage;
    public PracticeFormPage practiceFormPage;
    public DraggablePage draggablePage;
    public DroppablePage droppablePage;
    public ResizablePage resizablePage;
    public SelectablePage selectablePage;
    public SortablePage sortablePage;
    public AccordianPage accordianPage;
    public AutoCompletePage autoCompletePage;
    public DatePickerPage datePickerPage;
    public MenuPage menuPage;
    public ProgressPage progressPage;
    public SelectMenuPage selectMenuPage;
    public SliderPage sliderPage;
    public TabsPage tabsPage;
    public ToolTipsPage toolTipsPage;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\Zoran\\Desktop\\Demoqa.xlsx");
                alertsPage=new AlertsPage(driver);
                browserWindowsPage=new BrowserWindowsPage(driver);
                framesPage=new FramesPage(driver);
                modelDialogsPage=new ModelDialogsPage(driver);
                nestedFramesPage=new NestedFramesPage(driver);
                bookStoreAPIPage=new BookStoreAPIPage(driver);
                bookStorePage=new BookStorePage(driver);
                loginPage=new LoginPage(driver);
                profilePage=new ProfilePage(driver);
                brokenLinksImagesPage=new BrokenLinksImagesPage(driver);
                buttonsPage=new ButtonsPage(driver);
                checkBoxPage=new CheckBoxPage(driver);
                dynamicPropertiesPage=new DynamicPropertiesPage(driver);
                linksPage=new LinksPage(driver);
                radioButtonPage=new RadioButtonPage(driver);
                textBoxPage=new TextBoxPage(driver);
                uploadAndDownloadPage=new UploadAndDownloadPage(driver);
                webTablesPage=new WebTablesPage(driver);
                practiceFormPage=new PracticeFormPage(driver);
                draggablePage=new DraggablePage(driver);
                droppablePage=new DroppablePage(driver);
                resizablePage=new ResizablePage(driver);
                selectablePage=new SelectablePage(driver);
                sortablePage=new SortablePage(driver);
                accordianPage=new AccordianPage(driver);
                autoCompletePage=new AutoCompletePage(driver);
                datePickerPage=new DatePickerPage(driver);
                menuPage=new MenuPage(driver);
                progressPage=new ProgressPage(driver);
                selectMenuPage=new SelectMenuPage(driver);
                sliderPage=new SliderPage(driver);
                tabsPage=new TabsPage(driver);
                toolTipsPage=new ToolTipsPage(driver);
                homepagePage=new HomepagePage(driver);
                sidebarPage=new SidebarPage(driver);

    }
    public void visibilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickabilityWait(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public boolean elementVisibility(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
    public void clickElementJS(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    }


    @AfterClass
        public void tearDown() {
            //driver.close();
            //driver.quit();
    }
}
