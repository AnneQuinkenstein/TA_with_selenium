package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Actions - performing mouse over, keyboard interactions, context clicks on Element, double click,

public class ActionsDemo {
    public static void main(String[] args) {
        String url = "https://www.amazon.de/";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get(url);
        driver.manage().window().maximize();
        WebElement KontoUndListen =  driver.findElement(By.cssSelector("#nav-link-accountList"));

        //moves to specific element
        actions.moveToElement(KontoUndListen).build().perform();

        WebElement SearchInput = driver.findElement(By.cssSelector("#twotabsearchtextbox"));

        //move to SearchField, click + hold ShiftKey + sendKeys + select HELLO
        actions.moveToElement(SearchInput).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //rightClick
        actions.moveToElement(KontoUndListen).contextClick().build().perform();
    }
}
