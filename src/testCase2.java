import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class testCase2 {
    public static void main(String[] args) {
        //Create Driver Object for Chrome Browser
        //We will strictly implement methods of WebDriver
        //Class name = GeckoDriver
        //invoke .exe file first
        ///home/lisa/IdeaProjects
        System.setProperty("webdriver.gecko.driver", "//home//lisa//IdeaProjects//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.de/");
        System.out.println(driver.getTitle());
    }
}
