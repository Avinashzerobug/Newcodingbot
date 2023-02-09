  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h2>Casino Entering is SuccessFull</h2>
   
      <a href = "index.jsp">home</a>
      <a href = "CasinoControl.jsp">casino</a>
   
   
      <h1>Casino Success----||||||</h1>
       <h4  >name: ${casinoDTO.getName()}  </h4>
        <h3 >price: ${casinoDTO.getEntryFee()} </h3>
   
   
   

</body>
</html>