package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExerciseWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver.findElement(By.xpath("//div[@id='content']/a[2]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
        System.out.println(driver.findElement(By.id("results")).getText());
    }
}
