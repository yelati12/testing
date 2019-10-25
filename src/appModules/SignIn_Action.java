package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Home_Page;
import pageObjects.Login_page;

import utility.ExcelUtils;


public class SignIn_Action {

public static void Execute(WebDriver driver) {
	
	String  Usename = ExcelUtils.getCellData(1,1);
	String  Password = ExcelUtils.getCellData(1,2);
	
	System.out.println("Login username is: "+ Usename + "" + "The login Password is : " + Password );
	
	//Home_Page.Myaccount(driver).click();
	Login_page.Username(driver).sendKeys(Usename);
	Login_page.Password(driver).sendKeys(Password);
	Login_page.Login(driver).click();

	
	
	
	
	
	
}

}