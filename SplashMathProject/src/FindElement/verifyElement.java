package FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyElement 
{
	WebDriver driver;
	public verifyElement(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean findPageElementLinkText(WebDriver driver)
	{
		boolean status=false;
		List<WebElement> elements=driver.findElements(By.linkText("Sign up"));
		if(elements.size()>0)
		{
			status=true;
		}
		else
		{
			status =false;
		}
		
		return status;
		
	}
}
