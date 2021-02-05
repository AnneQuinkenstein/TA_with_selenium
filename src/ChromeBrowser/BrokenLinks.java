package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        String startUrl = "https://rahulshettyacademy.com/AutomationPractice/";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();
        SoftAssert a = new SoftAssert();

        driver.get(startUrl);

        //Step 1 - IS to get all urls tied up to the links using Selenium
        // Java methods will call URL's and gets you the status code
        //if status code >400 then that url is not working-> link which tied to url is broken

        List<WebElement> links = driver.findElements(By.cssSelector(".gf-li a"));

        for (WebElement link : links) {
                String url= link.getAttribute("href");
                HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int respCode = conn.getResponseCode();
                System.out.println(respCode);
            a.assertTrue(respCode<400, "The link with Text "+link.getText()+" is broken with code " +respCode);
        }
        a.assertAll();
    }


}
