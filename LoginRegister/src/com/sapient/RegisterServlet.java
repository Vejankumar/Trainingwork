package com.sapient;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("t1");
		String password = request.getParameter("t2");
		String cpassword = request.getParameter("t3");
		String age1 = request.getParameter("t4");
		String occu = request.getParameter("t5");
		JdbcConnection jcon = new JdbcConnection();
		int age = Integer.parseInt(age1);
		if(password.equals(cpassword) && jcon.RegisterCheck(name,password,age,occu) == true)
		{
			RequestDispatcher rd = request.getRequestDispatcher("SuccessRegistration.jsp");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("RegistrationFailure.jsp");
			rd.forward(request,response);
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
