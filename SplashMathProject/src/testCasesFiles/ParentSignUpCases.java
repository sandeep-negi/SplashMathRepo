package testCasesFiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.ParentSignUpForm;
import uniqueParentEmail.uniqueEmail;
import commonPages.CommonFile;
import WebPagesScreenShots.ScreenShots;
import basicFile.baseFlow;


public class ParentSignUpCases extends baseFlow
{
	CommonFile comn ;
	ParentSignUpForm form ;
	ScreenShots takePhoto ;
	uniqueEmail emailId ;
	
  @Test(enabled=false)
  public void without_Username_Password() throws InterruptedException, IOException
  {
	  comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
	  
	 comn.parentSignUpCommonPage();
	 form.userName_TextBox(driver).sendKeys("");
	 form.userPassword_TextBox(driver).sendKeys("");
	 form.click_Submit(driver).click();
	 takePhoto.takePhotos("ParentSignUp", "signUp_WithoutUsername_Password");
	 
	 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText().contains("This field is required."))
	 {
		 System.out.println("Username/Email Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText() + " == is shown");
	 }
	 
	 else
	 {
		 System.out.println(" Required Error Message below Username/Email Field");
	 }

	 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText().contains("This field is required."))
	 {
		 System.out.println(" Password Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[2]/span")).getText() + " == is shown");
		
	 }
	 
	 else
	 {
		 System.out.println(" Required Error Message below Password Field");
	 }
  }
  
  @Test(enabled=false)
  public void signUp_WithoutUsername() throws InterruptedException, IOException
  {
	  comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		 
		 comn.parentSignUpCommonPage();
		 form.userName_TextBox(driver).sendKeys("");
		 form.userPassword_TextBox(driver).sendKeys("1234");
		 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "signUp_WithoutUsername_Page");
		 
		 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText().contains("This field is required."))
		 {
			 System.out.println("Username/Email Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText() + " == is shown");
		 }
		 
		 else
		 {
			 System.out.println(" Required Error Message below Username/Email Field");
		 }
		 
  }
  
  @Test (enabled=false)
  public void signUp_WithoutPassword() throws InterruptedException, IOException
  {
	  	comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		
	  	comn.parentSignUpCommonPage();
		 form.userName_TextBox(driver).sendKeys("sandeep.negi+demotesting@splashmath.com");
		 form.userPassword_TextBox(driver).sendKeys("");
		 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "signUpWithoutPassword_Page");
		 
		 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[2]/span")).getText().contains("This field is required."))
		 {
			 System.out.println("Password Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[2]/span")).getText() + " == is shown");
		 }
		 
		 else
		 {
			 System.out.println(" Required Error Message below Password Field");
		 }
  }
  
  @Test(enabled=false)
  public void spaces_InUserNameField() throws InterruptedException, IOException
  {
	  comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		
	  	comn.parentSignUpCommonPage();
		 form.userName_TextBox(driver).sendKeys("     ");
		 form.userPassword_TextBox(driver).click();
	//	 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "spaces_InUserNameField");
		 
		 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText().contains("This field is required."))
		 {
			 System.out.println("Username/Email Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText() + " == is shown");
		 }
		 
		 else
		 {
			 System.out.println(" Required Error Message below Username/Email Field");
		 }
		 
  }
  
  @Test(enabled=false)
  public void spaces_InPasswordField() throws InterruptedException, IOException
  {
  
	  	comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		
	  	comn.parentSignUpCommonPage();
		 form.userName_TextBox(driver).sendKeys("sandeep.negi+demotesting@splashmath.com");
		 form.userPassword_TextBox(driver).sendKeys("    ");
		 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "spaces_InPasswordField");
		 
		 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[2]/span")).getText().contains("This field is required."))
		 {
			 System.out.println("Password Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[2]/span")).getText() + " == is shown");
		 }
		 
		 else
		 {
			 System.out.println(" Required Error Message below Password Field");
		 }
  }
  
  @Test(enabled=false)
  public void invalid_UserNameOne() throws InterruptedException, IOException
  {
	  comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		
	  	comn.parentSignUpCommonPage();
		 form.userName_TextBox(driver).sendKeys("sandeep.negi");
		 form.userPassword_TextBox(driver).click();
		 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "invalid_UserName_One");
		 
		 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText().contains("Please enter a valid email."))
		 {
			 System.out.println("Username/Email Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText() + " == is shown");
		 }
		 
		 else
		 {
			 System.out.println(" Required Error Message below Username/Email Field");
		 }
  }
  
  @Test(enabled=false)
  public void invalid_UserNameTwo() throws InterruptedException, IOException
  {
	  comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		
	  	comn.parentSignUpCommonPage();
		 form.userName_TextBox(driver).sendKeys("sandeep.negi@");
		 form.userPassword_TextBox(driver).click();
		 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "invalid_UserName_Two");
		 
		 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText().contains("Please enter a valid email."))
		 {
			 System.out.println("Username/Email Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText() + " == is shown");
		 }
		 
		 else
		 {
			 System.out.println(" Required Error Message below Username/Email Field");
		 }
  }
  
  @Test(enabled=false)
  public void invalid_UserNameThree() throws InterruptedException, IOException
  {
	  comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		
	  	comn.parentSignUpCommonPage();
		 form.userName_TextBox(driver).sendKeys("sandeep.negi@sandeep@");
		 form.userPassword_TextBox(driver).click();
		 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "invalid_UserName_Three");
		 
		 if(driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText().contains("Please enter a valid email."))
		 {
			 System.out.println("Username/Email Field Error msg == " + driver.findElement(By.xpath("//div[@id='main_parent_signup_form']/div[1]/span")).getText() + " == is shown");
		 }
		 
		 else
		 {
			 System.out.println(" Required Error Message below Username/Email Field");
		 }
  }
  
  @Test(enabled=false)
  public void valid_Existing_UsernamePassword() throws InterruptedException, IOException
  {
	  comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		
	  	comn.parentSignUpCommonPage();
	  	form.userName_TextBox(driver).sendKeys("sandeep.negi+pg012@splashmath.com");
		 form.userPassword_TextBox(driver).sendKeys("1234");
		 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "valid_Existing_usernamePassword");
		 
		 if(driver.findElement(By.xpath("//div[@id='subscription-welcome-flow']/div/sp-flash-container/div/div")).getText().equals("Email has already been taken"))
		 {
			 System.out.println(" Already Existing User Test Pass");
		 }
		 
		 else
		 {
			 System.out.println("Already Existing User Test Fail");
		 }
  
}
  
  @Test(enabled=false)
  public void valid_UsernamePassword() throws InterruptedException, IOException
  {
	     comn = new CommonFile(driver);
		 form = new ParentSignUpForm(driver);
		 takePhoto = new ScreenShots(driver);
		 emailId =new uniqueEmail(driver);
		 String newUserEmail = "";
		 
	  	 comn.parentSignUpCommonPage();
	  	 newUserEmail=emailId.newEmail();
	  	 
	  	 form.userName_TextBox(driver).sendKeys(newUserEmail);
		 form.userPassword_TextBox(driver).sendKeys("1234");
		 form.click_Submit(driver).click();
		 takePhoto.takePhotos("ParentSignUp", "valid_UsernamePassword");
  }
  }
