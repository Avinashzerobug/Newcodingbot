<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a><ul>
				<li style="display: inline-block;padding: 20px;">
					<a href="index.jsp" class="col-lg-2 col-sm-2">Home Page</a>
					<li style="display: inline-block;">
					<a href="SearchByName" class="col-lg-2 col-sm-2">Search By Name</a>
				</ul>
			</div>
	</nav>
	<h1>Welcome to Space Name and Countries Search page</h1>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message3}</span>
	</c:forEach>
	<span style="color: red">${message1}</span>
	<span style="color: red;">${message2}</span>
	<span style="color: red;">${message3}</span>
	<form action="searchByNameAndCountries" method="get">
	Search By Name<input type="text" name="name" value=""/>
	Search By Color<input type="text"name="countries" value=""/>
	<input type="submit" value="search"/>
	</form>
	
	
	
	<div>
	<table class="table table-bordered">
	<tr>
	        <th>ID  </th>
			<th>name  </th>
			<th>countries  </th>
			<th>No Of Station  </th>
			<th>astranuatNames  </th>
			<th>Cost  </th>
			<th>Edit  </th>
			<th>Delete  </th>
			<th>ALL DATA  </th>
	</tr>
	
	<c:forEach items="${dto}" var="n">
	<tr>
	            <td>${c.id}</td>
				<td>${c.name}</td>
				<td>${c.countries}</td>
				<td>${c.noOfStation}</td>
				<td>${c.astranuatNames}</td>
				<td>${c.cost}</td>
				<td><a href="spaceup?id=${c.id}">Edit</a></td>
                <td><a href="delete?id=${c.id}">delete</a></td>
                 <td><a href="all?id=${c.id}">ALL DATA</a></td>
	</tr>
	</c:forEach>
	
	<c:forEach items="${dtoName}" var="n">
	<tr>
	            <td>${c.id}</td>
				<td>${c.name}</td>
				<td>${c.countries}</td>
				<td>${c.noOfStation}</td>
				<td>${c.astranuatNames}</td>
				<td>${c.cost}</td>
				<td><a href="spaceup?id=${c.id}">Edit</a></td>
                <td><a href="delete?id=${c.id}">delete</a></td>
                 <td><a href="all?id=${c.id}">ALL DATA</a></td>
	</tr>
	</c:forEach>
	
	<c:forEach items="${dtoCountries}" var="n">
	<tr>
	            <td>${c.id}</td>
				<td>${c.name}</td>
				<td>${c.countries}</td>
				<td>${c.noOfStation}</td>
				<td>${c.astranuatNames}</td>
				<td>${c.cost}</td>
				<td><a href="spaceup?id=${c.id}">Edit</a></td>
                <td><a href="delete?id=${c.id}">delete</a></td>
                 <td><a href="all?id=${c.id}">ALL DATA</a></td>
	</tr>
	</c:forEach>
	
		</table>	
	</div>
</body>
</html>