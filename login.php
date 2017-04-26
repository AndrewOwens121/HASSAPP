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
    //$username = $_POST["username"];
    //$password = $_POST["password"];
    
    $statement = mysqli_prepare($con, "SELECT * FROM user WHERE username = ? AND password = ?");
    mysqli_stmt_bind_param($statement, "ss", $username, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $userID, $businessname,$email, $username, $password);
    
    $response = array();
    $response["success"] = false;  
    
    while(mysqli_stmt_fetch($statement)){
        $response["success"] = true;  
        //$response["businessname"] = $businessname;
        //$response["email"] = $email;
        //$response["username"] = $username;
        //$response["password"] = $password;
    }
    
    echo json_encode($response);
?>