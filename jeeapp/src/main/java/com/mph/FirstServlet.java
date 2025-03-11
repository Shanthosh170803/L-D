package com.mph;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig sc;
	ServletContext scontext;
	public void init(ServletConfig config) {
		System.out.println("From Init........................");
		sc=config;
	}
    /**
     * Default constructor. 
     */
    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		scontext =sc.getServletContext();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>First Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 style='color:blue'>"+request.getContentLength()+"</h1>");
		out.println(request.getMethod());
		out.println("<h4 style='color:red'>"+request.getQueryString()+"</h4>");
		out.println(request.getServletPath());
		out.println("<h1 style='color:blue'>"+request.getRequestURI());
		out.println("<h1 style='color:brown'>"+request.getHeaderNames());
		out.println("<a href='SecondServlet'/>Click</a>");
		out.println("</body>");
		out.println("</html>");
		
		String cname =request.getParameter("custname");
		String cpwd= request.getParameter("custpwd");
		out.println("Welcome "+cname+" with custid:"+cpwd);
		
		String uname = sc.getInitParameter("un");
		String passwd=sc.getInitParameter("pwd");
		out.println("Config name from 1st servlet:"+uname+"--"+passwd);
		String name=scontext.getInitParameter("dbun");
		out.println("Context name from 1st servlet:"+name);
		
		if(cname.equals(uname) && cpwd.equals(passwd)) {
			RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
			rd.include(request, response);	
		}else {
			out.println("<a href='http://www.google.com'>Google</a>");
		}
		
		Enumeration params =request.getParameterNames();
		while(params.hasMoreElements()) {
			String pnames=(String)params.nextElement();
			out.println(pnames +" -- "+request.getParameter(pnames));
			
		}
		
		Enumeration attributes =request.getAttributeNames();
		while(attributes .hasMoreElements()) {
			String atti=(String)attributes .nextElement();
			out.println(atti );
			
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void destroy() {
		System.out.println("From Destroy........................................");
	}
}
