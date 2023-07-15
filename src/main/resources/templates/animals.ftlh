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

<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Owner</th>
        <th>Действия</th>
    </tr>
    </thead>
    <tbody>
    <#list animals as animal>
    <tr>
        <td>${animal.name}</td>
        <td>${animal.age}</td>
        <td>${animal.owner.name}</td>
        <td><a href="/animal/${animal.id}">Подробно</a></td>

    </tr>
    </#list>
    </tbody>
</table>
<h2>Add a new animal</h2>
<form action="/animals/create" method="post" enctype="multipart/form-data">
    <label>Name</label>
    <input type="text" name="name">
    <label>Age</label>
    <input type="number" name="age">
    <label>Owner</label>
    <select name="ownerId">
        <#list owners as owner>
        <option value="${owner.id}">${owner.name}</option>
    </#list>
    </select>
    <label>Image</label>
    <input type="file" name="image">
    <input type="submit" value="Add">
</form>
</body>