import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatingElementsFinalTest
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
    public void locatorExam()
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //2. Navigate to URL
        driver.get("Http://www.saucedemo.com/");

        //CSS selectors //DATA TEST EXAMPLE
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        //Use CSS/Xpath
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector("#shopping_cart_container > a")).click();
        driver.findElement(By.cssSelector("#checkout")).click();

        //use best locator
        driver.findElement(By.cssSelector("#first-name")).sendKeys("first name");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("last name");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("zip");
        driver.findElement(By.id("continue")).click();

        //by link text
        driver.findElement(By.id("finish")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("#checkout_complete_container")).isDisplayed());
    }
}
