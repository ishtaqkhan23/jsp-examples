<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
    <head>
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/container.css">
        <link rel="stylesheet" href="css/footer.css">
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <div class="container">
            <h2>Welcome to passport seva kendra</h2>
            <a href="applypassport.jsp">Apply for passport</a>
            <a href="applicationcontroller">Check submitted applications</a>
        </div>
        <jsp:include page="footer.jsp" />
    </body>
</html>
