package WebPagesScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShots 
{

	WebDriver driver;
	
	public ScreenShots(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void takePhotos(String location, String name) throws IOException
	{
		File f1=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
	    File f2=new File("//Users//sandeepnegi//Documents//workspace//SplashMathProject//WebPagesScreenShots//" + location + "//" +name +".jpg");	
		System.out.println("ScreenShot of "+ name +" Taken");
		FileUtils.copyFile(f1, f2);
	}
}
