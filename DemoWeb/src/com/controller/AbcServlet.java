package com.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AbcServlet
 */
public class AbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int i=0;
       
    
    public AbcServlet() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Server Instantiated.............");
	}


	public void destroy() {
		System.out.println("Server Destroyed.............");
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Server request came : "+ ++i);
	}

}
