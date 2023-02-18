
<!-- As we are going with MVC design, we moved the java logic to the controller
           So we are commenting the below import statement -->
<!--
    <%@ page import="java.util.*, java.sql.*, com.passport.model.Application" %>
-->


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/footer.css">
    </head>
    <body>
        <jsp:include page="header.jsp" />

      <!-- As we are going with MVC design, we moved the java logic to the controller
           So we are commenting the below scriptlet tag completely -->
      <!--
        <%
            List<Application> listOfApplications = new ArrayList<>();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passportseva", "root", "root");
                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from passport_applications ");


                 while (rs.next()) {
                    Application app = new Application(rs.getString(1),rs.getDate(2),
                                                            rs.getString(3), rs.getString(4),
                                                             rs.getString(5), rs.getDate(6));
                   listOfApplications.add(app);
                }

                con.close();
            } catch(Exception e) {
                out.println("Sorry there is some technical problem in application.");
            }

            request.setAttribute("applicantsList", listOfApplications);
        %>
      -->



        <table>
          <tr>
            <th>Name</th>
            <th>Applied Date</th>
            <th>Address</th>
            <th>Phone Number</th>
            <th>Email</th>
            <th>Date Of Birth</th>
          </tr>
        <c:forEach var="applicant" items="${applicantsList}" >
          <tr>
            <td>${applicant.name}</td>
            <td>${applicant.appliedDate}</td>
            <td>${applicant.address}</td>
            <td>${applicant.phoneNumber}</td>
            <td>${applicant.email}</td>
            <td>${applicant.dob}</td>
          </tr>
        </c:forEach>
        </table>
        <jsp:include page="footer.jsp" />
    </body>
</html>