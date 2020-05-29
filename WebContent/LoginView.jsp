<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
</head>

<body>
	<%@include file="Header.jsp"%>
	<form action="LoginCtrl" method="get">
		<table>
			<%
				String error = (String) request.getAttribute("error");

				if (error != null) {
			%>
			<center>
				<h1>invalid login</h1>
			</center>
			<%
				}
			%>



			<%
				String success = (String) request.getAttribute("success");

				if (success != null) {
			%>
			<center>
				<h1>
					<font color="red"> Logout Successfully </font>
				</h1>
			</center>
			<%
				}
			%>


			<tr>
				<th>Username :</th>
				<td><input type="text" name="user"></td>

			</tr>


			<tr>
				<th>Password :</th>
				<td><input type="password" name="pass"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>

			<tr>
				<td><input type="reset" value="Clear"></td>
			</tr>

		</table>

	</form>
	<%@include file="Footer.jsp"%>
</body>
</html>