import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class testCase3 {
    public static void main(String[] args) {
        //Create Driver Object for Chrome Browser
        //We will strictly implement methods of WebDriver
        //Class name = IEDriver
        //invoke .exe file first
        ///home/lisa/IdeaProjects
        System.setProperty("webdriver.ie.driver", "//home//lisa//IdeaProjects//IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        driver.get("https://www.google.de/");
        System.out.println(driver.getTitle());


    }
}
