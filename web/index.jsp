<%--
  Created by IntelliJ IDEA.
  User: 48609
  Date: 19.04.2020
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form method="get" action="/calculate">
  <input type="number" name="number1">
  <input type="number" name="number2">
  <select name="operation">
    <option value="ADD">Dodawanie</option>
    <option value="SUBTRACT">Odejmowanie</option>
    <option value="MULTIPLY">Mnożenie</option>
    <option value="DIVIDE">Dzielenie</option>
  </select>
  <input type="submit" value="OK">
</form>
</body>
</html>
