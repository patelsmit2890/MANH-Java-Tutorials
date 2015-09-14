<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- //register bean in all p[age that we have to use getter and setter properties -->
<jsp:useBean id="rgbn" scope="request" class="ma.di.usingconstructor.RegsBean"></jsp:useBean>
thank you 
<jsp:getProperty property="fname" name="rgbn"/>

for registering..
</body>
</html>