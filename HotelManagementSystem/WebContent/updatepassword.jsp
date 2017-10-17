<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Password</title>
</head>
<body>
<form action="updatepwd" method="get">

<div align="center" style="background-color: skyblue;margin-left: 180px;margin-right: 180px;">
	<table>
		<tr>
		<td>Email-Id </td>
		<td><input type="email" name="email" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="enter email id"/></td>
	</tr>
		<tr>
			<td>Enter New Password:</td>
			<td><input type="password" name="password" required  placeholder="enter new password"/></
		</tr>
		<tr>
			<td>Re-Enter New Password:</td>
			<td><input type="password" name="repassword" required  placeholder="re-enter new password"/></
		</tr>
	</table>
	<input type="submit" value="update"/>
</div>
</form>

</body>
</html>