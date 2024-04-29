<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.learningapp.model.CourseModel" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
<h1 style="color:red"><marquee>Learning App</marquee></h1>
</head>
<body bgcolor="black">
<h2 style="color:white">Confirmation !!</h2>

<p style="color:darkgreen">Thank you for purchasing <%= request.getAttribute("courseName") %> course</p>
</body>
</html>