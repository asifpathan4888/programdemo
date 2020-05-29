<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1 align="center" >REGISTRATION PAGE</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title >Registration Page</title>
</head>

<body background="road.jpg">
<form action="RegisterControl" method="get">
<table align="center">
<tr>
<th>First Name:</th>
<td>

<%-- <%
		String error = (String) request.getAttribute("nameerror");

			if (error != null) {
			%>
			
			
			<%
				}
			%> --%>
<input type="text" name="Fname" <%
		String error = (String) request.getAttribute("nameerror");

			if (error != null) {
			%> placeholder=" Enter First Name" <%
				}
			%> >
</td>
</tr>

<tr>
<th>Last Name:</th>
<td>


<input type="text" name="Lname" <%
		String lerror = (String) request.getAttribute("lnameerror");

			if (lerror != null) {
			%> placeholder=" Enter Last Name" <%
				}
			%>  >
</td>
</tr>

<tr>
<th>Username:</th>
<td>

<input type="text" name="uname" title="name" <%
		String uerror = (String) request.getAttribute("unameerror");

			if (uerror != null) {
			%> placeholder=" Enter User Name" <%
				}
			%>  >
</td>
</tr>

<tr>
<th>Password:</th>
<td>
<input type="password" name="pass">
</td>
</tr>

<tr>
<th>Email:</th>
<td>
<input type="text" name="Email">
</td>
</tr>

<tr>
<th>Address:</th>
<td>
<input type="text" name="Add">
</td>
</tr>

<tr>
<th>Phone:</th>
<td>
<input type="numeric" name="Phone">
</td>
</tr>

<tr>
<th>Gender:</th>
<td>
<input type="text" name="Gender">
</td>
</tr>
</table>



<table align="center">
<tr>
<td>
<input type="submit" value="Submit">
<input type="reset" value="Clear">
</td>
</tr>
</table>
</form>
</body>
</html>