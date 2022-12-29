package Utiles;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.org.config.StartBrowser;
import com.org.reuse.Commonfunction;

public class Login_logout_ExcelTestcase extends StartBrowser {

	@Test 
	public void Login_logout_ExcelTestcase() throws FilloException {
		
		Commonfunction cfs = new Commonfunction();
		Fillo f = new Fillo();
		Connection com = f.getConnection("C:\\Users\\suman\\eclipse-workspace\\orangeHRM\\TestData.xlsx");
		
		String query = "select * from login";
		Recordset rs = com.executeQuery(query);
		while(rs.next()) {
		
		
	}
	
}
}
	