package ChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.tools.Diagnostic;

public class handleHTTPSCertifications {
    public static void main(String[] args) {
        //SSL Certifications

        //Desired Capabilities of the general chrome profile
        DesiredCapabilities dc = DesiredCapabilities.chrome();
      //  dc.acceptInsecureCerts();
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //Inject extentions it with local browser
        ChromeOptions o = new ChromeOptions();
        o.merge(dc);
        //pass to driver
        System.setProperty("webdriver.chrome.driver", "//home//lisa//IdeaProjects//chromedriver");
        WebDriver driver = new ChromeDriver(o);

        driver.get("google.de");

    }
}
