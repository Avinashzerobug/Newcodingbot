<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to the SkyRoot space station</h1>
	<h2>confirm your destination by search country name here</h2>

	<form action="searchbycountry" method="get">
		Search by country <input type="text" name="countries" /> 
		<input type="submit" value="search" />
	</form>

	<table>
		<tr>
			<th>ID</th>
			<th>name</th>
			<th>countries</th>
			<th>No Of Station</th>
			<th>astranuatNames</th>
			<th>Cost</th>
		</tr>
		<c:forEach items="${list}" var="c">
			<tr>
				<td>${c.id}</td>
				<td>${c.name}</td>
				<td>${c.countries}</td>
				<td>${c.noOfStation}</td>
				<td>${c.astranuatNames}</td>
				<td>${c.cost}</td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>