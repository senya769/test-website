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
    <jsp:include page="footer.jsp"/>
</head>
<body>
<div class="panel">
    <li class="reg"><a href="http://localhost:9090/servlets_war_exploded"><i class="fa fa-window-close-o"></i> Exit</a>
    </li>
</div>
<h1>Successful
    <br>
    Welcome, your account!
</h1>
<h2 class="info">
    Name: <%= request.getParameter("name") != null ? request.getParameter("name") : ""%> ${name}
    <br>
    SurName: <%= request.getParameter("surName") != null ? request.getParameter("surName") : ""%>${surName}
    <br>
    Login: <%= request.getParameter("login")%>
    <br>
    Age: <%= request.getParameter("age") != null ? request.getParameter("age") : ""%>${age}
</h2>
</body>
</html>
