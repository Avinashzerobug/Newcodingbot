<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="javax.servlet.*"%>
<%@ page import="javax.servlet.http.*"%>
<%@ page import="javax.servlet.jsp.*"%>
   <%@ page import="javax.servlet.jsp.PageContext" %>
   
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h1>Registration successfull</h1>
 
  
 <form action="uploadPhoto" method="post" enctype="multipart/form-data">
    <label for="file">Select a photo to upload:</label>
    <input type="file" id="file" name="file"><br>
    <label for="signUpId">Enter the signUpId:</label>
    <input type="text" id="signUpId" name="signUpId"><br>
    <input type="submit" value="Upload">
</form>



</body>
</html>