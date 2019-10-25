package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page{
	
	private static WebElement element = null;
	
	
	public static WebElement Username(WebDriver driver){
		element = driver.findElement(By.name("txtUserName"));
		return element;
		
	}
	
	public static WebElement Password(WebDriver driver){
		
		
		element = driver.findElement(By.name("txtPassword"));
		return element;
	}
	
	public static WebElement Login(WebDriver driver){
		
		element = driver.findElement(By.name("Submit"));
		return element;
		
		
		
	}

}
