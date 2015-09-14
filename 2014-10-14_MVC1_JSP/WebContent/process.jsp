<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="rgbn" scope="request" class="ma.di.usingconstructor.RegsBean"></jsp:useBean>

	<!-- this is required when we have not put similar name in bean and register.jsp page -->
	<%-- <jsp:setProperty property="fname" name="rgbn" param="firstname"/> --%>

	<!-- if we want to include all setter method then use below * in property -->
	<jsp:setProperty property="*" name="rgbn" />

	<c:if test="${not empty requestScope.rgbn.validation}">
		<jsp:forward page="register.jsp"></jsp:forward>
	</c:if>
	<jsp:forward page="thanks.jsp"></jsp:forward>
</body>
</html>