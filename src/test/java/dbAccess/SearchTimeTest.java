package dbAccess;

import java.sql.SQLException;

import junit.framework.TestCase;

public class SearchTimeTest extends TestCase {

	int locationID;
	int timeSlotID;
	String date;
		
	protected void setUp() throws Exception {
		
		
		locationID=2;
		timeSlotID=2;
		date="12-09-2017";
		
	}

	protected void tearDown() throws Exception {
		locationID=0;
		timeSlotID=0;
		date=null;
	}

	public void testSearchTime() throws ClassNotFoundException, SQLException {
		int expected=1;
		//boolean actual=true;
		 
		DBConnect obj=new DBConnect();
		int actual1=obj.FillGrid(locationID,timeSlotID,date);
		 assertEquals(expected, actual1);
		
		
	}

}
