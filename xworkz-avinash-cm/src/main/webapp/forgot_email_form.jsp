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

              <div class = "container">
               <div id = "Login-row" class = "row justify-content-center align-items-center">
                <div id = "Login-column" class = "col-md-6">
                <div id = "Login-box" class = "col-md-12" style = "height:250px;">
                
                
                <div th:if = "${session.message}" class = "container">
                <div class = "alert alert-danger my-2 text-center" role = "alert">
                
                <span th:text = "${session.message}"></span>
               
                </div>
                
                
                  <th:block th:text = "${session.removeAttribute('message')}"></th:block>
                
                </div>                
                
                
                
                
                
                
                <h3 class = "text-center">Your Registered Email</h3>
                
                <form action = "forgot" th:action = "@{/send-otp}" method = "post">
                
                <input name = "email" type = "email" placeholder = "Enter your email here" class = "form-control" />
                
                 
                 <div class = "container text-center">
                  
                  <button class = "btn btn-warning">Send OTP</button>
                  
                 </div>
                
                
                </form>
                
                
                </div>
                
                </div>
               
               </div>
              </div>


</body>
</html>