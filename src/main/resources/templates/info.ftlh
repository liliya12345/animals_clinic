<!DOCTYPE html>
<html>
<head>
    <title>Моя страница</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            font-size: 16px;
            line-height: 1.5;
        }
        css
        Copy code
        h1, h3 {
            margin-top: 30px;
            margin-bottom: 20px;
        }

        table {
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        th, td {
            padding: 10px;
            border: 1px solid black;
        }

        th {
            background-color: #f2f2f2;
        }

        form {
            margin-bottom: 20px;
        }

        input[type="text"], input[type="file"], input[type="submit"] {
            display: block;
            margin-bottom: 10px;
            font-size: 16px;
            padding: 5px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }

        a {
            color: #4CAF50;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }



    </style>
</head>
<body>
<h1>List of animals:</h1>

Name of animal <b>${animal.name}</b>
<br>
Age  <b>${animal.age}</b><br>
Owner of animal <b>${animal.owner.name}</b><br>
<#list images as image><img src="/image/${image.id}" height="250" width="200"></img>
</#list>
</body>
</html>