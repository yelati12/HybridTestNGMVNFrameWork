package com.org.config;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;

public class StartBrowser {
	public static WebDriver driver;
	
	//setup the report
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	ExtentSparkReporter SparkReporter;
	
	
	@BeforeTest
	public void generateReport() {
		
		SparkReporter = new ExtentSparkReporter("Reports/AutomationReport.html");
		extent =new ExtentReports();
		extent.attachReporter(SparkReporter);
		
		
	}
	
	@BeforeMethod
	public void methodName(Method method) {
		
		parentTest = extent.createTest(method.getName());
		
	}
	
//	@Test
//	public void  testlogin() {
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}

	
	//launching the browser and setup
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.safaridriver().setup();
	  driver = new SafariDriver();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  extent.flush();
  }

}
