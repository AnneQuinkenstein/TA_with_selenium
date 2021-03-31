package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class assignment8 {
    public static void main(String[] args) {
        String url ="https://rahulshettyacademy.com/AutomationPractice/";
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get(url);

        driver.findElement(By.id("autocomplete")).sendKeys("ger");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));
        List<WebElement> countries = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

        for (int i = 0; i < countries.size(); i ++) {
            if (countries.get(i).getText().equalsIgnoreCase("Germany"))
            countries.get(i).click();
            break;
        }
        Assert.assertEquals(driver.findElement(By.id("autocomplete")).getText(),"Germany");
    }
}
