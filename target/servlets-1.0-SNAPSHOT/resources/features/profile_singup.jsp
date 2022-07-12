<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 20.06.2022
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account</title>
    <link rel="stylesheet" href="../css/style.css" type="text/css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="panel">
    <li><a href="../../index.jsp"><i class="fa fa-home"></i> Home</a></li>
    <li class="reg"><a href="http://localhost:9090/servlets_war_exploded"><i class="fa fa-window-close-o"></i> Exit</a></li>

</div>
<h1>Successful

    <br>
    Welcome, your account!
</h1>
<h2>
    Name: <%= request.getParameter("name") != null ?request.getParameter("name"):""%> ${name}
    <br>
    SurName: <%= request.getParameter("surName") != null ?request.getParameter("surName"):""%>${surName}
    <br>
    Login: <%= request.getParameter("login")%>
    <br>
    Age: <%= request.getParameter("age") != null ?request.getParameter("age"):""%>${age}
</h2>
</body>
</html>
