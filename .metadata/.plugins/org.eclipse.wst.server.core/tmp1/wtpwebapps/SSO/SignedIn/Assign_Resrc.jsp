<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page session="false" %>
     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
BODY { 
background-image: url(http://2.bp.blogspot.com/-Myl-OoQe140/Typc8L_g7RI/AAAAAAAAAVI/_nsww28mGaY/s1600/human+capital.jpeg); 
background-repeat: no-repeat; background-size: 100%;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form action="modifyResorce" method="post">
		Roles
		<br>
		<jsp:useBean id="rolebean" class="DBAccess.RoleBean" scope="request" />
		<select id="RoleSelect" name="Role">
			<c:forEach var="role" items="${requestScope.rolebean.roles}">

				<option value="${role.key}">${role.value}</option>

			</c:forEach>
		</select>
		
		
		<table border="2" align="center" >
		<tr>
		<td bgcolor="#54C571">Resources</td>
		</tr>
		<jsp:useBean id="resrcbean" class="DBAccess.ResourceBean" scope="request"/>
		<c:forEach var="rsrc"  items="${requestScope.resrcbean.resource}" >
			<tr>
				<td bgcolor="#54C571" >
				<input type="checkbox" name="checkResources" value="${rsrc.key}" id="${rsrc.key}">
				</td>
				<td bgcolor="#54C571">${rsrc.value}</td>
			</tr>
		</c:forEach>	
		</table>
		<input type="submit" value="Modify" name="role" align="right">
	</form>
		

</body>
</html>