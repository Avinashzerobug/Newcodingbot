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
</head>
<body>

 <nav class="navbar bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="/docs/5.3/assets/brand/bootstrap-logo.svg" alt="Logo" width="30" height="24" class="d-inline-block align-text-top">
      Welcome to the Egg Paradise
    </a>
    <a href= "index.jsp">Home</a>
  </div>
</nav>


 <form action="egg"  method="post"/>
		

        <pre>
                  Hotel name             <input type = "text" name= "bakeryName" />
                 Egg Dish Name       <select name = "dishName">
                 <option>Select</option>
                 <option>Egg Roles</option>
                 <option>Egg Rice </option>
                 <option>Egg Pakoda</option>
                 <option>Egg Kurma</option>
                 <option>Omlet</option>
                 <option>Half Boil</option>
                 <option>Egg Bhurji</option>
                 <option>Egg Masala</option>    
                 </select>
                 Egg type <select name = "type">
                 <option>Select</option>
                 <option>Naati</option>
                 <option>Jawari</option>
                 <option>>Hybrid</option>
                 <option>Duck</option>
                 <option>Dinosar</option>
                 <option>Crocodile</option>
                 <option>Ostrich </option> 
                 </select>
                 Price <input type = "text" name = "price">
                 Quantity <select name = "Quantity">
                 <option>Select</option>
                  <option>1</option>
                   <option>2</option>
                    <option>3</option>
                     <option>4</option>
                      <option>5</option>
                       <option>6</option>
                       </select>    
                 Take Away Yes:<input type = "radio" value = "true" name="takeAway"/>       
                           No :<input type = "radio" value = "true" name="takeAway"/>  
                 
             
                 
            <input type = "submit" value ="Get your speical dish" class = "btn btn-primary" /> 
           
        </pre>
        </form>
 </body>
 </html>
 
  

