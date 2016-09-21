package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentLoginPopUpPage 
{
	public WebDriver driver;
	private static WebElement element = null;
	
	public ParentLoginPopUpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static WebElement userName_TextField(WebDriver driver)
	{
		element=driver.findElement(By.id("user_login"));
		return element;
		
	}

	public static WebElement password_TextField(WebDriver driver)
	{
		element=driver.findElement(By.id("modal_login_password"));
		return element;
		
	}
	public static WebElement signIn_Button(WebDriver driver)
	{
		element=driver.findElement(By.id("login-button"));
		return element;
		
	}
	
	
	
	
}
