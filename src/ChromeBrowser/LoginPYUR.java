package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPYUR {
    static WebDriver driver;
    static WebDriverWait wait;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 40);
        driver.get("https://www.pyur.com/");
        driver.findElement(By.xpath("//a[contains(@class,'hide')]")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'btn--border-green')]")).click();
        driver.findElement(By.xpath("//input[@name=\"postalcode\"]")).sendKeys("10999");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='28']")));
        driver.findElement(By.xpath("//input[@id='28']")).sendKeys("Spreewaldplatz");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#33")));
        driver.findElement(By.cssSelector("input#33")).sendKeys("4, VH");
        driver.findElement(By.linkText("Jetzt prüfen")).click();

    }
}
