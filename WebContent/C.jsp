<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>YO BHAI</title>
</head>
<body>
<%
request.setAttribute("c", "Three");

String a=(String) request.getAttribute("a");
String b=(String) request.getAttribute("b");
String c=(String) request.getAttribute("c");


out.println(a);
out.println(b);
out.println(c);

%>
</body>
</html>