package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class exersice {
    public static void main(String[] args) {
        String url = "https://rahulshettyacademy.com/AutomationPractice/";
        int optionNum = 2;
        String labelOption = "";

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        // 1. select Checkbox
        driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label["+ optionNum + "]/input")).click();


        // 2. grab label of selected Option
        List<WebElement> options = driver.findElements(By.xpath("//div[@id='checkbox-example']/fieldset/label/input"));
        for ( WebElement option : options ) {
           if (option.isSelected()) {
              String id =  option.getAttribute("id");
               labelOption = driver.findElement(By.xpath("//*[@id='" + id + "']/parent::label")).getText();
               break;
            }
        }

        // 3. select an Option in Dropdown. Option should come from step 2
        WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByVisibleText(labelOption);

        // 4. enter the Label-Text inside Edit Box
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(labelOption);

        // 5. Click Alert and verify if Text grabbed from Step 2 is present in the popup message.
        driver.findElement(By.id("alertbtn")).click();
        System.out.println();

        String[] helloName = driver.switchTo().alert().getText().split(",");
        String[] name = helloName[0].split(" ");

        Assert.assertEquals(name[1],"Option" + optionNum);
        driver.switchTo().alert().accept();

    }
}
