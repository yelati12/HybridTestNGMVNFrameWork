package com.org.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.org.config.StartBrowser;
import com.org.reuse.Commonfunction;

public class Login_LogoutTest extends StartBrowser{
  @Test
  public void Login_LogoutTestcase() throws Throwable {
	  
	  Commonfunction cfs= new Commonfunction();
	  cfs.login();
	 Thread.sleep(2000);
  }
	 @Test
	  public void addinguser() throws Exception {
		  
		 Commonfunction cfs= new Commonfunction(); 
		  cfs.AddUser();  
	  }
	  
	  
  }

