import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics
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
        driver.quit();
    }

    @Test
    public void basicSeleniumTesting()
    {
        driver.get("https://www.saucedemo.com/");

        //Find and Act
        //driver.findElement(By.id("")).click();

        //Find, Store, and Act
        //Store it to do multiple actions on an element so we can do signIn.WHATEVER instead of repeating .find element
        WebElement signIn = driver.findElement(By.id("login-button"));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //signIn.submit();
        signIn.click();



        // .click() click an element
        // .clear() text field or etc, can clear before typing in text
        // .sendKeys() send specific element as input ex) entering id or password
        // .submit() finds button element and clicks ex) google search, log in button etc
        // .getText() shows text of the element
        // .getTagName() shows TagName of element
        // .getAttribute() react/angular uses attributes often, use attribute to decide whether element is visible or not

        // bottom two has a chance to not work accordance to HTML
        // .isDisplayed() is it displayed on web?
        // .isEnabled() is the button enabled? for us to interact?

        // ADVANCED ELEMENT ACTIONS
        /* locate the element and store it

        ex) WebElement element = driver.findElement(By.id("sign-in));
        Actions action = new Actions(driver);
        action.click(element).build().perform();

        MOUSE ACTIONS

        click(WebElement target): Clicks in middle of given element

        clickAndHold(WebElement target): Clicks without releasing at current mouse location

        contextClick(WebElement target): Performs a context-click at middle of given element. First performs a mouseMove to location of element

        doubleClick(WebElement target): Performs double click at middle of given element

        dragAndDrop(WebElement target, WebElement target): performs click and hold at location -> moves to location of target element then releases mouse

        dragAndDropBy(WebElement target, int xOffset, int yOffset): Click and hold then moves by given offset, then releases mouse

        moveToElement(WebElement target): Moves mouse to middle of element

        moveToElement(WebElement target, int xOffset, int yOffset): Moves mouse to an offset from top left corner of element

        release(): releases the depressed left mouse button at current mouse location
         */

        /* Keyboard Interactions extremely flaky so use it as last resort

           keyDown(java.lang.CharSequence key) :  performs a modifier key press
           keyUp(java.lang.CharSequence key) : performs a modifier key release
           sendKeys(java.lang.CharSequence... keys) : Sends keys to the active element

         */

        /* EXAMPLE OF ACTION
        Actions actions = new Actions(driver);
        actions. and follow below.

        Hover
        action.moveToElement(element).build().perform();

         Drag and Drop
         action.dragAndDrop(element, element2).build().perform();

         click pause release

        action.clickAndHold(element).pause(100).release().build().perform();

         */
    }
}
