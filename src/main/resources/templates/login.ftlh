<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Login Page </title>
    <style>
Body {
  font-family: Calibri, Helvetica, sans-serif;
  background-color: pink;
}
button {
       background-color: gray;
       width: 20%;
        color: white;
        padding: 15px;
        margin: 10px 0px;
        border: 1px;
        cursor: pointer;
         }
 form {
        border: none;
    }
 input[type=email], input[type=password] {
        width: 50%;
        margin: 20px 0;
        padding: 12px 20px;
        display: inline-block;
        border: 2px solid green;
        box-sizing: border-box;
    }
 button:hover {
        opacity: 0.7;
    }
  .cancelbtn {
        width: auto;
        padding: 10px 18px;
        margin: 10px 5px;
    }


 .container {
        padding: 25px;
        background-color: lightblue;
        width:60%;
        margin: 10px 0px;
    }
</style>
</head>
<body>
 <h1> Login Form </h1>
<form action="/login" method="post">
    <div class="container">
        <label>Email : </label>
        <br>
        <input type="email" placeholder="Enter Email" name="username" required>
        <br>
        <br>
        <label>Password : </label>
        <br>
        <input type="password" placeholder="Enter Password" name="password" required>
        <br>
        <button type="submit">Login</button>
    </div>
</form>
<a href="/registration"><h3>Create a new user</h3></a>
</body>
</html>