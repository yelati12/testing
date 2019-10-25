package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	private static WebElement element = null;
	
	/*
	public static WebElement Myaccount(WebDriver driver){
		element = driver.findElement(By.id(""));
		return element;
	}
	
	public static WebElement Sign(WebDriver driver){
		
		element =driver.findElement(By.name(""));
		return element;
		
	}
	*/
	public static WebElement logout(WebDriver driver){
		
		element = driver.findElement(By.xpath(".//*[@id='option-menu']/li[3]/a"));
		return element;
	}
}
