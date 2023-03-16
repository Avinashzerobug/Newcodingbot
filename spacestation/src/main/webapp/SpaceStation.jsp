<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Space World</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
  <link rel="icon" type = "image/x-icon" href="https://icons8.com/icon/80833/laptop">
</head>
<style>
body {
	background-image:
		url('https://i0.wp.com/indiaeducationdiary.in/wp-content/uploads/2022/07/nasa_space_apps_challenge_registration_image_07142022.png?fit=985%2C554&ssl=1');
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}

.register {

  background-color: 	--bs-primary-bg-subtle;
}

.bg-img {
 
 background-image: url("http://open.canada.ca/sites/default/files/2020-07/space_apps_covid19_banner.png");

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
  
</div>
  </div> 
 </nav>
  </div>







    <span class="placeholder col-12 bg-light">
    	<h1 color>WELCOME TO THE INTERNAIONAL SPACE STATION</h1>
    
    </span>




	<form action="space" method="post">

		<pre>
  
    <c:forEach items="${errors}" var="e">
    <span style="color: red;">${e.message}</span>
    </c:forEach>
  
   
  <label for="exampleFormControlInput1" class="btn btn-primary">Name</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter your name" name = "name" >

  <label for="exampleFormControlInput1"  class="btn btn-primary">Countries</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter your Countries" name = "countries" >

  <label for="exampleFormControlInput1"  class="btn btn-primary">Cost</label>
  <input type="number" class="form-control" id="exampleFormControlInput1" placeholder="Enter your minimum cost" name = "cost" >

  <label for="exampleFormControlInput1"  class="btn btn-primary">Number of station</label>
  <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter your station number" name = "noOfStation" >

  <label class="btn btn-primary"> Astranaut names</label> 
    <select class="form-select" 
    aria-label="Default select example" name="astranuatNames" >
    
	  <option selected value=""  class="btn btn-primary"> selected type</option>
	<c:forEach items="${astranuatName}" var="t">
	<option value="${t}">${t}</option>
	</c:forEach>
	</select>



 <input type="submit" value="Click To Save">

</pre>
	</form>

</body>
</html>