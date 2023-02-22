<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h1>Welcome to the Aero India Registration</h1>

  <form action="aero" method = "post">
   
  <pre>

	<c:forEach items="${errors}" var="e">
	<span style="color: red;">${e.message }</span>

	</c:forEach>
	Name           <input type="text" name="name" value="${dto.name}"> 
	Company Name   <input type="text" name="company" value="${dto.company}"> 
	Cost           <input type="text" name="cost" value="${dto.cost}"> 
	Select Type    <select class="form-select"
	aria-label="Default select example" name="type" >
	<option selected value="">Select type</option>
	<c:forEach items="${types}" var="t">
	<option value="${t}">${t}</option>
	</c:forEach>
	</select>
        Select Country<select class="form-select"
	aria-label="Default select example" name="country">
	<option selected value="">   Select country</option>
	<c:forEach items="${countrys}" var="c">
	<option value="${c}">${c}</option>
	</c:forEach>
	</select>
	
   <input type="submit" value="Click To Save">

</pre>
  </form>
 
 <p style = "background-image" url('Airplane-Desktop-Wallpaper-Free.jpeg');"></p>

</body>
</html>