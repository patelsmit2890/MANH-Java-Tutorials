<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
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
<title>Welcome Administrator</title>

<%-- <%HttpSession session=request.getSession(false); %> --%>

<frameset cols="20%,*">
	<frame name="toc" src="<%=response.encodeRedirectURL("frame_contents.jsp")%>"/>
	<frame name="content" src="<%=response.encodeRedirectURL("visitPage.jsp")%>" />
</frameset>

</head>
<body>

</body>
</html>