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
	background-image:
		url('https://media.istockphoto.com/id/162542504/photo/earth-sunrise-in-space.jpg?s=612x612&w=0&k=20&c=yOz6xe894yVDOtt29uFDybMbNyKdpW_4vOUUEkAlaEI=');
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
 
  <a href="SpaceStation.jsp" class="btn btn-primary">Register here</a>
  <a href="CountrySearch.jsp" class="btn btn-primary">Search your details</a>
   <a href="index.jsp" class="btn btn-primary">Home</a>
</div>
  </div> 
 </nav>
  </div>
  <pre>
                                            <h1 style = "color: white;"> Space Verification Search Here...!</h1>
</pre>
	<h3 ><span style="color: red;">${message}</span></h3>
	<form action="search" method="get" style = "color: white;">
	Search By Id <input type="text" name="id"/>
	<input type="submit" value="search" class="btn btn-primary"/>
	</form>
	
	
	
	<div>


	<h3 style="color: blue;">Search Results</h3>
	<div style = "color: white;">
	Name : ${dto.getName()} <br>
	countries : ${dto.countries} <br>
	Cost : ${dto.cost} <br>
	noOfStation : ${dto.noOfStation}<br>
	astranuatNames: ${dto.astranuatNames}<br>
	
	
	</div>
  </div>

</body>
</html>