<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	HttpSession session=request.getSession(false);
%>
<frameset cols="20%,*">
<frame name="toc" src="<%=response.encodeURL("toc.jsp")%>"/>
<frame name="content" />
</frameset>
</head>
<body>
Welcome
</body>
</html>