package ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteCookieNamed("sessionKey");
       // driver.manage().deleteAllCookies();

        driver.get("google.de");
    }
}
