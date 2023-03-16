<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
  <link rel="icon" type = "image/x-icon" href="https://icons8.com/icon/80833/laptop">
</head>
<style>
body {
background: url("https://media.istockphoto.com/id/942602216/vector/red-planet-landscape-vector-illustration-space-background-with-place-for-text-surface-of-the.jpg?s=612x612&w=0&k=20&c=XZEZTG4SaGC6cXULRBcR3oRo4z4S8pFjBIrFlunN0II=");
background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}
</style>

<body>

 
  <div class="bg-img">
   <nav class="navbar bg-body-tertiary"  class="navbar bg-dark" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="https://cdn1.vectorstock.com/i/1000x1000/52/95/logo-with-abstract-image-of-cosmic-station-space-vector-19205295.jpg" alt="Logo" width="48" height="36" class="d-inline-block align-text-top">
      Space-World
    </a>
   
   <div class="btn-group">
 
  <a href="SpaceSearch.jsp" class="btn btn-primary">Verification ID</a>
  <a href="index.jsp" class="btn btn-primary">HOME</a>
   <a href="SpaceStation.jsp" class="btn btn-primary">Reigster here</a>
</div>
  </div> 
 </nav>
  </div>

<pre>
	<h1 style = "color: white;">Welcome to the SkyRoot space station</h1>
	<h2 style = "color: white;">confirm your destination by search country name here</h2>
	<form style = "color: white;"action="searchbycountry" method="get">
Search by country <input type="text" name="countries" /> <input
			type="submit" value="search" /></form>
  <div style = "color: white;">
	<table>
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
		<c:forEach items="${list}" var="c">
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
</pre>

</body>
</html>