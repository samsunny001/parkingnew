package dbAccess;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginCheck() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username=request.getParameter("uname");
	String password=request.getParameter("password");
	try {
		DBConnect newConnection= new DBConnect();
		if(newConnection.searchUser(username, password)){
		response.sendRedirect("HomePage.jsp");	
		}
		else
		{
			
			response.sendRedirect("Login.jsp");		
		}
	}
		catch(SQLException e){
		e.printStackTrace();	
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
