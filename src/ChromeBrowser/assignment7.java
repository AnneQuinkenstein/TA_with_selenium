package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class assignment7 {
    public static void main(String[] args) {
        String url ="https://rahulshettyacademy.com/AutomationPractice/";
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(200,500)");
        System.out.println(driver.findElements(By.xpath("//*[@name='courses']/tbody/tr")).size());

        List<WebElement> texts = driver.findElements(By.xpath("//*[@name='courses']/tbody/tr[3]/td"));

        System.out.println(texts.size()); 

        for (int i = 0; i < texts.size(); i ++) {
           System.out.println(texts.get(i).getText());
        }
    }
}
