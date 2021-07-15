import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatingElementsTest
{
        @Test
        public void elementsQuiz1()
        {
            //Find chrome driver here (windows add .exe)
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

            //1 instantiate driver
            WebDriver driver = new ChromeDriver();

            //2 navigate to url
            driver.get("http://www.saucedemo.com/");

            //3Find element
            //4 Check state
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));

            //5 take action //6 record result
            Assert.assertTrue(element.isDisplayed());

            //7 Quit driver
            driver.quit();
        }
}
