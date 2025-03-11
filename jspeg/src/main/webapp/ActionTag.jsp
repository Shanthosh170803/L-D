<%@ page import="jakarta.servlet.RequestDispatcher"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Using Action tag</title>
</head>
<body>
	<jsp:useBean id="st" class="com.mph.Student" scope="request"></jsp:useBean>
	<jsp:setProperty property="sid" name="st" value="1708" />
	<jsp:setProperty property="sname" name="st" value="Shanthosh" />
	<jsp:getProperty property="sid" name="st" />
	<jsp:getProperty property="sname" name="st" />

	<%
	out.println("--------------------");
	%>
	${requestScope.st.sid } ${requestScope.st.sname }
	<%
	pageContext.setAttribute("page", "I am from page scope");
	%>
	<br />
	<%
	request.setAttribute("rs", "I am from Request scope");
	RequestDispatcher rd = request.getRequestDispatcher("second.jsp");
	rd.forward(request, response);
	%>
	<br />
	<%
	session.setAttribute("ss", "I am from Session scope");
	%>
	<br />
	<%
	application.setAttribute("as", "I am from Application scope");
	%>


</body>
</html>