package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class SwitchWindows {
    public static void main(String[] args) {
        /*
        String url = "https://rahulshettyacademy.com/loginpagePractise/#";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows = driver.getWindowHandles();   //[parentid,childid,subchildId]
        Iterator<String> it = windows.iterator();

        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);

        driver.findElement(By.cssSelector(".im-para.red")).getText();

         */

        String url = "https://the-internet.herokuapp.com/";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.xpath("//a [@href=\"/windows/new\"]")).click();

        Set <String> windows = driver.getWindowHandles();
        Iterator <String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);

        System.out.println(driver.findElement(By.tagName("h3")).getText());

        driver.switchTo().window(parentId);
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
