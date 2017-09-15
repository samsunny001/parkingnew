package dbAccess;

import java.sql.SQLException;

import junit.framework.TestCase;

public class LoginCheckTest extends TestCase {

	
	String uname;
	String pwd;
	protected void setUp() throws Exception {
		
		uname="sam";
		pwd="123";
	}

	protected void tearDown() throws Exception {
		
		uname=null;
		pwd=null;
		
	}

	public void testLoginCheck() throws ClassNotFoundException, SQLException {
		boolean expected=true;
		//boolean actual=true;
		 
		DBConnect obj=new DBConnect();
		boolean actual1=obj.searchUser(uname, pwd);
		 assertEquals(expected, actual1);
	}

}
