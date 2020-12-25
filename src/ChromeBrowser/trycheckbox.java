package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class trycheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("#checkbox-example [type='checkbox']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("#checkbox-example [name=\"checkBoxOption1\"]")).isSelected());
        driver.findElement(By.cssSelector("#checkbox-example [type='checkbox']")).click();
        Assert.assertFalse(driver.findElement(By.cssSelector("#checkbox-example [name=\"checkBoxOption1\"]")).isSelected());

        int numCheckboxes = driver.findElements(By.cssSelector("#checkbox-example [type='checkbox']")).size();
        Assert.assertEquals(numCheckboxes, 3);
        int numCheckboxesPage = driver.findElements(By.cssSelector("[type='checkbox']")).size();
        System.out.println(numCheckboxesPage); 
        driver.close();
    }
}
