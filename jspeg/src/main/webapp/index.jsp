<%@ page import="java.util.Date"%>
<%@ page import="com.mph.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="myerrpage.jsp" buffer="64kb"%><html>

<%@include file="banner.html"%>
<!DOCTYPE html>
<html>
<body>
	<h2>Hello World!</h2>
	<%--<%!int x = 17;

	<%
	int y = 2003;
	out.println(x + " August " + y);
	%>

	<%
	out.println("JSP is easy");
	%>

	<%=new Date()%>

	<%--<%
	if (true) {
		throw new Exception();
	}
	--%>
	<form action="second.jsp" method="get">
		Student Name :<input type="text" name="sname" /> Student ID : <input
			type="text" name="sid" /></br> <input type="submit" value="Submit" />
	</form>

</body>
</html>
