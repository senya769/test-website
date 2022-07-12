<%@ page import="java.util.Objects" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>Sing IN</title>
    <jsp:include page="footer.jsp"/>
</head>
<body>
<br>
<form action="connect" method="POST">
    <div class="row justify-content-md-center">

        <h6>${isValid}</h6>
        <div class="col-3">
            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="floatingInput" placeholder="login" name="login" required>
                <label for="floatingInput">Login</label>
            </div>
            <div class="form-floating">
                <input type="password" class="form-control" id="floatingPassword" placeholder="Password"
                       name="password"  required>
                <label for="floatingPassword">Password</label>
                <br>
                <button type="submit" class="btn btn-primary" >Sing In</button>
                <br>
                <h7> New to Account? Create an account.</h7>
                <a class="btn btn-link" href="singUp.jsp" role="button"> Registration</a>
            </div>
        </div>
    </div>
</form>
</body>
