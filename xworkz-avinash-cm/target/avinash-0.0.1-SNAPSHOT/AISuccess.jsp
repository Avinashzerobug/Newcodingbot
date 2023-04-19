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
   
   <form method="post" action="${pageContext.request.contextPath}/user/upload" enctype="multipart/form-data">
    <input type="hidden" name="userId" value="${user.userId}" />
    <div class="form-group">
        <label for="file">Select Profile Picture:</label>
        <input type="file" name="file" id="file" accept="image/*" class="form-control-file" required>
    </div>
    <button type="submit" class="btn btn-primary">Upload</button>
</form>

</body>
</html>