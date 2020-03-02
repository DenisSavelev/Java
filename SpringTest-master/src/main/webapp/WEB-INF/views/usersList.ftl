<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dictionary</title>
    <style type="text/css">
        H1 {
            font-size: 3em;
        }
        TABLE {
            border-collapse: collapse;
        }
        TD, TH {
            padding: 3px;
            border: 1px solid white;
            font-size: 1.5em;
        }
        .color-text {
            color: white;
            margin-left: 35%;
         }
        a {
            color: white !important;
            text-decoration: none;
        }

        body {
            margin:0px;
            padding:0px;
            font: 14px 'Verdana';
        }
        ul {
            list-style: none;
            display: block;
            margin:0px;
            padding:0px;
        }
        ul:after {
            display: block;
            float: none;
            content: ' ';
            clear: both;
        }
        ul.mmenuu > li {
            float: left;
            position: relative;
        }
        ul.mmenuu > li > a {
            display: block;
            color: #fff;
            padding: 10px;
            text-decoration: none;
            background-color: #da570f;
        }
        ul.mmenuu > li > a:hover {
            background-color: #eb9316;
        }
        ul.ssubmenuu {
            position: absolute;
            width: 240px;
            top: 37px;
            left:0px;
            display: none;
            background-color: white;
        }
        ul.ssubmenuu > li {
            display: block;
        }
        ul.ssubmenuu > li > a {
            display: block;
            text-decoration: none;
            padding: 10px;
            color: #ffffff;
            background-color: #da570f;
        }
        ul.ssubmenuu > li > a:hover {
            background-color: #eb9316;
            text-decoration: underline;
        }
        ul.mmenuu > li:hover > ul.ssubmenuu {
            display: block;
        }
    </style>
</head>
<body background="https://99px.ru/sstorage/86/2017/07/image_862907170556056830109.gif">
<div class="color-text">
<h1>Dictionary</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Rus</th>
        <th>En</th>
        <th></th>
        <th></th>
    </tr>
   <#list users as modelDicitionary>
       <tr>
           <td>${modelDicitionary.id}</td>
           <td>${modelDicitionary.russian}</td>
           <td>${modelDicitionary.english}</td>
           <td><a href="/delete/${modelDicitionary.id}">Delete word</a></td>
           <td><a href="/update/${modelDicitionary.id}">Update</a> </td>
       </tr>
   </#list>
</table>
<p><b>Search word</b><br>
<form name = "modelDicitionary" action="/userW" method="post">
    <input type="text" size="40" name="russian">
    <input type="submit" value="Search">
</form>
</p>
    <ul class="mmenuu">
        <li><a href=#>Select</a>
            <ul class="ssubmenuu">
                <li><a href="/addUser">Add Word</a></li>
                <li><a href=#>Update</a></li>
                <li><a href=#>Delete Word</a></li>
                <li><a href=#>Search</a></li>
            </ul>
        </li>
    </ul>
</div>
</body>
</html>
