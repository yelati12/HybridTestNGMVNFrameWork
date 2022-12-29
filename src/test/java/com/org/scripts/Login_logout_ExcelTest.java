package com.org.scripts;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.org.config.StartBrowser;
import com.org.reuse.Commonfunction;

public class Login_logout_ExcelTest extends StartBrowser{
  @Test
  public void Login_LogoutTestcase() throws Exception{
	  
	  Commonfunction cfs1 = new  Commonfunction();
	  
	  Fillo f = new Fillo();
	  Connection con = f.getConnection("TestData/Data.xlsx");
	  
		String query = "select * from login";
		Recordset rs = con.executeQuery(query);
		while(rs.next()) {
			Thread.sleep(3000);
			cfs1.logintest(rs.getField("Email"), rs.getField("Password"));
		Thread.sleep(3000);

		}
	  
  }
		
}
