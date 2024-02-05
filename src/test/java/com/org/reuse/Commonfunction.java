package com.org.reuse;

import org.openqa.selenium.WebDriver;

import com.orangeHRM.or.HomePage;
import com.orangeHRM.or.LoginPage;
import com.org.config.StartBrowser;
import com.orgwdcmds.ActionDriver;

public class Commonfunction {

	public ActionDriver aDriver;
	public WebDriver driver;
	
	
	public Commonfunction() {
		
		aDriver =new ActionDriver();
		driver = StartBrowser.driver;
	}
	
	public void  login() throws Exception {
		
		StartBrowser.childTest =StartBrowser.parentTest.createNode("Login to the application");
		aDriver.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		aDriver.type(LoginPage.txtUsername,"Admin", "Username");
		aDriver.type(LoginPage.txtpassword, "admin123", "password field");
		aDriver.click(LoginPage.lngbutton, "Loginbuttin");
		
		
	}
	
public void  logintest(String email, String password) throws Exception {
		
		StartBrowser.childTest =StartBrowser.parentTest.createNode("Login to the application");
		aDriver.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		aDriver.type(LoginPage.txtUsername,email, "Username");
		aDriver.type(LoginPage.txtpassword, password, "password field");
		aDriver.click(LoginPage.lngbutton, "Loginbuttin");
		
		
	}
	
	public void AddUser() throws Exception {
	   aDriver.click(HomePage.AddButton, "Add button");
	   aDriver.type(HomePage.firstname, "Testing1", "User Entered First Name");
	   aDriver.type(HomePage.MiddleName,"TestingMiddlename1", "user entered Middlename");
	   aDriver.type(HomePage.LastName,"TestingLastname", "User Entered Last name");
	   aDriver.click(HomePage.CreateLoginDetailsToggle, "User clicked on the toggle button");
	   aDriver.click(HomePage.saveButton, "User Clicked on the save button");
		
	}


		// TODO Auto-generated method stub
		
	}

