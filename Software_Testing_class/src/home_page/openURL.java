package home_page;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openURL 
{
	@Test
	public void openSoftwareTestingClass()
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.google.com");
		//driver.get(“http://www.softwaretestingclass.com”);
		driver.close();
	}

}
