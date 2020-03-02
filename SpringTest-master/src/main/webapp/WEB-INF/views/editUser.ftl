<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Change</title>
    <style>
        .color-text {
            color: white;
            margin-left: 35%;
        }
    </style>
</head>
<body background="https://99px.ru/sstorage/86/2017/07/image_862907170556056830109.gif">
<div class="color-text">
<form name="modelDicitionary" action="/updateUser" method="post">
    <p>Id</p>
    <input title="Name" type="text" name="id" value="${modelDicitionary.id}">
    <p>Name</p>
    <input title="Name" type="text" name="russian" value="${modelDicitionary.russian}">
    <p>Value</p>
    <input title="Value" type="text" name="english" value="${modelDicitionary.english}">
    <input type="submit" value="OK">
</form>
</div>
</body>
</html>