<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <li class="nav-item">
   <a class="nav-link" href="SpaceStatio.jsp">Search</a>
    <a class="nav-link" href="aero">Register here</a>
  </li>

     <h1> Space Verification Search Here...!</h1>

	<h3 ><span style="color: red;">${message}</span></h3>
	<form action="search" method="get">
	Search By Id <input type="text" name="id"/>
	<input type="submit" value="search" class="btn btn-primary"/>
	</form>
	
	
	
	<div>


	<h3 style="color: blue;">Search Results</h3>
	Name : ${dto.getName()} <br>
	countries : ${dto.countries} <br>
	Cost : ${dto.cost} <br>
	noOfStation : ${dto.noOfStation}
	astranuatNames: ${dto.astranuatNames}<br>
	</div>



</body>
</html>