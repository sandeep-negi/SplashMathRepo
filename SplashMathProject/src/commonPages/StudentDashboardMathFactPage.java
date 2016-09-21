package commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentDashboardMathFactPage 
{
	WebDriver driver;
	LoginFormPopUp login;
	
  public StudentDashboardMathFactPage(WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public void MathfactPage()
  {
 
    login = new LoginFormPopUp(driver);
	boolean loginStatus=login.parentLoginStatus();
	if(loginStatus)
	{
		System.out.println("Parent Login Successfully!!!!!");
		driver.findElement(By.id("launch_child_dashboard_id")).click();
		
		WebDriverWait studentDashboard = new WebDriverWait(driver,30);
		studentDashboard.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='content']/div[2]/div[2]/div/div/div/div/div[2]/a")));
		driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div/div/div/div/div[2]/a")).click();
		
		// Math fact Page
		WebDriverWait MathFactsPage=new WebDriverWait(driver,30);
		MathFactsPage.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='mf-wrapper']/div/h2")));

		
	}
	else
	{
		System.out.println("Login Error!!!!");
	}
  }
}
