package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.List;

public class calendar {
    public static void main(String[] args) {
        String url = "https://www.path2usa.com/travel-companions";
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 200);

        driver.get(url);

        driver.findElement(By.id("ez-accept-all")).click();


       //WebElement closeInfobox = driver.findElement(By.xpath("//div[contains(@class,'sumome-react-wysiwyg-close-button')]"));
       //wait.until(ExpectedConditions.elementToBeClickable(closeInfobox));
       //closeInfobox.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("travel_date")));
        driver.findElement(By.id("travel_date")).click();
        
        //Grab common attribute and put it into list and iterate
        List<WebElement> days = driver.findElements(By.xpath("//td[@class='day']"));

        for (int i = 0; i < days.size(); i ++){
           if( days.get(i).getText().equalsIgnoreCase("23")) {
               days.get(i).click();
            }
        }

    }
}
