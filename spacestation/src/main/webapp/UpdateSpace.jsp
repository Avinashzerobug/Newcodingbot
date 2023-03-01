<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action = "spaceup" method = "post">
  
  <pre>
  
    <c:forEach items = "${errors}" var = "e">
    <span style = "color:red;">${e.message}</span>
    </c:forEach>
  
    ID           <input type="text" name="id" value = "${dto.id}">
    Name           <input type="text" name="name" value = "${dto.name}"> 
	Countries   <input type="text" name="countries" value = "${dto.countries}"> 
	Cost           <input type="number" name="cost" value = "${dto.cost}"> 
	Number of station      <input type="text" name="noOfStation" value = "${dto.noOfStation}">
	Astranaut names    <select class="form-select"
    aria-label="Default select example" name="astranuatNames"  value = "${dto.astranuatNames}" >
	<option selected value="${dto.astranuatNames}">Select type</option>
	
	<c:forEach items="${astranuatName}" var="t">
	<option value="${t}">${t}</option>
	</c:forEach>
	</select>
    <input type="submit" value="Update" class = "btn btn-primary" />

</pre>
  </form>



</body>
</html>