<?php
    $con = mysqli_connect("localhost", "root", "", "hassapp");
	 foreach ($_POST as $key => $value) {
        echo "<tr>";
        echo "<td>";
        echo $key;
        echo "</td>";
        echo "<td>";
        echo $value;
        echo "</td>";
        echo "</tr>";
    }
    
    $businessname = $_POST["businessname"];
	$email = $_POST["email"];
    $username = $_POST["username"];
    $password = $_POST["password"];

    $statement = mysqli_prepare($con, "INSERT INTO user (businessname,email, username, password) VALUES (?, ?, ?,?)");
    mysqli_stmt_bind_param($statement, "ssss", $businessname,$email, $username, $password);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>