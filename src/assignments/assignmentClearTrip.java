package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class assignmentClearTrip {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.cleartrip.com/");
        WebElement dropdownNumAdults = driver.findElement(By.id("Adults"));
        Select numAdults = new Select(dropdownNumAdults);
        numAdults.selectByValue("3");

        WebElement dropdownNumChildren = driver.findElement(By.id("Childrens"));
        Select numChildren = new Select(dropdownNumChildren);
        numChildren.selectByValue("1");

        driver.findElement(By.id("DepartDate")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

        driver.findElement(By.id("SearchBtn")).click();

        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

        driver.findElement(By.id("FromTag")).sendKeys("Ber");
        Thread.sleep(3000);
        List<WebElement> expTowns = driver.findElements(By.cssSelector("a[id*='ui-id']"));

        for (WebElement expTown : expTowns) {
            if (expTown.getText().equalsIgnoreCase("Berne, CH - Belp (BRN)")) {
                expTown.click();
                break;
            }
        }
    }
}
