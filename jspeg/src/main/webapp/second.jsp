<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	out.println(pageContext.getAttribute("page"));
	%>
	<br>
	<%
	out.println(request.getAttribute("rs"));
	%>
	<br>
	<%
	out.println(session.getAttribute("ss"));
	%>
	<br>
	<%
	out.println(application.getAttribute("as"));
	%>
</body>
</html>