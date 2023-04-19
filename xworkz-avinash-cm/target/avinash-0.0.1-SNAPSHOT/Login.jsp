<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.min.js"
	integrity="sha384-mQ93GR66B00ZXjt0YO5KlohRA5SY2XofN4zfuZxLkoj1gXtW8ANNCe9d5Y3eG5eD"
	crossorigin="anonymous"></script>
<link rel="icon" type="image/x-icon"
	href="https://icons8.com/icon/80833/laptop">

</head>

<body>
	</li>
	   <form id="loginForm" modelAttribute="login" action="searchByUserIdAndPassWord" method="get">
	   
	         <div th:if="${param.change}" class = "alert alert-success">
	         
	         <p th:text = "${param.change}"></p>
	         
	         </div>
	   
	       <pre>
                             <label path="userId">UserId: ${userID} </label>
                           
                            <input path="userId" name="userId" id="userId" /></br>
                       
                             <label path="password">Password: ${password}</label>
                       
                            <input path="password" name="password" id="password" />
                       
                            <button id="login" name="login">Login</button>
                            
                            <a href = "forgot_email_form.jsp">Forgot Password?</a>
             </pre>   
                      
            </form>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
                

</body>

</html>