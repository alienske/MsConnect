<?php
  $con*mysql_connect("localhost", "my_user","my_email", "my_password", "my_db");
  
  $username = $_POST["username"];
  $password = $_POST["password"];
  
  $statement = mysqli_prepare($con,"SELECT * FROM User WHERE username = ?, password = ?");
  
  mysqli_stmt_bind_param($statement, "ss" $username, $password);
  mysqli_stmt_execute($statement);
  mysqli_stmt_store_result($statement);
  mysqli_stmt_bind_result($statement, $UserId, $Name, $Email, $Username, $Password);
  $User = array();
  
  while(mysqli_stmt_fetch($statement)){
	  $User[Name]= $Name;
	  $User[Email]= $Email;
	  $User[Username]= $Username;
	  $User[Password]= $Password;
  }
  echo json_encode($User);
  mysqli_stmt_close($statement);
  
  
   mysqli_close($con);
  ?>