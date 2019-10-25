package AppacheautomationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import appModules.SignIn_Action;
import junit.framework.Assert;
import pageObjects.Home_Page;
import utility.Constant;
import utility.ExcelUtils;

public class Apache_POI {

	private static WebDriver driver = null;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	ExcelUtils.setExcellFile(Constant.Path_Testdata, Constant.File_testdata);
	driver = new FirefoxDriver();
	
		driver.get(Constant.URL);
		
		SignIn_Action.Execute(driver);
		System.out.println("Login successfully, now is the time to log off the application.");
		//Home_Page.logout(driver).click();
		//driver.quit();
		// Pass the result to excel file
		
		//Switched to frame0 to fram1
		driver.switchTo().frame("rightMenu");
		
		System.out.println("Swtiched from main frame to child frame");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.id("loc_code"));
		
		
		List<WebElement> droplist = dropdown.findElements(By.tagName("option"));
	
		
		for(int i=0 ; i<droplist.size();i++){
			
			System.out.println("The list of Options available in the dropdown list are : "+droplist.get(i).getText());
		
			
			Select s = new Select(dropdown);
			
			s.selectByIndex(4);
			
			System.out.println("It has selected the index by 4");

			
			Thread.sleep(2000);
			
		
			s.selectByValue("7");
			
			System.out.println("selected the option by value");
			
			s.selectByVisibleText("Supervisor");
			
			System.out.println("selected the option by visible text Supervisor");

			//Printing Tool Tip for Employeeid
			
			String ExpectedToolTip ="Sort in descending order";
			
		WebElement EmployeeID =	driver.findElement(By.partialLinkText("Employee Id"));
			
		String ActualTitle = EmployeeID.getAttribute("title");
			
			
			System.out.println("The Actual Title displayed on the page: "+ActualTitle);
			
			
		if(ActualTitle.equals(ExpectedToolTip)){
			
			System.out.println("Test cases Passed");
			
		}else{
			System.out.println("Test cases Failed");
		}
			
			
		//adding multiple patients
		
		WebElement Addbutton = driver.findElement(By.xpath("//input[@value='Add']"));
		
		Addbutton.click();
	
		
		WebElement Lastename = driver.findElement(By.name("txtEmpLastName"));
		Lastename.sendKeys("Y");
		
		WebElement firstname = driver.findElement(By.name("txtEmpFirstName"));
		firstname.sendKeys("test");

		WebElement nikename = driver.findElement(By.name("txtEmpNickName"));
		nikename.sendKeys("bcd");
		 
		WebElement saveemploy= driver.findElement(By.id("btnEdit"));
		saveemploy.click();
		
		WebElement Backhomepg = driver.findElement(By.xpath("//input[@value='Back']"));
		Backhomepg.click();
		
		
	 
		ExcelUtils.setCellData("Pass",1, 3);
		
		
		
		}
		
	}

}
