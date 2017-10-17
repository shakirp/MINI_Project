<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password</title>
</head>
<body>
<form action="newpassword" method="post">
<div align="center" style="background-color: skyblue;margin-left: 180px;margin-right: 180px;">
	<table>
		<tr>
		<td>Enter your Email-Id : </td>
		<td><input type="email" name="email" required pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" placeholder="enter id "/></td>
		</tr>
		<tr>
		<td>Select Security Question :</td>
		<td>
				<select name="ques">
				<option value="1">What is your mother's maiden name?</option>
				<option value="2">What is your birth place?</option>
				<option value="3">Who is your best friend?</option>
				<option value="4">Your first comic book?</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>Answer : </td>
			<td><input type="text" name="answer" required placeholder="security answer"/></td>
		</tr>
	</table>
<input type="submit" value="check"/>
</div>
</form>
</body>
</html>