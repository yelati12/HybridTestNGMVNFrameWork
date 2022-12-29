package com.orgwdcmds;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.org.config.StartBrowser;

public class ActionDriver {

	public WebDriver driver;
	
	public  ActionDriver() {
		driver = StartBrowser.driver;
	}
	/**
	 * used to navigate to any application
	 * @param URL -- url of the application
	 */
	public void navigateToApplication(String URL) {
		
		try {
			driver.get(URL);
			StartBrowser.childTest.pass("Successfull Navigate To :" + URL);
			
		}catch(Exception e) {
			
			StartBrowser.childTest.fail("Unable to navigate to ::" + URL);
			 
		}
	}
		
	/**
	 * 	Used to perform click action on the browser.
	 * @param locator - get it from OR
	 * @param eleName - Name of the element
	 * @throws Exception
	 */
		public void click(By locator, String eleName) throws Exception {
			
			try {
				
			driver.findElement(locator).click();
				
				StartBrowser.childTest.pass("Performed click on action on:" + eleName);
				
			
			}catch (Exception e) {
				
			StartBrowser.childTest.fail("Unable to perform click action on :" +eleName);	
			   MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build();
			
			StartBrowser.childTest.info(e);
			throw e;
			}
		}
		
		/**
		 * Used to perform type action on the textbox
		 * @param locator -- get it from OR
		 * @param testData -- get it from external file
		 * @param eleName - Name of the element
		 * @throws Exception
		 */
	public void type(By locator, String testData, String eleName) throws Exception {
		try {
		driver.findElement(locator).sendKeys(testData);
		
		StartBrowser.childTest.pass("Successful performed type action on : " + eleName + "withData :"+ testData);
	
		}catch( Exception e) {
			
			StartBrowser.childTest.fail("Unable to perform type action on : " +eleName + "withdate :"+ testData);
			MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build();
		      StartBrowser.childTest.info(e);
		      throw e;
		}
	}
		
	/**
	 * User perform mouse actions on the elements
	 * @param locator - Get it from the OR
	 * @param eleName - Name of the Element
	 * @throws Exception
	 */
public void mousehover(By locator, String eleName) throws Exception {
	
	try {
		WebElement we=driver.findElement(locator);
		Actions a = new Actions(driver);
		a.moveToElement(we).build().perform();
		StartBrowser.childTest.pass("Action performed on the element : " + eleName);
	}catch (Exception e) {
		
		StartBrowser.childTest.fail("Unable to perform the action on the element :" + eleName);
		MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build();
		StartBrowser.childTest.info(e);
		throw e;
	}
}
		
/**
 * Select values from DD using Visible text
 * @param locator --OR
 * @param visibleText -- Dropdown values
 * @param eleName - Neame of the dropdowm
 */
public void selectByVisibleText(By locator, String visibleText, String eleName) {
	try {
		
	
	WebElement we= driver.findElement(locator);
	Select s= new Select(we);
	s.selectByVisibleText(visibleText);

	StartBrowser.childTest.pass("Sucessfully Selected value : " +visibleText +" Fromd dropdown " + eleName);
	}catch(Exception e) {
	
	StartBrowser.childTest.fail("Sucessfully Selected value : " +visibleText +" Fromd dropdown " + eleName);
	
	MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build();
			
	StartBrowser.childTest.info(e);
	throw e;
	}
} 

public String screenshot() {
	
	return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	
}

}

