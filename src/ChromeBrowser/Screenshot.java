package ChromeBrowser;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;

//package FileUtils is not activated ->

import java.io.File;

public class Screenshot {
    public static void main(String[] args) {
        String url = "https://google.de";
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();

//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //cast your driver-object to take screenshot
        //take Screenshot
        //get the output as a file
        //-> take Screenshot, whn google is opend and store it

       // FileUtils.copyFile(src, new File (C://home/lisa/IdeaProjects/Udemy/Java_puzzels/SeleniumIntroduction/Screenshot.png)
        //writing file to lokal machine
    }
}
