import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_Chrome {
    public static void main(String[] args) {
        //Create Driver Object for Chrome Browser
        //We will strictly implement methods of WebDriver
        //Class name = ChromeDriver
        //invoke .exe file first
        ///home/lisa/IdeaProjects
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.de/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.get("https://de.yahoo.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.close(); //closes current browser
        driver.quit();  //closes all browser selenium opened

    }
}
