<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Fix couple word</h1>
<form name="user" action="/addUser" method="post">
    <p>Id</p>
    <input title="Name" type="text" name="id" value="${user.id}" disabled>
    <p>Name</p>
    <input title="Name" type="text" name="russian" value="${user.russian}">
    <p>Value</p>
    <input title="Value" type="text" name="english" value="${user.english}">
    <input type="submit" value="OK">
</form>
</body>
</html>