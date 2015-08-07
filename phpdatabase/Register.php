<?php
  $con*mysql_connect("localhost", "my_user","my_email", "my_password", "my_db");
  
  $name = $_POST["name"];
  $email = $_POST["email"];
  $username = $_POST["username"];
  $password = $_POST["password"];
  
  $statement = mysqli_prepare($con, "INSERT INTO User(name, email, username, password)VALUES (?,?,?,?)");
  mysqli_stmt_bind_param($statement, "ssss", $name, $email, $username, $password);
  mysqli_stmt_execute($statement);
  
  mysqli_stmt_close($statement);
  
  mysqli_close($con);
  ?>