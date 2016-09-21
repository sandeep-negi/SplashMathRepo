package testCasesFiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonPages.CommonFile;
import pageObjects.ParentSignUpForm;
import basicFile.baseFlow;
import WebPagesScreenShots.ScreenShots;
import uniqueParentEmail.uniqueEmail;

public class childFormPageTestCases  extends baseFlow
{
	uniqueEmail emailId ;
	ScreenShots takePhoto ;
	ParentSignUpForm form ;
	CommonFile comn ;

@Test(enabled=false)
public void child_no_info() throws IOException, InterruptedException 
{
	 emailId=new uniqueEmail(driver);
	 form = new ParentSignUpForm(driver);
	 comn = new CommonFile(driver);
	 String newUserEmail = "";
	 
  	 comn.parentSignUpCommonPage();
  	 newUserEmail=emailId.newEmail();
  	 takePhoto = new ScreenShots(driver);
  	 
  	 form.userName_TextBox(driver).sendKeys(newUserEmail);
	 form.userPassword_TextBox(driver).sendKeys("1234");
	 form.click_Submit(driver).click();
	 
	
	WebDriverWait childFormPage= new WebDriverWait(driver,20);
	childFormPage.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span"))));
	
	if(driver.findElements(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span")).size()>0)
	{
		System.out.println("On Child Form Page");
		
		driver.findElement(By.xpath("//div[@class='inp-wrap inp-wrap-last']/input")).click();
	
		takePhoto.takePhotos("ChildformPage", "without_info_Click");
		
		if(driver.findElement(By.xpath("//form[@id='add_child_form']/div/span")).getText().contains("This field is required."))
		{
			System.out.println(" validation text message Present");
		}
		
		else
		{
			System.out.println("Needs any validation text message");
			System.out.println("failed");
		}
	}
}
	
	@Test(enabled=false)
	public void entering_invalid_ChildName_NumbersOnly() throws IOException, InterruptedException 
	{
		 emailId=new uniqueEmail(driver);
		 form = new ParentSignUpForm(driver);
		 comn = new CommonFile(driver);
		 String newUserEmail = "";
		 
	  	 comn.parentSignUpCommonPage();
	  	 newUserEmail=emailId.newEmail();
	  	 takePhoto = new ScreenShots(driver);
	  	 
	  	 form.userName_TextBox(driver).sendKeys(newUserEmail);
		 form.userPassword_TextBox(driver).sendKeys("1234");
		 form.click_Submit(driver).click();
		 
		
		WebDriverWait childFormPage= new WebDriverWait(driver,20);
		childFormPage.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span"))));
		
		if(driver.findElements(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span")).size()>0)
		{
			System.out.println("On Child Form Page");
			 driver.findElement(By.xpath("//form[@id='add_child_form']/div/input")).sendKeys("12345");
			driver.findElement(By.xpath("//div[@class='inp-wrap inp-wrap-last']/input")).click();
			takePhoto.takePhotos("ChildformPage", "NumbersOnly");
			
			if(driver.findElement(By.xpath("//form[@id='add_child_form']/div/span")).getText().contains("Please enter only letters."))
			{
				System.out.println(" Valid text message Present");
			}
			
			else
			{
				System.out.println("Needs any validation text message");
				System.out.println("failed");
			}
		}
	
}

	@Test(enabled=false)
	public void entering_invalid_ChildName_AlphaNumeric() throws IOException, InterruptedException 
	{
		 emailId=new uniqueEmail(driver);
		 form = new ParentSignUpForm(driver);
		 comn = new CommonFile(driver);
		 String newUserEmail = "";
		 
	  	 comn.parentSignUpCommonPage();
	  	 newUserEmail=emailId.newEmail();
	  	 takePhoto = new ScreenShots(driver);
	  	 
	  	 form.userName_TextBox(driver).sendKeys(newUserEmail);
		 form.userPassword_TextBox(driver).sendKeys("1234");
		 form.click_Submit(driver).click();
		 
		
		WebDriverWait childFormPage= new WebDriverWait(driver,20);
		childFormPage.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span"))));
		
		if(driver.findElements(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span")).size()>0)
		{
			System.out.println("On Child Form Page");
			 driver.findElement(By.xpath("//form[@id='add_child_form']/div/input")).sendKeys("sam12345");
			driver.findElement(By.xpath("//div[@class='inp-wrap inp-wrap-last']/input")).click();
			takePhoto.takePhotos("ChildformPage", "AlphaNumeric");
			
			if(driver.findElement(By.xpath("//form[@id='add_child_form']/div/span")).getText().contains("Please enter only letters."))
			{
				System.out.println(" Valid text message Present");
			}
			
			else
			{
				System.out.println("Needs any validation text message");
				System.out.println("failed");
			}
		}
	}
		
		@Test(enabled=false)
		public void entering_invalid_ChildName_SpecialCharacters() throws IOException, InterruptedException 
		{
			 emailId=new uniqueEmail(driver);
			 form = new ParentSignUpForm(driver);
			 comn = new CommonFile(driver);
			 String newUserEmail = "";
			 
		  	 comn.parentSignUpCommonPage();
		  	 newUserEmail=emailId.newEmail();
		  	 takePhoto = new ScreenShots(driver);
		  	 
		  	 form.userName_TextBox(driver).sendKeys(newUserEmail);
			 form.userPassword_TextBox(driver).sendKeys("1234");
			 form.click_Submit(driver).click();
			 
			
			WebDriverWait childFormPage= new WebDriverWait(driver,20);
			childFormPage.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span"))));
			
			if(driver.findElements(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span")).size()>0)
			{
				System.out.println("On Child Form Page");
				 driver.findElement(By.xpath("//form[@id='add_child_form']/div/input")).sendKeys("@!#$%");
				driver.findElement(By.xpath("//div[@class='inp-wrap inp-wrap-last']/input")).click();
				takePhoto.takePhotos("ChildformPage", "SpecialCharacters");
				
				if(driver.findElement(By.xpath("//form[@id='add_child_form']/div/span")).getText().contains("Please enter only letters."))
				{
					System.out.println(" Valid text message Present");
				}
				
				else
				{
					System.out.println("Needs any validation text message");
					System.out.println("failed");
				}
			}
		}
			
			@Test()
			public void entering_invalid_ChildName_Spaces() throws IOException, InterruptedException 
			{
				 emailId=new uniqueEmail(driver);
				 form = new ParentSignUpForm(driver);
				 comn = new CommonFile(driver);
				 String newUserEmail = "";
				 
			  	 comn.parentSignUpCommonPage();
			  	 newUserEmail=emailId.newEmail();
			  	 takePhoto = new ScreenShots(driver);
			  	 
			  	 form.userName_TextBox(driver).sendKeys(newUserEmail);
				 form.userPassword_TextBox(driver).sendKeys("1234");
				 form.click_Submit(driver).click();
				 
				
				WebDriverWait childFormPage= new WebDriverWait(driver,20);
				childFormPage.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span"))));
				
				if(driver.findElements(By.xpath("//div[@class='grade-selector selectors']/div/ul/li[2]/a/span")).size()>0)
				{
					System.out.println("On Child Form Page");
					 driver.findElement(By.xpath("//form[@id='add_child_form']/div/input")).sendKeys("    ");
					driver.findElement(By.xpath("//div[@class='inp-wrap inp-wrap-last']/input")).click();
					takePhoto.takePhotos("ChildformPage", "Spaces");
					
					if(driver.findElement(By.xpath("//form[@id='add_child_form']/div/span")).getText().contains("This field is required."))
					{
						System.out.println(" Valid text message Present");
					}
					
					else
					{
						System.out.println("Needs any validation text message");
						System.out.println("failed");
					}
				}
}

}