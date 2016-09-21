package uniqueParentEmail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class uniqueEmail 
{
	WebDriver driver;
	public uniqueEmail(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String newEmail()
	{
		String emailId="null";
		Date date = new Date();
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		SimpleDateFormat simpleDateFormat =
		new SimpleDateFormat("MMddhhmmss");
		String dateAsString = simpleDateFormat.format(new Date());
		System.out.println(dateAsString+year);
		emailId="sandeep.negi+"+ dateAsString+year +"@splashmath.com";
		
		return emailId;
	}
}
