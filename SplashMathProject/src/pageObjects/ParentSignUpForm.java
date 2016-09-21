package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ParentSignUpForm 
{
 WebDriver driver;
 private static WebElement element;
 public ParentSignUpForm(WebDriver driver)
 {
	 this.driver=driver;
 }
  public static WebElement userName_TextBox(WebDriver driver)
  {
	  element =driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/input"));
	return element;
	  
  }
  
  public static WebElement userPassword_TextBox(WebDriver driver)
  {
	  element =driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[2]/input"));
	return element;
	  
  }
 
  public static WebElement click_Submit(WebDriver driver)
  {
	  element=driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[3]/div/div/input"));
	return element;
	  
  }
}
