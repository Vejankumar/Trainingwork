package com.sapient;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("t1");
		String password = request.getParameter("t2");
		JdbcConnection jcon = new JdbcConnection();
		if(jcon.loginCheck(name,password) == true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Invalidlogin.jsp");
			rd.forward(request,response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
