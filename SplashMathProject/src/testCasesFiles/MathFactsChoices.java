package testCasesFiles;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonPages.LoginFormPopUp;
import commonPages.StudentDashboardMathFactPage;
import commonPages.NumberCountMathFacts;
import WebPagesScreenShots.ScreenShots;
import basicFile.baseFlow;

public class MathFactsChoices extends baseFlow
{
	StudentDashboardMathFactPage currentPage;
	ScreenShots clickImage;
	
 @Test
 //first time login settings (default settings)
 public void loginDefaultSettings() throws IOException, InterruptedException
 {
	 currentPage = new StudentDashboardMathFactPage(driver);
	 clickImage= new ScreenShots(driver);
	 currentPage.MathfactPage();
	 clickImage.takePhotos("Student_MathFact_Page", "Mathfact_Screen");
	 System.out.println("On Mathfact Page.....");
	 
	 // New Code Entered from Here

	 if(driver.findElement(By.xpath("//ul[@id='operators-wrapper']/li[1]/a")).isDisplayed())
		{
		//  driver.findElement(By.xpath("//ul[@id='operators-wrapper']/li[1]/a"))
			if(driver.findElement(By.xpath("//ul[@id='operators-wrapper']/li[1]/a")).getAttribute("class").equals("op-lk active"))
			{
				System.out.println("Default Operator is selected");
			}
			else
			{
				System.out.println("Default Operator should be selected");
			}
			
			int op=1;
			System.out.println("User On Math Fact Page");
			List<WebElement>allOperators=driver.findElements(By.xpath("//ul[@id='operators-wrapper']/li"));
			for(WebElement operator:allOperators)
			{
				String a="//div[@id='mf-wrapper']/div/ul/li[" + String.valueOf(op)+ "]/a";
				operator.findElement(By.xpath(a)).click();
				op++;
			}
			
		String questionNumber="";
		
		// Question number
		questionNumber=driver.findElement(By.xpath("//div[@id='sliders-container']/ul/li[1]/div/span")).getText();
		System.out.println("Number of Questions = "+questionNumber);
		
		  String answerType=driver.findElement(By.xpath("//li[@id='slider_widget_drill_answer_type']/label")).getText();
			System.out.println("Option Choices is Selected");
			
			int numbers=2;        // because number 1 is default selected
			List<WebElement>allNumbers=driver.findElements(By.xpath("//div[@id='numbers-wrapper']/div/div/a"));
			for(WebElement num:allNumbers)
			{
			if(numbers<13)
			{
			driver.findElement(By.xpath("//div[@id='numbers-wrapper']/div/div/a[" + String.valueOf(numbers) + "]")).click();
			numbers++;
			}
							
			}
				// click on Start Button of Math Fact Page
			driver.findElement(By.id("start-btn")).click();
			
			WebDriverWait gameButton=new WebDriverWait(driver,20);
			gameButton.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flip-btn']")));
		 int answer = 0;
		for(int questionCount=1;questionCount<=(Integer.parseInt(questionNumber));questionCount++)
			{
			 NumberCountMathFacts mathFactCount= new NumberCountMathFacts(driver);
			 int rowOneDigits=0;
			 int rowTwoDigits=0;
			 String symbol="";
			 String wholeOne="";
			 String wholeTwo="";
			 String numOneOne="";
			 String numOneTwo="";
			 String numOneThree="";
			 String numOneFour="";
			 String numTwoOne="";
			 String numTwoTwo="";
			 String numTwoThree="";
						
			rowOneDigits=mathFactCount.rowOneDigits();
			rowTwoDigits=mathFactCount.rowTwoDigits();
			
			if(rowOneDigits==3||rowOneDigits==4)
			{
			symbol=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[2]/td[1]/div")).getText();
			try
			{
			if((rowOneDigits==3) && (rowTwoDigits==3))
			{
			numOneOne=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[1]/td[1]/div")).getText();
			numOneTwo=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[1]/td[2]/div")).getText(); // can be blank
			numOneThree=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[1]/td[3]/div")).getText();
			wholeOne=(numOneOne+numOneTwo+numOneThree).trim();
																				
			numTwoOne=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[2]/td[2]/div")).getText();  // can be blank
			numTwoTwo=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[2]/td[3]/div")).getText();
			wholeTwo = (numTwoOne+numTwoTwo).trim();
			}
						
			else
			{
			numOneOne=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[1]/td[1]/div")).getText();
			numOneTwo=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[1]/td[2]/div")).getText(); // can be blank
			numOneThree=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[1]/td[3]/div")).getText();
			numOneFour=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[1]/td[4]/div")).getText();
			wholeOne=(numOneOne+numOneTwo+numOneThree+numOneFour).trim();
								  															
			numTwoOne=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[2]/td[2]/div")).getText();  // can be blank
			numTwoTwo=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[2]/td[3]/div")).getText();
			numTwoThree=driver.findElement(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[2]/td[4]/div")).getText();
			wholeTwo = (numTwoOne+numTwoTwo+numTwoThree).trim();
			}
			}
							
			catch(Exception e)
			{
			System.out.println("Error" +e.getMessage());
			}		
			System.out.println("Math Facts Question Page");
											  															
			if(symbol.equals("+"))
			{
			try{
			answer = (Integer.parseInt(wholeOne)) + (Integer.parseInt(wholeTwo));
			System.out.println("Addition");
			}
			catch(NumberFormatException ex)
			{
			System.out.println("Addition Exception = " +ex.getMessage());
			 }
			}
			else
			if(symbol.equals("-"))
			{
			try{
			 answer = (Integer.parseInt(wholeOne)) - (Integer.parseInt(wholeTwo));
			 System.out.println("Subtraction");
			}
		 catch(NumberFormatException ex)
		 {
		System.err.println("Subtraction Exception = " +ex.getMessage());
		 }
		}
		else
		if(symbol.equals("x"))
		{
		try{
		 answer = (Integer.parseInt(wholeOne)) * (Integer.parseInt(wholeTwo));
		 System.out.println("Multiplication");
		}
	 catch(NumberFormatException ex)
	 {
	System.out.println("Multiplication Exception = " +ex.getMessage());
	 }
	}
	else
		{
		try{
		answer = (Integer.parseInt(wholeOne)) / (Integer.parseInt(wholeTwo));
	 	System.out.println("Division");

		}
		catch(NumberFormatException ex)
	 {
	System.out.println("Division Exception = " +ex.getMessage());
	 }
	}
			System.out.println("Answer = " + answer);
	for(int i=1;i<=2;i++)
	{
	for(int j=1;j<=2;j++)
	{
	String choiceAnswer = driver.findElement(By.xpath("//div[@class='mathfact-choices swapped']/table/tbody/tr["+ String.valueOf(i) +"]/td[" + String.valueOf(j) + "]/div")).getText();
						    	
	if(String.valueOf(answer).equals(choiceAnswer))
	{
	driver.findElement(By.xpath("//div[@class='mathfact-choices swapped']/table/tbody/tr["+ String.valueOf(i) +"]/td[" + String.valueOf(j) + "]/div")).click();

	Thread.sleep(1000);
	WebDriverWait swapButton=new WebDriverWait(driver,20);
	swapButton.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[2]/td[1]/div"))); 
			     }
	 		   }
	  		 }
		 }
	}
		
	clickImage.takePhotos("Student_MathFact_Page", "PitStop_Page");
	driver.findElement(By.xpath("//div[@class='bottle-back']")).click();
}
	 
	 
 }
}


