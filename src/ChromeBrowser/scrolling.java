package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class scrolling {
    public static void main(String[] args) {
        String url = "https://rahulshettyacademy.com/AutomationPractice/";
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get(url);
        js.executeScript("window.scrollBy(200,500)");
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

        List<WebElement> values = driver.findElements(By.cssSelector("#product td:nth-child(4)"));
        int sum = 0;
        for (int i = 0; i < values.size(); i++) {
            sum += Integer.parseInt(values.get(i).getText());
        }

        int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());

        Assert.assertEquals(total, sum);

    }
}
