package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();
   /*     driver.get("https://www.facebook.com/");
        driver.findElement(By.id("u_0_h")).click();
        driver.findElement(By.id("email")).sendKeys("This is my first code");
        driver.findElement(By.id("pass")).sendKeys("123");
        driver.findElement(By.linkText("Log In")).click();
        driver.close(); */

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("This is my first code");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        String errorMessage = driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
        System.out.println(errorMessage);
        driver.close();

    }

}
