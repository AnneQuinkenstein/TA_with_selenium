package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtest

{

    public static void main(String[] args) throws InterruptedException

    {

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");

        System.out.println(driver.getTitle());

        Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@id='travel_date']")).click();

        WebElement month = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));

        while(!month.getText().contains("December 2020"))

        {

            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

            System.out.println(month.getText());

        }

        int count= driver.findElements(By.cssSelector("td[class*='day']")).size();

        for(int i=0;i<count;i++)

        {

            String text=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();

            if(text.equalsIgnoreCase("26"))

            {

                // driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();

                driver.findElements(By.xpath("//td[@class='day']")).get(i).click();

                System.out.println(text);

                break;

            }

        }

    }

}