
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
<%
 String uname=request.getParameter("uname");
%>

<h1>Hello <%=uname%>! Welcome to our portal!</h1>

</body>
</html>

