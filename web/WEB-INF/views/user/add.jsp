<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiayo
  Date: 2018/5/18/018
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>用户管理</title>
</head>
<body>
<h2>
    添加用户
</h2>
<form method="post" action="add">
    <fieldset>
        <legend>用户信息</legend>
        <p>
            <label>姓名：</label>
            <input name="name" id="name" type="text" required="required" maxlength="50"></input>
        </p>
        <p>
            <label>地址：</label>
            <input name="address" id="address" type="text" required="required" maxlength="128"></input>
        </p>
        <p>
            <label>电话：</label>
            <input name="phone" id="phone" type="text" required="required" maxlength="11"></input>
        </p>

        <p>
            <button>提交</button>

        </p>

    </fieldset>
</form>
<a href="user">返回</a>
</body>
</html>
