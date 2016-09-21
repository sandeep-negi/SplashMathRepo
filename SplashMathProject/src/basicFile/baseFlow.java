package basicFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseFlow 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void startBrowser()
	{
	//	System.setProperty("webdriver.chrome.driver", "//Users//sandeepnegi//Desktop//jarfiles//chromedriver");
		driver = new FirefoxDriver();
	//	driver.get("https://staging-1.splashmath.com/parents/register");
		driver.get("https://staging-1.splashmath.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
