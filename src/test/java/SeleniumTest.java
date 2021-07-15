import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest
{
    //Navigate to this URL using another browser http://the-internet.herokuapp.com/
    //Navigate to this URL http://example.cypress.io/
    //Navigate to https://react-shopping-cart-67954.firebaseapp.com/
    //Using WebDriverManager

    @BeforeClass
    public static void setupClass()
    {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void test() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void cypressTest() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http:example.cypress.io/");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void reactTest() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("http://react-shopping-cart-67954.firebaseapp.com/");
        Thread.sleep(3000);
        driver.quit();
    }
}
