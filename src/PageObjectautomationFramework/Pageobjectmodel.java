package PageObjectautomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Home_Page;

import pageObjects.Login_page;

public class Pageobjectmodel {
	private static WebDriver driver = null ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
driver.get("");

//Use pageobject library now

Home_Page.Myaccount(driver).sendKeys("");

Login_page.Username(driver).sendKeys("");

Login_page.Password(driver).sendKeys("");

Login_page.Login(driver).click();

System.out.println("User looged into the application succefully");

Home_Page.logout(driver).click();
driver.quit();
	}

}
