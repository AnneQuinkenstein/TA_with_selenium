package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();

        /*
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("u_0_h")).click();
        driver.findElement(By.id("email")).sendKeys("This is my first code");
        driver.findElement(By.id("pass")).sendKeys("123");
        driver.close(); */

/*      driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("This is my first code");
        driver.findElement(By.name("pw")).sendKeys("123");
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        String errorMessage = driver.findElement(By.xpath("//*[@id=\"error\"]")).getText();
        System.out.println(errorMessage);
        driver.close(); */

        driver.get("https://www.google.de/");
        driver.findElement(By.xpath("//form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Warschau");

    }

}
