import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//objects and instantiation
		
		WebDriver driver=new FirefoxDriver();
		String url= "https://accounts.google.com";
		
		//launch firefox
		driver.get(url);
		
		//maximize window
		driver.manage().window().maximize();
		
		String expectedTitle = "Sign in - Google Accounts";
		
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Verification Successful");
		}
		else
		{
			 System.out.println("Verification Failed");
		}
		
		//valid username
		WebElement username=driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("xyx");
		
		//password
		WebElement password=driver.findElement(By.id("Passwd"));
		password.clear();
		password.sendKeys("password123");
		
		//click on sign in button
		WebElement SignInButton=driver.findElement(By.id("signIn"));
		SignInButton.click();
		
		driver.close();
		System.out.println("Test script executed successfully.");

	}

}
