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

Name of animal <p>${animal.name}</p>
Age <p>${animal.age}</p>
Owner of animal<p>${animal.owner.name}</p>
<#list images as image>
<image scr="/image/${image.id}" height="150" width="150"></image>
</#list>
</body>