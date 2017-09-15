<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>
    <%@page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="SearchTime">
<table>
<tr>
<td>Date</td>
<td><input type="text" name="dat"></td>
</tr>
	<tr>
	<td>Location</td>
	<td><select name="location" id="location">
	<option value="1">jackson</option>
	<option value="2">buick</option>
	<option value="3">Boltn</option>
	<option value="4">Sydny</option>
	</select></td>
	</tr>
		<tr>
		
		<tr>
		<td>Time Slot</td>
		<td><select name="timeslot" id="timeslot">
		<option value="1">9-10</option>
		<option value="2">10-11</option>
		<option value="3">11-12</option>
		<option value="4">12-13</option>
		
		</select></td>
		</tr>
		
			<tr>
			<td></td>
			<td><input type="Submit" value="Seacrh"></td>
			</tr>
	</table>
	<table>
	<tr>
	<td>
	<input type="text" name="ID">
</td></tr>
	</table>
</form>

<form method="post" action="Booking">
<table>
<tr>
<td>
<input type="Checkbox" name="Chek">
</td>
</tr>
<tr>
<td>
<input type="submit" value="g">
</td>
</tr>
</table>



</form>
</body>
</html>