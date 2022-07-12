<html>
<head>
    <title> <%= session.getAttribute("status") %></title>
    <jsp:include page="testFoot.jsp"/>
    <link rel="stylesheet" href="resources/css/test.css" type="text/css">
</head>
<body>
<div class="container mt-5">
    <div class="row d-flex justify-content-center">
        <div class="col-md-7">
            <div class="card p-3 py-4">
                <div class="text-center">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/9/99/Sample_User_Icon.png" width="100"
                         class="rounded-circle">
                </div>
                <div class="text-center mt-3">
                    <span class="bg-secondary p-1 px-4 rounded text-white">
                    <%= request.getAttribute("status") %>
                    </span>
                    <h5 class="mt-2 mb-0"><%= request.getAttribute("name")%>
                        <br>
                        <%= request.getAttribute("surName")%>
                    </h5>
                    <span>Age: <%= request.getAttribute("age")%></span>
                    <ul class="social-list">
                        <li><i class="fa fa-facebook"></i></li>
                        <li><i class="fa fa-instagram"></i></li>
                        <li><i class="fa fa-linkedin"></i></li>
                    </ul>
                    <div class="buttons">
                        <button class="btn btn-outline-primary px-4">Message</button>
                        <button class="btn btn-primary px-4 ms-3">Contact</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
