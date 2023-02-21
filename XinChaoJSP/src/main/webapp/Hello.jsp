<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thử nghiệm 1</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<h2>Expression	Try</h2>
	<%=4+10 %>
	<hr>
	<h1>NOW:</h1>
	<%= new Date().toGMTString() %>
	<p>End</p>
</body>
</html>