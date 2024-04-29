<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
<%@ page import="com.learningapp.model.CourseModel" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Course</title>
	<h1 style="color:red"><marquee>Learning App</marquee></h1>
	</head>
	<body bgcolor="black">
		
		<h2 style="color:white">Course List</h2>
			<%
			    List<CourseModel> courses = (List<CourseModel>) request.getAttribute("courses");
			    for (CourseModel course : courses) {
			    	
		   	%>
			    	<form action="./coursepurchased">
				        <div style="color:darkgreen">
					        <%= course.getId() %>.
					        <%= course.getCourseName()%>
					        Rs.<%= course.getPrice()    %>
					        by <%= course.getInstructor()   %>
					        
					        <input type="hidden" name="courseName" value="<%= course.getCourseName() %>">
		     		  	    <input type="submit" value="Buy now">
	     		  	    </div>
     		  	    </form>
			        
			    <%
			        }
			    %>
			    
		    
	</body>
</html>