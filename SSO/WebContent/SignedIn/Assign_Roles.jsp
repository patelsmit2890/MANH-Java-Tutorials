<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="false" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
BODY {
	background-image: url(http://www.ibct.com/i/images/inperson.jpg);
	background-repeat: no-repeat;
	background-size: 100%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	<br>
	<form action="assignRoles" method="post">
		User
		<jsp:useBean id="userbean" class="DBAccess.UserBean" scope="request" />
		<select id="UserSelect" name="User">
			<c:forEach var="usr" items="${requestScope.userbean.users}">

				<option value="${usr.key}">${usr.value}</option>

			</c:forEach>
		</select>



		<table border="2" align="center" cellspacing="5" cellpadding="3">
			<tr>
				<td bgcolor="#FEFCFF">Role</td>
			</tr>
			<jsp:useBean id="rolebean" class="DBAccess.RoleBean" scope="request" />
			<c:forEach var="role" items="${requestScope.rolebean.roles}">
				<tr>
					<td bgcolor="#FEFCFF"><input type="checkbox"
						name="checkedRoles" value="${role.key}" id="${role.key}">
					</td>
					<td bgcolor="#FEFCFF">${role.value}</td>
				</tr>
			</c:forEach>

		</table>

		<input type="submit" value="Assign Role" name="role" align="right">
	</form>

</body>
</html>