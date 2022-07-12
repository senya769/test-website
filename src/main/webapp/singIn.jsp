<html>
<head>
    <title>sing in</title>
    <jsp:include page="footer.jsp"/>
</head>
<body>
<br>
<h6>${isValid}</h6>
<form action="connect" method="POST">
    <div class="container-fluid">
        <div class="row justify-content-md-center">
            <div class="col-3">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="floatingInput" placeholder="login" name="login"  required>
                    <label for="floatingInput">Login</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="password" class="form-control" id="floatingPassword" placeholder="Password"
                           name="password" required>
                    <label for="floatingPassword">Password</label>
                </div>
    <button type="submit" class="btn btn-primary">sing in</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
