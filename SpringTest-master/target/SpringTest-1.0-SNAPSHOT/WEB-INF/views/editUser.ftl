<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="user" action="/updateUser" method="post">
    <p>Id</p>
    <input title="Name" type="text" name="id" value="${user.id}">
    <p>Name</p>
    <input title="Name" type="text" name="russian" value="${user.russian}">
    <p>Value</p>
    <input title="Value" type="text" name="english" value="${user.english}">
    <input type="submit" value="OK">
</form>
</body>
</html>