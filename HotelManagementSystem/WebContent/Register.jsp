<%@page import="java.io.PrintWriter"%>
<%@page import="com.cg.hm.service.IHMServIMPL"%>
<%@page import="com.cg.hm.service.IHMServ"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION</title>
<style>
div{background-color: orange;}
</style>

</head>
<body style="background-image: C:\Users\Public\Pictures\Sample Pictures\Koala.jpg">
<% 
String message=(String)request.getAttribute("reg_failed");
if(message!=null)
{
	PrintWriter out2 =  response.getWriter();
	out2.println("<p style='color:red'>"+message+"</p><br><br>");
}
%>

<form action="register" method="post" />
<div align="center" style="border: 2px;background-color: aqua;margin-left: 180px;margin-right: 180px;">
	<h2>Register Here !!!</h2>
	<table>
	
	<tr>
			<td>User Name : </td>
			<td><input type="text" name="uname" placeholder="user name" required pattern="^[A-Za-z0-9_]{5,15}$" title="Must Start with alphabets or numbers or underscore with atleast of 5 character"/></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type="password" name="password" placeholder="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7}" title="Must contain at least one number and one uppercase and lowercase letter, and should be 7 characters"></td>
		</tr>
		<tr>
			<td>Gender :</td>
			<td>
			<input type="radio" name="gender" value="male">Male
			<input type="radio" name="gender" value="female" required>female
			</td>
		</tr>
		<tr>
			<td>Email :</td>
			<td> <input type="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required></td>
		</tr>
		
		<tr>
			<td>Date of Birth :</td>
			<td><input type="date" name="dob" required/></td>
		</tr>
		
		<tr>
			<td>Mobile Number:</td>
			<td><input type="text" name="mnum" required pattern="[1-8][0-9]{9}" title="Start with 1-8 and must be 10 digit"/></td>
		</tr>
		
		<tr>
			<td>Phone(Landline) :</td>
			<td><input type="text" name="phone" required pattern="[0-9]{3}[0-9]{8}" title="Please include STD code"/></td>
		</tr>
		
		<tr>
			<td>Address :</td>
			<td><input type="text" name="address" required/></td>
		</tr>
		
		<tr>
			<td>Security Question :</td>
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
	<input type="submit" value="Register"/>
</div>
</form>
</body>
</html>