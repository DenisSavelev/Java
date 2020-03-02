<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Intelligence</title>
    <style>
        TABLE {
            border-collapse: collapse;
        }
        TD, TH {
            padding: 3px;
            border: 1px solid white;
            font-size: 1.5em;
            color: white;
            margin-left: 35%;
        }
        H1 {
            font-size: 3em;
            color: white;
        }
    </style>
</head>
<body background="https://99px.ru/sstorage/86/2017/07/image_862907170556056830109.gif">
<h1>Intelligence</h1>
<table>
    <tr>
        <td>Id</td>
        <td>${modelDicitionary.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${modelDicitionary.russian}</td>
    </tr>
    <tr>
        <td>Value</td>
        <td>${modelDicitionary.english}</td>
    </tr>
</table>
<form name = "modelDicitionary" action="/users">
    <input type="submit" value="Go back">
</form>
</body>
</html>