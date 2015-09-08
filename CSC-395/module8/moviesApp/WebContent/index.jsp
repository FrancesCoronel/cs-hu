<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>

<body>
<%
	java.util.Date date = new java.util.Date();
	out.println("Current Date and Time is  " + date);
	
	String username = application.getInitParameter("username");
	out.println("Username is " + username);
%>
</body>

<a>Read Movie Database</a>

</html>