<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRM Update form</title>
<link type=text/css rel="stylesheet" href="./css/style.css">
<link type=text/css rel="stylesheet" href="./css/add-customer-style.css">
</head>
<body>
    <div id="wrapper">
    	<div id="header">
    			<h1>CRM Update form</h1>
    	</div>
    </div>
    <form:form action="registerCustomer" modelAttribute="customer">
      <table>
          <form:hidden path="id"/>
          <tr>
          <th>Customer First Name</th>
          <td><form:input path="firstName" /></td>
          </tr>
              <tr>
          <th>Customer Last Name</th>
          <td><form:input path="lastName" /></td>
          </tr>
              <tr>
          <th>Customer City</th>
          <td><form:input path="city" /></td>
          </tr>
          
                <tr>
          
          <td><input type="submit" value="SignUp"/></td>
          </tr>
      </table>
  </form:form>
</body>
</html>