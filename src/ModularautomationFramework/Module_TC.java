package ModularautomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.SignIn_Action;
import pageObjects.Home_Page;

public class Module_TC {

	private static WebDriver driver = null ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("");
		SignIn_Action.Execute(driver);
		
		System.out.println("the user logged in to the application sucessfully");
		Home_Page.logout(driver).click();
		driver.quit();
		
		
		}
	
	
		
	}


