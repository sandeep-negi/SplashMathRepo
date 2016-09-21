package commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FindElement.verifyElement;

public class CommonFile 
{
	WebDriver driver;
	verifyElement elementStatus;
	
public CommonFile(WebDriver driver)
{
	this.driver=driver;
}
 public void parentSignUpCommonPage() throws InterruptedException
 {
	 boolean status=false;
	  elementStatus=new verifyElement(driver);
status=elementStatus.findPageElementLinkText(driver);
	  
	  if(status)
	  {
		  System.out.println("SignUp_Button Present");
		  driver.findElement(By.linkText("Sign up")).click();
		  System.out.println("User Clicked SignUp_Button");
		  
		 WebDriverWait loginPopUp= new WebDriverWait(driver, 20);
		loginPopUp.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Parent"))));
		  
		  driver.findElement(By.linkText("Parent")).click();
		  Thread.sleep(1000);
		  System.out.println("On Parent SignUp Form Page");
		  
	  }
	  else
	  {
		  System.out.println("Element Not Present on Page");
	  }
 }
}
