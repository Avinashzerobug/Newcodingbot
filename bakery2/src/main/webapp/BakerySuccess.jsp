<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    
    <h3>Information Feeding Completed You can have your Laddu</h3>

   <a href = "index.jsp">Home</a>

    
    <h4> Bakery name: ${bakeryDTO.getBakeryName()}  </h4>
       <h4>   Bakery Owner Name: ${bakeryDTO.getBakeryOwnerName()}  </h4>
       <h4>    Bakery Owner Wife Name: ${bakeryDTO.getBakeryOwnerWifeName()}  </h4>
        <h4>   Bakery Owner married:  ${bakeryDTO.getBakeryOwnerMarried()} </h4>
        <h4>   Bakery Famous:  ${bakeryDTO.getBakeryFamous()}</h4>
        <h4>    Bakery Since: ${bakeryDTO.getBakeryFamous()} </h4>
           
           
           
</body>
</html>