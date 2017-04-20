package pangu;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gridpractice 
{
	    static WebDriver driver;
	    static Wait<WebDriver> wait;
	    public static void main(String[] args) throws MalformedURLException 
	    {
	        System.setProperty("webdriver.ie.driver", "C:\\Users\\user\\Downloads\\IEDriverServer.exe");
	        DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
	        cap.setCapability("ie", true);
	        cap.setBrowserName("InternetExplorer");
	        driver = new RemoteWebDriver(new URL("http://192.168.2.6:4444/wd/hub"), cap);
	        wait = new WebDriverWait(driver, 3000);
	        final String url = "https://www.google.com/";
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        try
	        {
	            driver.navigate().to(url);
	        } 
	        finally 
	        {
	            driver.close();
	        }
	    }
	}

