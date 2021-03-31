package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ALotOfLinksClicking {
    public static void main(String[] args) {
        String url = "https://rahulshettyacademy.com/AutomationPractice/";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        System.out.println(driver.findElements(By.tagName("a")).size());

        //Limiting Webdriver Scope
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        WebElement columndriver = footerdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());

        //Get all Links from a Column and rightclick on them to open in new tap
        for(int i=1;  i<columndriver.findElements(By.tagName("a")).size(); i++){
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);  //pass Keyboard Event to sendKeys
        }

        //iterate through all taps and get title

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while(it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}
