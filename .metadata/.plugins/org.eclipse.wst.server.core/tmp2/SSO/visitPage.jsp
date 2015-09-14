<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue">
<jsp:useBean id="bean" class="DBAccess.UserInfo" scope="request"/>

<h1 style="margin-top:20px"> Welcome ${requestScope.bean.name} </h1>
<p style="font-size: 20px"> <ul>
  <li> <b>Include Users:</b> To add Users to the Database </li>
  <li> <b>Create Role and Assign Resources:</b> Creates a new role and allocates fixed resources to it  </li>
  <li> <b>Modify Resources of Roles:</b> Resources assigned to Roles can be modified as required  </li>
  <li> <b>Assign Roles to Users:</b> Roles is assigned to Users which can be updated as required  </li>
</ul>
</body>
</html>