package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
    public static void main(String[] args) {
        /*
        String url = "https://jqueryui.com/droppable/";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get(url);
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(frame);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        action.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
         */

        String url = "https://the-internet.herokuapp.com/";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        driver.get(url);
        driver.findElement(By.linkText("Nested Frames")).click();
        WebElement frameTop = driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(frameTop);
        WebElement frameTopMiddle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        driver.switchTo().frame(frameTopMiddle);
        System.out.println(driver.findElement(By.id("content")).getText());
    }
}
