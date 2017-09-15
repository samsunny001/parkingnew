package dbAccess;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.xml.ws.Response;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class DBConnect {
public Connection myConn;
	public DBConnect() throws ClassNotFoundException, SQLException {		
		//	Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/park","root","");		
			Class.forName("com.mysql.cj.jdbc.Driver");

			 myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/park?autoReconnect=true&useSSL=false","root","");		
		if(myConn==null){
			System.out.println("connection closed");
			
		}
			}	
	
	
	
	
	
		public int FillGrid(int locatioid,int timeid,String n) throws SQLException {
		    Connection connection = null;
		    	PreparedStatement myStmt = null; 		  	 
		  	ResultSet myRS=null;
		  	List ls=new List();
		  		myStmt = myConn.prepareStatement("select * from park.parksp psp where psp.ID not in (select pd.ParkingID from parkdetails pd inner join location l on pd.LocationID=l.ID inner join time t on t.ID=pd.TimeID where t.ID=?  and pd.LocationID =?)");
		  		myStmt.setInt(1, timeid);
		  		myStmt.setInt(2, locatioid);
		  		//myStmt.setString(3, date);
		  		myRS = myStmt.executeQuery();
		  		if(myRS.next()) {
		  		return	1;
		  		}
				return 0;
		        
}
	public boolean searchUser(String username, String password) throws SQLException, ClassNotFoundException {
		PreparedStatement myStmt = null; 
		ResultSet myRS=null;		
			try {			
	
			myStmt = myConn.prepareStatement("select * from user where name=? and password=? ");
			myStmt.setString(1, username);
			myStmt.setString(2, password);
			myRS = myStmt.executeQuery();
			
			if(myRS.next()) {
				
				return true;
			}
			else {
				
				return false;
			}
			} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String[] args) {

		
	}
		
		
	

}
