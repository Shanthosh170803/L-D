<%@ page import="com.mph.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!Student st = new Student();%>
	<%
	int sid = Integer.parseInt(request.getParameter("sid"));
	String sname = request.getParameter("sname");
	st.setSname(sname);
	st.setSid(sid);
	%>
	<%=st.getSname()%>
	<%=st.getSid()%>
</body>
</html>