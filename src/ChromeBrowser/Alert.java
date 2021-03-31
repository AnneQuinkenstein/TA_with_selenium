package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

    public static void main(String[] args) {
        String myName = "Anne";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // get Alert
        driver.findElement(By.id("name")).sendKeys(myName);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();                             // confirm alert

        driver.findElement(By.id("name")).sendKeys("hello");
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();                            // cancel alert

    }
}
