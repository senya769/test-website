<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <jsp:include page="footer.jsp"/>

</head>
<body>
<br>
<form action="registration" method="POST">
    <div class="row justify-content-md-center">
        <div class="col-3">
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="name">
                <label>First name</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="surName">
                <label>Last name</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="age">
                <label>Age</label>
            </div>
            <div class="form-floating mb-3">
                <input type="text" class="form-control" name="login">
                <label>Login</label>
            </div>
            <div class="form-floating mb-3">
                <input type="password" class="form-control" name="password">
                <label > Password</label>
            </div>
            <br>
            <button type="submit" class="btn btn-primary" >Next</button>
        </div>
    </div>
</form>
</body>