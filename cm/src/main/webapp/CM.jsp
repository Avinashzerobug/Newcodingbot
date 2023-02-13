<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <h1>Welcome to the CM information</h1>

  <form action="cm" method = "post">
   
   <pre>
     
     CM name <input type = "text" name = "name" />
     Party<Select name = "party">
     <option>select</option>
     <option>BJP</option>
     <option>Congress</option>
     <option>JDS</option>
     <option>AAP</option>
     <option>KJP</option>
     </Select>
   
     State <select name = "state">
     <option>KR</option>
     <option>UP</option>
     <option>TS</option>
     <option>AP</option>
     </select>
   
     Tenure <select name="tenure">
     <option>select</option>
     <option>1</option>
     <option>2</option>
     <option>3</option>
     <option>4</option>
     <option>5</option>
     </select>
   
    PortFolio <textarea rows = "3" cols = "50" name = "portFolio"></textarea>
    <input type = "submit" value = "save" class ="btn btn-primary">
  
   </pre>
  </form>


</body>
</html>