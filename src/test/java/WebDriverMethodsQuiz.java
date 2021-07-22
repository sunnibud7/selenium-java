import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertTrue;



public class WebDriverMethodsQuiz {
    WebDriver driver;
    WebElement element;

    @Before
    public void setUp() {

        //Telling system where to find Chromedriver. Add .exe for windows platform
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Instantiate the driver
        driver = new ChromeDriver();
    }

    //@After
    //public void tearDown() {
    //    driver.quit();
    //}

   /* @Test
    public void quizPart1() {
        //GO https://the-internet.herokuapp.com/dropdown
        //select option 1 from dropdown
        //assert option 1 is selected
        //assert that option 2 is NOT selected
        driver.get("https://the-internet.herokuapp.com/dropdown");
        //These worked too but better method below!
        //Select dropDownList = new Select(driver.findElement(By.id("dropdown")));
        //dropDownList.selectByVisibleText("Option 1");

        element = driver.findElement(By.id("dropdown"));
        element.click();
        WebElement option1 = element.findElement(By.cssSelector("option[value = '1']"));
        WebElement option2 = element.findElement(By.cssSelector("option[value = '2']"));
        option1.click();
        assertTrue(option1.isSelected());
        assertFalse(option2.isSelected());
    }
*/
    @Test
    public void quizPart2() {
        //Go https://the-internet.herokuapp.com/hovers
        //hover over 1st image
        //assert that on hover there is text that is displayed below "name: user1"
        driver.get("https://the-internet.herokuapp.com/hovers");
        element = driver.findElement(By.className("figure"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();

        element = driver.findElement(By.xpath("//*[contains(text(),'name: user1')]"));
        assertTrue(element.isDisplayed());
    }
/*
    @Test
    public void quizPart3()
    {
    //Go https://the-internet.herokuapp.com/context_menu
        // Right click
        //close alert
        //driver.switchTo().alert().accept();
    }

    @Test
    public void quizPart4()
    {
        //Go https://the-internet.herokuapp.com/key_presses
        //send Right arrow key to input box
        //assert that you got this text back "You Entered: RIGHT"
    }

    @Test
    public void quizPart5()
    {
        //Go https://ultimateqa.com/simple-html-elements-for-automation/
        //find element with text "Clickable Icon"
        //Assert href attribute = https://ultimateqa.com/link-success/
        //get CSS value: "background-origin"
        //Assert that it equals "padding-box"
    }
    */

}







