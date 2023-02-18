<html>
<body>
<%
out.print(" welcome " + request.getParameter("ur-name"));
session.setAttribute("user",request.getParameter("ur-name"));

%>
<a href="second.jsp">second jsp page</a>
</body>
</html>