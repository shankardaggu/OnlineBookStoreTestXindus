import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlineBookStoreTest{

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shank\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        // Maximize window or set window size
        driver.manage().window().maximize();
        // Navigate to the application URL
        driver.get("https://www.bookchor.com/");
    }

    @Test(priority = 1)
    public void userRegistrationTest() {

    }

    @Test(priority = 2)
    public void userLoginTest() {
        WebElement loginEl = driver.findElement(By.linkText("Login"));
        loginEl.click();
        WebElement mobilenumEl = driver.findElement(By.id("login_phone"));
        mobilenumEl.sendKeys("7032784434");
        WebElement continueEl = driver.findElement(By.id("lg_ph"));
        continueEl.click();

        WebElement ct2 = driver.findElement(By.className("login-btn"));
        ct2.click();

    }

    @Test(priority = 3)
    public void passwordResetTest() {

    }

    @Test(priority = 4)
    public void bookCatalogTest() {

        WebElement categoryEl = driver.findElement(By.className("Category-click"));
        categoryEl.click();
        WebElement fictionEl = driver.findElement(By.linkText("Fiction"));
        fictionEl.click();
        WebElement actionAndAdventureEl = driver.findElement(By.linkText("Action & Adventure"));
        actionAndAdventureEl.click();
        WebElement BookEl = driver.findElement(By.linkText("The Death Cure"));
        BookEl.click();

    }

    @Test(priority = 2)
    public void shoppingCartTest() {
        WebElement categoryEl = driver.findElement(By.className("Category-click"));
        categoryEl.click();
        WebElement fictionEl = driver.findElement(By.linkText("Fiction"));
        fictionEl.click();
        WebElement actionAndAdventureEl = driver.findElement(By.linkText("Action & Adventure"));
        actionAndAdventureEl.click();
        WebElement BookEl = driver.findElement(By.linkText("The Death Cure"));
        BookEl.click();
        WebElement addToCart = driver.findElement(By.linkText("Add to Cart"));
        addToCart.click();

    }

    @Test(priority = 6)
    public void checkoutTest() {

    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver instance
        driver.quit();
    }
}
