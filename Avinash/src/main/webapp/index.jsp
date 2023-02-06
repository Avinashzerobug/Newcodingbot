<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
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


   
   <nav class="navbar navbar-expand-lg bg-body-tertiary"
		data-bs-theme="white">

		<div class="container-fluid">
			 <a class="navbar-brand" href="#">
      <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRc_JO5iEEGyU2VVT_OW89VQWLZiBYDdANiRA&usqp=CAU" alt="Bootstrap" width=65" height="30">
    </a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
				aria-controls="navbarNavDropdown" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavDropdown">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Features</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="#">Pricing</a>
					</li>

					<li class="nav-item"><a class="nav-link" href="FoodTypes.jsp">Food
							Types</a></li>

					<ul class="nav nav-tabs">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="#">Active</a></li>
						<li class="nav-item"><a class="nav-link" href="CasinoControl.jsp">CasinoControl</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
						<li class="nav-item"><a class="nav-link disabled">Disabled</a>
						</li>
					</ul>

					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" role="button"
						data-bs-toggle="dropdown" aria-expanded="false"> Dropdown link
					</a>

						<ul class="dropdown-menu">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>

      <h2>Welcome to the Avinash World</h2>
<form method = "get" action = "avi">
    <div>
     <h5>Display email : ${email}</h5>
      <input type ="submit" />
     </div>
</form>

<form method = "get" action = "avya">
 <div>
     <h5>Display number: ${mobile}</h5>
        <input type ="submit" />
        </div>

</form>

<form method = "get" action = "avinya">
 <div>
     <h5>Display Adhar number: ${AdharNumber}</h5>
        <input type ="submit" />
        </div>

</form>


<form method = "get" action = "shiv">
 <div>
     <h5>Display age: ${Age}</h5>
        <input type ="submit" />
        </div>

</form>


<form method = "get" action = "mahadev">
 <div>
     <h5>Display DOB: ${DOB}</h5>
        <input type ="submit" />
        </div>

</form>


<form method = "get" action = "shiva">
 <div>
     <h5>Display salary: ${salary}</h5>
        <input type ="submit" />
        </div>

</form>


<form method = "get" action = "fri">
 <div>
     <h5>Display friend</h5>
        <input type ="submit" value = "Show friends" />
        <ul>
        <c:forEach items = "${friend}" var="fri">
        <li>${fri}</li>
        </c:forEach>
        
        </ul>
        
        </div>

</form>


<form method = "get" action = "skill">
 <div>
     <h5>Display skill: ${skill}</h5>
        <input type ="submit" />
        </div>

</form>



<form method = "get" action = "place">
 <div>
     <h5>Display place:</h5>
        <input type ="submit" value = "show palces" />
        <ul>
          <c:forEach items = "${place }" var = "pla">
           <li>${place}</li>
           </c:forEach>
        
        </ul>
        </div>

</form>



<form  action = "DTO">

       <h5>Display Avinash DTO: ${aviDTO}</h5>
       <input type ="submit" value = "show avinash" /></br>
        <label>name: ${aviDTO.name}</label></br>
        <label>School name: ${aviDTO.schoolName}</label></br>
         <label>schoolMarks: ${aviDTO.schoolMarks}</label></br>
          <label>collegeName: ${aviDTO.collegeName}</label></br>
           <label>collegMarks: ${aviDTO.collegMarks}</label></br>
           <label>schoolLocation: ${aviDTO.schoolLocation}</label></br>
                <label>collegeLocation: ${aviDTO.collegeLocation}</label></br>
                       <label>favoriteTeacher: ${aviDTO.favoriteTeacher}</label></br>
             <label>ranker: ${aviDTO.ranker}</label></br>
               <label>noOfFailSubjec: ${aviDTO.noOfFailSubjec}</label> </br>
                 
       
</form>


<form action = "fam">
     <h5>Display Family DTO: ${fam} </h5>
     <input type = "submit" value = "show fam" /></br>
     <label>father name: ${fam.fatherName}</label></br>
     <label>mother name: ${fam.motherName}</label></br>
      <label>brother name: ${fam.brotherName}</label></br>
 <label>location: ${fam.location}</label></br>
 <label>noOfMembers: ${fam.noOfMembers}</label></br>
 <label>grandFatherName: ${fam.grandFatherName}</label></br>
 <label>grandMotherName: ${fam.grandMotherName}</label></br>
 <label>location2: ${fam.location2}</label></br>
 <label>cousin: ${fam.cousin}</label></br>
 <label>noOfCousin: ${fam.noOfCousin}</label></br>

</form>

<form action="mob">
  <h5>Dispplay Mobile DTO</h5>
 <input type = "submit" value = "show mob" /></br>
     <label>Sim: ${mob.simName}</label></br>
        <label>number: ${mob.number}</label></br>
   <label>company: ${mob.companyName}</label></br>
        <label>packages: ${mob.packages}</label></br>
    <label>number2: ${mob.number2}</label></br>



</form>

<form action = "bev">
   <h5>Display Beverage DTO</h5>
       <input type = "submit" value = "show beverage" /></br>
     <label>Brand: ${bev.brand}</label></br>
       <label>ownerName: ${bev.ownerName}</label></br>
       <label>types: ${bev.types}</label></br>
     <label>Drinks: ${bev.drinks}</label></br>
     <label>Famous Drink: ${bev.famousDrink}</label></br>
        <label>Total Drink: ${bev.totalDrinks}</label></br>
             <label>Company Name: ${bev.companyName}</label></br>
             <label>Net Worth: ${bev.netWorth}</label></br>
</form>

<form action = "chat">
   <h5>Display Chat mode is on</h5>
    <input type = "submit" value = "show chat features" /></br>
  <label>app name: ${chat.appName}</label></br>
 <label>Authentication: ${chat.autentication}</label></br>
 <label>Company: ${chat.company}</label></br>
 <label>country: ${chat.country}</label></br>
 <label>Features: ${chat.features}</label></br>
 <label>Logo: ${chat.logo}</label></br>
  <label>Net Worth: ${chat.netWorth}</label></br>
   <label>No Of user: ${chat.noOfUser}</label></br>
    <label>owner: ${chat.owner}</label></br>
    <label>Safety: ${chat.safety}</label></br>
    <label>Security: ${chat.security}</label></br>
   
</form>














</body>
</html>