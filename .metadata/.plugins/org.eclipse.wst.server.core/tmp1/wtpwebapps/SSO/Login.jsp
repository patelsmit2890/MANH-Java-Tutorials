<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link style="text/css" rel="stylesheet" href="style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

<h1 align="center">SINGLE SIGN ON</h1>


<form action="process" method="post" name="form1">
<br>
<br>
<br>
<br>
		<table align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" name="fname" value="Smit Patel" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="pword" value="abcd" /></td>
			</tr>
			<tr></tr>
			<tr>
				<td colspan="2" align="right">
				<input type="submit" value="Login" name="Login" /></td>
			</tr>
		</table>
		<%String msg = (String)request.getAttribute("errorMessage");
			if (msg != null) {
    	%><p style="color:black" align="center"><b><%= msg %></b></p><%}%>
	</form>

</body>
</html>