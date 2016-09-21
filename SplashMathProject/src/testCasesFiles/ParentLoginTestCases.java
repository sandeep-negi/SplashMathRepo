package testCasesFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.ParentLoginPopUpPage;
import basicFile.baseFlow;

public class ParentLoginTestCases extends baseFlow
{
	ParentLoginPopUpPage prnt;
 @Test
 public void demoTest()
 {
	prnt=new ParentLoginPopUpPage(driver);
	driver.findElement(By.linkText("Login")).click();
	WebDriverWait loginPopUp= new WebDriverWait(driver, 10);
	loginPopUp.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.className("cross"))));
	System.out.println("Visited Parent Sign In Page");
	driver.findElement(By.xpath("//ul[@class='clearfix']/li[2]/a")).click();
	
	// Wait for Login Form to appear
			WebDriverWait loginFormPopUp= new WebDriverWait(driver, 10);
			loginFormPopUp.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("login-button"))));
			System.out.println("Visited Parent Login Form popUp");
			
			ParentLoginPopUpPage.userName_TextField(driver).sendKeys("sn+loadtest@splashmath.com");
			ParentLoginPopUpPage.password_TextField(driver).sendKeys("1234");
			ParentLoginPopUpPage.signIn_Button(driver).click();
			
			// Wait for Parent Dashboard	
			WebDriverWait parentDashboard =new WebDriverWait(driver,20);
			parentDashboard.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("launch_child_dashboard_id"))));
			System.out.println("Visited Parent Dashboard");
	 
 }
}
