package commonPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NumberCountMathFacts 
{
	WebDriver driver;
	
	public NumberCountMathFacts(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public int rowOneDigits()
	{ 
		int row1 =0;
		List<WebElement> allDigits =driver.findElements(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[1]/td"));
			for(WebElement digit : allDigits)
			{
				row1++;
			}
		//	System.out.println("row one digits =" +row1);
		return row1;
		
	}
	public int rowTwoDigits()
	{
		int row2=0;
		List<WebElement> allDigits =driver.findElements(By.xpath("//div[@class='mf-ques-cont ']/div/table/tbody/tr[2]/td"));
			for(WebElement digit : allDigits)
				{
					row2++;
				}
	//		System.out.println("row two digits =" +row2);
		return row2;
		
	}
}
