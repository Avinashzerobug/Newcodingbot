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
					<a href="CountrySearch" class="col-lg-2 col-sm-2">Country Search</a>
				</ul>
			</div>
	</nav>
	<h1>Welcome to the addtional data check</h1>
	<span style="color: red">${message1}</span>
	<form action="searchByName" method="get">
	Search By Name<input type="text" name="name"/>
	<input type="submit" value="search"/>
		</form>
	
	<div>
	<table class="table table-bordered">
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Price</th>
	<th>Capacity</th>
	<th>Color</th>
	<th>Since</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
	<c:forEach items="${dto}" var="t">
	<tr>
	<td>${t.id}</td>
	<td>${t.name}</td>
	<td>${t.price}</td>
	<td>${t.capacity}</td>
	<td>${t.color}</td>
	<td>${t.since}</td>
	<td><a href="update?id=${t.id}">Edit</a></td>
	<td><a href="delete?id=${t.id}">Delete</a></td>
	</tr>
	</c:forEach>
		</table>	
	</div>
</body>
</html>