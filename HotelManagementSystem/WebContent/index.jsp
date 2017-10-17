<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">

<div align="center" style="background-color: skyblue;margin-left: 180px;margin-right: 180px;">
<h2>Login</h2>
<table>
	<tr>
		<td>Email-Id </td>
		<td><input type="email" name="email" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="enter id to login"/></td>
	</tr>
	
	<tr>
		<td>Password</td>
		<td><input type="password" name="password" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="enter password"/></td>
	</tr>
</table>
<div align="center">
<input type="submit" value="Login"/><br>
<a href="Register.jsp">New User?Register</a><br>
<a href="forgotpwd.jsp">Forgot Password</a>
</div>
</div>
</form>
</body>
</html>