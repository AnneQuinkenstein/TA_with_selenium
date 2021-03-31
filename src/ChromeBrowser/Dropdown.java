package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;


public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//Udemy//Browserdriver//chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        //static Dropdown - Select

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"USD");
        dropdown.selectByVisibleText("AED");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"AED");
        dropdown.selectByValue("INR");
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"INR");

        //Dropdown by ID
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
        for (int i = 1; i < 6; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        Assert.assertEquals(driver.findElement(By.id("spanAudlt")).getText(), "6");
        driver.findElement(By.id("btnclosepaxoption")).click();

        //dynamic Dropdown with indexes
        driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        Thread.sleep(2000L);
        driver.findElement(By.cssSelector("a[value='AMD']")).click();
        Thread.sleep(2000L);
       // driver.findElement(By.xpath("(//a[@value='KBL'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='JLR']")).click();

        //calender
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();

        //autocomplete Options
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List <WebElement> options = driver.findElements(By.cssSelector("li.ui-menu-item a"));

        for ( WebElement option : options ) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }

        //checkboxes
        Assert.assertFalse(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).click();                            //contains in CSS Selectors is *
        Assert.assertTrue(driver.findElement(By.cssSelector("[id*='SeniorCitizenDiscount']")).isSelected());

        // count checkboxes
        System.out.println(driver.findElements(By.cssSelector("#discount-checkbox input[type='checkbox']")).size());
        Assert.assertEquals(driver.findElements(By.cssSelector("#discount-checkbox input[type='checkbox']")).size(), 5);

        //enabled or disabled elements
        /*
            Many a time a test fails to click on an element or enter text in a field as the element is
            disabled or exists in the DOM, but is not displayed on the page; this will result in an error
            being thrown and the test resulting in failures. For building reliable tests that can run
            unattended, a robust exception and error handling is needed in the test flow.
            We can handle these problems by checking the state of elements. The WebElement class
            provides the following methods to check the state of an element:
            Method Purpose
                isEnabled() This method checks if an element is enabled. Returns true if enabled,
                else false for disabled.
                isSelected() This method checks if element is selected (radio button, checkbox, and
                so on). It returns true if selected, else false for deselected
                isDisplayed() This method checks if element is displayed.
                In this recipe, we will use some of these methods to check the status and handle
                possible errors.
         */

        //System.out.println(driver.findElement(By.id("Div1")).isEnabled()); //the button is enabled, just opacity is reduced
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).isEnabled());
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")) {
            System.out.println("Calender enabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5")) {
            System.out.println("Calender disabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }


        //finally click on search-button
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


        // autocomplete example
    /*  driver.get("https://www.makemytrip.com/"); //URL in the browser
        WebElement source=driver.findElement(By.id("hp-widget__sfrom"));
        source.clear();
        source.sendKeys("MUM");
        Thread.sleep(2000);
        source.sendKeys(Keys.ENTER);

        WebElement destination=driver.findElement(By.id("hp-widget__sTo"));
        destination.clear();
        destination.sendKeys("DEL");
        Thread.sleep(2000);
        destination.sendKeys(Keys.ARROW_DOWN);
        destination.sendKeys(Keys.ENTER);
*/
    }
}
