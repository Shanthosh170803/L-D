package com.mph;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet(urlPatterns="/FS")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>First Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		HttpSession hs = request.getSession();
		hs.setAttribute("Watch", "5000");

		out.println("<h2>" + hs.getId() + "</h2>");
		out.println("<h2>" + hs.isNew() + "</h2>");
		out.println("<h2>" + hs.getCreationTime() + "</h2>");
		out.println("<a href='Serv2'>Click for Serv2</a>");
		out.println();
		out.println("</body>");
		out.println("</html>");
//		response.sendRedirect("URLRewritingSessionServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}