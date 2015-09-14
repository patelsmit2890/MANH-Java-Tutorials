<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<%@ include file="/copyright.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- variable declared in scriptlet tag, it will available for locally..[local scope]  check jsp page inside project under jboss server -->
<% int counter =569;		
        out.println(" Counter is: "+counter);       
%>

<!-- variable declared in declarative tag, it will available for globally..[global scope]  check jsp page inside project under jboss server -->
<%! int counter1 =5;
%>
</body>
</html>