<%@page
	import="org.hibernate.type.descriptor.java.MutabilityPlanExposer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Enquiry Form</h1>
	
	
	<form:form action="save" modelAttribute="student" method="POST">
		
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name"/></td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td><form:input path="email"/></td>
			</tr>
			
			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" value="M"/>Male</td>
				<td><form:radiobutton path="gender" value="F"/>Female</td>
			</tr>
			
			<tr>
				<td>Courses</td>
				<td><form:select path="course">
						<form:option value="">--Select--</form:option>
						<form:options items="${courses}"/>
				</form:select></td>
			</tr>
			
			<tr>
				<td>Timings</td>
				<td><form:checkbox path="timing" value="mrning" />Morning 
				<form:checkbox path="timing" value="evng"/>Evening
				<form:checkbox path="timing" value="none"/>After Noon			
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="save"> </td>
			</tr>
		</table>
	
	
	
	</form:form>
	
	
	<%-- <form action="">
		
		Name: <input type="text" name="Name">
		Email: <input type="text" name="Email">
		 Gender:
    <input type="radio" name="gender" value="Male"> Male
    <input type="radio" name="gender" value="Female"> Female
    <br><br>
		 Courses:
    <select name="course">
        <option value="Java">Java</option>
        <option value="Python">Python</option>
        <option value="Spring Boot">Spring Boot</option>
    </select>
    <br><br>
		Timing:
    <input type="radio" name="timing" value="Morning"> Morning
    <input type="radio" name="timing" value="Noon"> Noon
    <input type="radio" name="timing" value="Evening"> Evening
    <br><br>

    <input type="submit" value="Submit">
		
	</form>
 --%>
</body>
</html>