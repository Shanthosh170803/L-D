package com.mph;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig sc;
	ServletContext scontext;
   public void	init(ServletConfig config) {
	   System.out.println("From 2nd serv Init ...");
	   sc=config;
   }
    /**
     * Default constructor. 
     */
    public SecondServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		scontext = sc.getServletContext();
		out.println("I am from Second Servlet............");
		
		
		String cname =request.getParameter("custname");
		String cpwd = request.getParameter("custpwd");
		out.println("Welcome " + cname + " to 2nd servlet ");
		
		String uname = sc.getInitParameter("un");
		String passwd  = sc.getInitParameter("pwd");
		out.println(" Config  Name from 2nd serv : "+uname + passwd);
		String name = scontext.getInitParameter("dbun");
		out.println(" Context Name from 2nd Servlet: "+name);
	}
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
