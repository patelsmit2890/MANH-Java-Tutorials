<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
  %>
  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome User</title>

<frameset rows="8%,*">
<frame name="welcome" src="<%=response.encodeRedirectURL("welcome.jsp")%>" />

<frameset cols="15%,*">
	<frame name="toc" src="<%=response.encodeRedirectURL("user_contents.jsp")%>"/>
	
	<frame name="content" src="<%=response.encodeRedirectURL("visitUser.jsp")%>"/>
	
</frameset>
</frameset>
</head>
<body>
	

</body>
</html>