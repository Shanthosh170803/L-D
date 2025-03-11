<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<form action="FS" method="get">
		Customer Name :<input type="text" name="custname" /><br /> Customer
		Pwd : <input type="text" name="custpwd" /></br> <input type="submit"
			value="Submit" />
	</form>
	<form action="CookieSessionServlet" method="post">
		Username: <input type="text" name="username"> <input
			type="submit" value="Login with Cookie">
	</form>
	<form action="URLRewritingSessionServlet" method="post">
		Username: <input type="text" name="username"> <input
			type="submit" value="Login with URL Rewriting">
	</form>
</body>
</html>
