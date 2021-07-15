import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


public class LocatingElementsTestFin
{
    WebDriver driver;

    @Before
    public void setUp()
    {
        //Telling system where to find Chromedriver. Add .exe for windows platform
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //Instantiate the driver
        driver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {
        //Quit driver
        driver.quit();
    }

    @Test
    public void testing()
    {
        //navigate to URL
        driver.get("https://www.saucedemo.com/");

        //Find element and check state **time out in seconds just add number and it will show automatically.

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));

        //Take action/ record result
        Assert.assertTrue(element.isDisplayed());



    }
}
