<%--
  Created by IntelliJ IDEA.
  User: tfska
  Date: 3/30/2023
  Time: 7:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tài khoản cá nhân</title>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="acc">
    <div class="form-box">
        <div class="button-box">
            <div id="btn"></div>
            <button type="button" class="toggle-btn" onclick="login()">Log In</button>
            <button type="button" class="toggle-btn" onclick="register()">Register</button>
        </div>
        <form id="login" action="" class="input-group">
            <input type="text" class="input-field" name="" placeholder="User Id" required>
            <input type="password" class="input-field" name="" placeholder="Enter password" required>
            <input type="checkbox" class="check-box"><span>Remember Password</span>
            <button type="submit" class="submit-btn">Log in</button>
        </form>
        <form id="register" action="" class="input-group">
            <input type="text" class="input-field" name="" placeholder="User Id" required>
            <input type="password" class="input-field" name="" placeholder="Enter password" required>
            <input type="email" class="input-field" name="" placeholder="Enter email" required>
            <input type="tel" class="input-field" name="" placeholder="Enter phone" required>
            <input type="checkbox" class="check-box"><span>I agree to the terms & conditions</span>
            <button type="submit" class="submit-btn">Register</button>
        </form>
    </div>
</div>
<script>
    var x = document.getElementById("login");
    var y = document.getElementById("register");
    var z = document.getElementById("btn");

    function register() {
        x.style.left = "-400px";
        y.style.left = "50px";
        z.style.left = "110px";
    }
    function login() {
        x.style.left = "50px";
        y.style.left = "450px";
        z.style.left = "0";
    }
</script>
</body>
</html>
