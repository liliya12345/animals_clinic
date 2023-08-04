<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Registration Page </title>
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
 input[type=email], input[type=password],input[type=text]{
        width: 50%;
        margin: 20px 0;
        padding: 12px 20px;
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
<h1> Registration Form </h1>
<form action="/registration" method="post" modelAttribute="user">
    <div class="container">
        <label>Name : </label>
        <br>
        <input type="text" placeholder="Enter Name" name="name" >
        <br>
        <label>Email : </label>
        <br>
        <input type="email" placeholder="Enter Email" name="email" >
        <br>
        <br>
        <label>Password : </label>
        <br>
        <input type="password" placeholder="Enter Password" name="password"  >
        <br>
        <label>Address : </label>
        <br>
        <input type="text" placeholder="Enter Address" name="address" >
        <br><label>Phone : </label>
        <br>
        <input type="text" placeholder="Enter Phone" name="phone">
        <br>
        <button type="submit">Create</button>
    </div>
</form>
</body>
</html>