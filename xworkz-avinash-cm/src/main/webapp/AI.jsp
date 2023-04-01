<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AI WORLD</title>
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

</head>
<style>
<
body {
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}

.register {
	background-color: --bs-primary-bg-subtle;
}

.bg-img {
	background-image:
		url("https://community.nasdaq.com/uploadedimages/author/bbrooks/technology01-adobe.jpg");
}
</style>


<body>

	<div class="bg-img">
		<nav class="navbar bg-body-tertiary" class="navbar bg-dark"
			data-bs-theme="dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"> <img
					src="https://cdn1.vectorstock.com/i/1000x1000/52/95/logo-with-abstract-image-of-cosmic-station-space-vector-19205295.jpg"
					alt="Logo" width="48" height="36"
					class="d-inline-block align-text-top"> Artificial
					Intielligence
				</a>

				<div class="btn-group">
					. <a href="SpaceSearch.jsp" class="btn btn-primary">Verification
						ID</a> <a href="index.jsp" class="btn btn-primary">HOME</a>

				</div>
			</div>
		</nav>
	</div>


	<span class="placeholder col-12 bg-light">
		<h1 color>WELCOME TO THE INTERNAIONAL SPACE STATION</h1>

	</span>




	<form action="ai" method="post">

		<pre>
  
    <c:forEach items="${errors}" var="e">
    <span style="color: red;">${e.message}</span>
    </c:forEach> 
  
   

 UserId           <input type="text" id="userid" name="userId"
				class="ai" class="form-control" placeholder="Enter your userId"
				required="required" onchange="validUser()">
				<span id="userIdError" style="color: red;"></span>
						<span id="displayUserId" style="color: red;"></span>
					<span style="color: red">${userId}</span>	
			
 email            <input type="text" placeholder="Enter your email"
				id="email" onchange="validEmail()" name="email" required="required">
                 	<span id="userEmailError" style="color: red;"></span>
                 	<span id="display" style="color: red;"></span>
                 	<span style="color: red">${email}</span>
                 	
 Number           <input type="number" placeholder="Enter your num"
				id=num onchange="validNumber()" name="num" required="required">
				<span id="userNumberError" style="color: red;"></span>
				<span id="displayUserMobile" style="color: red;"></span>
				<span style="color: red">${num}</span>
   <div class="pass">
 password         <input id="password" type="password" name="password"
					placeholder="Enter Password" required="required">
						
                                     
 Confirm Password <input id="confirm_pass" type="password"
					name="confirmPassword" placeholder="Confirm Password"
					required="required" onkeyup="validate_password()">
			</div>
 <span id="UserId Error" style="color: red;"></span>
<input type="checkbox" id="agreementId" onclick="onAgreement()"
				onclick="wrong_pass_alert()" onChange ={(state) this.setState({isChecked:!state.isChecked})} />Accept Agreement
                  </br>
    <span id="wrong_pass_alert"></span>
  <input type="submit" id="submitId" disabled="true" />
</pre>



	</form>

	<script>
			function validate_password() {

				var password = document.getElementById('password').value;
				var confirm_pass = document.getElementById('confirm_pass').value;
				if (password != confirm_pass) {
					document.getElementById('wrong_pass_alert').style.color = 'red';
					document.getElementById('wrong_pass_alert').innerHTML = '☒ Use same password';
					document.getElementById('password').disabled = true;
					document.getElementById('password').style.opacity = (0.4);
				} else {
					document.getElementById('wrong_pass_alert').style.color = 'green';
					document.getElementById('wrong_pass_alert').innerHTML = '🗹 Password Matched';
					document.getElementById('password').disabled = false;
					document.getElementById('password').style.opacity = (1);
				}
			}

			function wrong_pass_alert() {
				if (document.getElementById('password').value != ""
						&& document.getElementById('confirmPassword').value != "") {
					alert("Your response is submitted");
				} else {
					alert("Please fill all the fields");
				}
			}
	



			/*    

	function onUserId() {

		console.log('running the onUserID');
		var userInput = document.getElementById('userid');
		var userValue = nameInput.value;
		console.log(userValue);
		if (userValue != null && userValue != "" && userValue.length > 3
				&& userValue.length < 30) {

			console.log('valid user id');
			var agreement = document.getElementById("agree_document")
			if (agreement.checked) {
				{
					document.getElementById('submitId').disable = false;
				}
				document.getElementById('UserId Error').innerHTML = '';
			} else {
				console.log('invalid user id')
				document.getElementLById('submitId').disabled = 'disabled';
				document.getElementById('UserId Error').innerHTML = 'Invalid Name, please enter min 3 to max 20 characters';
			}

		}

	}   */




		
			function onAgreement() {
				var agreement = document.getElementById('agreementId');
				console.log(agreement.checked)
				if (agreement.checked) {
					document.getElementById('submitId').disabled = false;
				} else {
					document.getElementById('submitId').disabled = 'disabled';
				}

			}
		
          function validUser()
          {
        	  var user = document.getElementById('userid');
        	  var uservalue = user.value;
        	  console.log(uservalue);
        	  if(uservalue != null && uservalue != "" && uservalue.length>3 && uservalue.length<20)
        		  {
        		    console.log('valid name');
        		    var agree = document.getElementById('agreementId');
        		    console.log(agree.checked);
        		    
        		    if(agree.checked)
        		    	{
        		    	 document.getElementById('submitId').disabled = false;
        		    	}
        		    document.getElementById('userIdError').innerHTML = '';
        		  }
        	  else
        		  {
        		    console.log('invalid userId');
        		    document.getElementById('submitId').disabled = 'disabled';
        		    document.getElementById('userIdError').innerHTML = 'Please enter the valid userID min 3 and max 30';
        		  }
        	  const xhttp = new XMLHttpRequest();
  			console.log('Running in ajax');
  			console.log(uservalue);
  			xhttp.open("GET", "http://localhost:8080/avinash/userId/"+ uservalue);
  			xhttp.send();
  			xhttp.onload = function() {
  				console.log(this);
  				document.getElementById("displayUserId").innerHTML = this.responseText
  			}
        	  
          }
          
          function validEmail()
          {
        	  var user = document.getElementById('email');
        	  var uservalue = user.value;
        	  console.log(uservalue);
        	  if(uservalue != null && uservalue != "" && uservalue.length>3 && uservalue.length<50)
        		  {
        		    console.log('valid email');
        		  
        		    document.getElementById('userEmailError').innerHTML = '';
        		  }
        	  else
        		  {
        		    console.log('invalid userId');
        		    document.getElementById('submitId').disabled = 'disabled';
        		    document.getElementById('userEmailError').innerHTML = 'Please enter the valid email min 3 and max 50';
        		  }
        	  const xhttp = new XMLHttpRequest();
  			console.log('Running in ajax');
  			console.log(uservalue);
  			xhttp.open("GET", "http://localhost:8080/avinash/email/"+ uservalue);
  			xhttp.send();
  			xhttp.onload = function() {
  				console.log(this);
  				document.getElementById("display").innerHTML = this.responseText
             }  
          }
          
          function validNumber()
          {
        	  var user = document.getElementById('num');
        	  var uservalue = user.value;
        	  console.log(uservalue);
        	  if(uservalue != null && uservalue != "" && uservalue.length==10)
        		  {
        		    console.log('valid phone number');
        		   
        		    document.getElementById('userNumberError').innerHTML = '';
        		  }
        	  else
        		  {
        		    console.log('invalid userId');
        		    document.getElementById('submitId').disabled = 'disabled';
        		    document.getElementById('userNumberError').innerHTML = 'Please enter the valid phone number';
        		  }
        	  const xhttp = new XMLHttpRequest();
  			console.log('Running in ajax');
  			console.log(uservalue);
  			xhttp.open("GET", "http://localhost:8080/avinash/num/"+ uservalue);
  			xhttp.send();
  			xhttp.onload = function() {
  				console.log(this);
  				document.getElementById("displayUserMobile").innerHTML = this.responseText
  			}
          }
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          </script>
	<!--const xhttp = new XMLHttpRequest();
        	    console.log('Running in ajx');
        	    console.log(uservalue);
        	    xhttp.open("GET", "http://loacalhost:8080/avinash/"+uservalue);
        	    xhttp.send();
        	    xhttp.onload = function() {
        	    	console.log(this);
        	    	document.getElementById("displayUserName").innerHTML = this.responeseText     -->




</body>
</html>