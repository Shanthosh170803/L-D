package com.mph;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;

@WebFilter(filterName = "MyFilter", urlPatterns = "/FS", initParams = { @WebInitParam(name = "fun", value = "Shanthosh"),
		@WebInitParam(name = "fpwd", value = "pass") })
public class MyFilter extends HttpFilter implements Filter {
	FilterConfig fc;

	public MyFilter() {
		super();
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("From Filter init");
		this.fc = fConfig;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("From Dofilter....");
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = response.getWriter();
		String cun = req.getParameter("custname");
		String cpwd = req.getParameter("custpwd");

		String funame = fc.getInitParameter("fun");
		String fpass = fc.getInitParameter("fpwd");
		if (cun.equals(funame) && cpwd.equals(fpass)) {

			long starttime = System.currentTimeMillis();
			chain.doFilter(request, response);
			long endtime = System.currentTimeMillis();
			long timetaken = endtime - starttime;
			System.out.println("Time taken by the servlet : " + timetaken);
		} else {
			response.setContentType("text/html;charset=UTF-8");
			out.println("You are not a Valid User...");
		}
	}

	public void destroy() {
		System.out.println("From Filter Destroy...");
	}

}
