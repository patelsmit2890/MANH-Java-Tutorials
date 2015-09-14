<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:if test="${not empty requestScope.rgbn.validation }">
			<c:forEach var="msg" items="${requestScope.rgbn.validation}">
				<li>${msg}</li>
			</c:forEach>
		</c:if>
	</ul>
	<form action="process.jsp" method="get">
		<input type="text" name="fname" value="${param.fname }" /> <br>
		<input type="text" name="lname" value="${param.lname }" /><br> <input
			type="text" name="email" value="${param.email }" /><br> <input
			type="submit" name="submit" value="Register" />
	</form>
</body>
</html>