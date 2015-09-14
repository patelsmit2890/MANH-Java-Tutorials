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

	<%-- <%HttpSession session=request.getSession(false); %> --%>
	
	<a style="color:white" href="<%=response.encodeRedirectURL("transact.do?pg=incl_usr")%>" target="content">Include Users</a>
	<br><br>
	<a style="color:white" href="<%=response.encodeRedirectURL("transact.do?pg=create_roles")%>" target="content">Create Role and Assign Resources</a>
	<br><br>
	<a style="color:white" href="<%=response.encodeRedirectURL("transact.do?pg=assign_resrc")%>" target="content">Modify Resources of Roles</a>
	<br><br>
	<a style="color:white" href="<%=response.encodeRedirectURL("transact.do?pg=assign_roles")%>" target="content">Assign Roles to Users</a>
	<br><br>
	<a style="color:white" href="<%=response.encodeRedirectURL("transact.do?pg=logt")%>" target="_parent">Logout</a>
	<br><br>

</body>
</html>