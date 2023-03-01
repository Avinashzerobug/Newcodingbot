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

  <h1>WELCOME TO THE INTERNAIONAL SPACE STATION</h1>
  
  <form action = "space" method = "post">
  
  <pre>
  
    <c:forEach items = "${errors}" var = "e">
    <span style = "color:red;">${e.message}</span>
    </c:forEach>
  
    Name           <input type="text" name="name"> 
	Countries   <input type="text" name="countries"> 
	Cost           <input type="number" name="cost"> 
	Number of station      <input type="text" name="noOfStation" >
	Astranaut names    <select class="form-select"
    aria-label="Default select example" name="astranuatNames" >
	<option selected value="">Select type</option>
	<c:forEach items="${astranuatName}" var="t">
	<option value="${t}">${t}</option>
	</c:forEach>
	</select>
    <input type="submit" value="Click To Save">

</pre>
  </form>
  
</body>
</html>