<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title> </title>

</head>
<body bgcolor="#4E8975">
		<jsp:useBean id="getResrc" class="DBAccess.UserInfo" scope="request"/>
		<c:forEach var="rsrc"  items="${requestScope.getResrc.resources}" >
		
			<a style="color:white" href="UserResources/${rsrc}") target="content">${rsrc}</a>
			<br><br>  
			
		</c:forEach>
		
		<a style="color:white" href="Login.jsp" target="_parent">Logout</a>
</body>
</html>