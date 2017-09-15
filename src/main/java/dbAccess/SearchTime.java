package dbAccess;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.print.attribute.DateTimeSyntax;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.api.mysqla.result.Resultset;


public class SearchTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SearchTime() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      int locationID = 0;
      int timeSlotID=0;
    
      locationID=Integer.parseInt(request.getParameter("location"));     
      timeSlotID=Integer.parseInt(request.getParameter("timeslot"));
      String date=request.getParameter("dat"); 
      
      try {
		DBConnect newConnection= new DBConnect();
		int rs=newConnection.FillGrid(locationID,timeSlotID,date);
		if(rs==1){
			response.sendRedirect("Login.jsp");	
	}
		else {
			response.sendRedirect("Login.jsp");	
			
		}
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
      
      
	}
}
