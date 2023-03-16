<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js" integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD" crossorigin="anonymous"></script>
  <link rel="icon" type = "image/x-icon" href="https://icons8.com/icon/80833/laptop">
  <style>
    body{
       
       background-image: url('https://media.istockphoto.com/id/1333071678/photo/earth-planet-surface-in-outer-space-stars-and-milky-way-on-background-sci-fi-space-wallpaper.jpg?b=1&s=170667a&w=0&k=20&c=5FwEjQOpFKSjnlK6j6rxpG6oK5jux508eenH79E8kdM=');
       background-repeat: no-repeat;
       background-attachment: fixed;
       background-size: 100% 100%;
    
    }
  
 .up
 {
   background-color: white;
   text-align:  center;
 }
 
  
  
  </style>
  
  
</head>
<body>

<nav class="navbar navbar-expand-lg bg-body-tertiary"  class="navbar bg-dark" data-bs-theme="dark">
  <div class="container-fluid" >
    <a class="navbar-brand" href="#">Space Station</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="space">Register Here To go to Mars</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="SpaceSearch.jsp">Verification ID</a>
        </li>
        
          <li class="nav-item">
          <a class="nav-link" href="CountrySearch.jsp">Country Confirmation</a>
        </li>
        
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            ALL DATA
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="all">Check all</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Disabled</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

   <h1 class = "up">Upload the Image</h1>
   <form action = "upload" method = "post" enctype = "multipart/form-data">
    Upload : <input type = "file" name = "img" />
    <input type = "submit" value = "Upload" />
   </form>


</body>
</html>