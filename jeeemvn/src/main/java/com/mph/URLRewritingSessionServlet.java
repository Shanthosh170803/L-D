package com.mph;

import java.io.IOException;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/URLRewritingSessionServlet")
public class URLRewritingSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public URLRewritingSessionServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		response.sendRedirect(request.getParameter("username"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// doGet(request, response);
		HttpSession hs = request.getSession();
		out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
		String uname = request.getParameter("username");
		out.println(uname);
		response.sendRedirect("CookieSessionServlet?username=" + uname + "&JSESSIONID=" + hs.getId());
	}

}