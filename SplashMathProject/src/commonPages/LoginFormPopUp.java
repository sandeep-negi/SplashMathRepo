package commonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFormPopUp 

{
	WebDriver driver;
	public LoginFormPopUp(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean parentLoginStatus()
	{
		boolean status=false;
		
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.xpath("//div[@id='login-modal']/div/div/div/div[2]/ul/li[2]/a/p")).click();
		 driver.findElement(By.id("user_login")).sendKeys("sn+ip001@splashmath.com");
		 driver.findElement(By.id("modal_login_password")).sendKeys("1234");
		 driver.findElement(By.id("login-button")).click();
		
		 WebDriverWait ParentDashboard=new WebDriverWait(driver,30);
		 ParentDashboard.until(ExpectedConditions.elementToBeClickable(By.id("launch_child_dashboard_id")));
		 if(driver.findElements(By.id("launch_child_dashboard_id")).size()>0)
		 {
			 status=true;
		 }
	    
		 return status;
	}
}
