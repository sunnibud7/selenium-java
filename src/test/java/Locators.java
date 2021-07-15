import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators
{
    WebDriver driver;

    @Before
    public void setUp()
    {
        //Where is chromedriver?
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Instantiate driver
        driver = new ChromeDriver();
    }
    @After
    public void tearDown()
    {
        //quit Driver
        driver.quit();
    }

    @Test
    public void typeOfLocators()
    {
        //navigate to URL
        driver.get("http://www.saucedemo.com/");

        //find element
        WebElement element;

        //By ID
        element =  driver.findElement(By.id("user-name"));
        //Name
        //driver.findElement(By.name("name of locator found inspect html"));
        //Class name
        driver.findElement(By.className("form_group"));
        //Tag name
        driver.findElement(By.tagName("input"));
        //CSS selector (right click on element and copy -> copy selector)
        //#user-name
        driver.findElement(By.cssSelector("#user-name"));
        //Xpath
        //  //*[@id="user-name"]
        driver.findElement(By.xpath("//*[@id=\"user-name\"]"));


        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        //Link text
        driver.findElement(By.linkText("Click me using this link text!"));
        //Partial link text
        driver.findElement(By.partialLinkText("this link text!"));

    }
}
