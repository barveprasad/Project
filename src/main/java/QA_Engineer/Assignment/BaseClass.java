package QA_Engineer.Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;
	public void configureBrowser()
	{
	//ConfigureBrowser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Assignment\\BrowserDriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Open an application
	driver.get("http://the-internet.herokuapp.com");
    }
}
