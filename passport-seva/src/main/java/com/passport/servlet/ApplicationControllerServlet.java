package com.passport.servlet;

import com.passport.model.Application;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/applicationcontroller")
public class ApplicationControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Application> listOfApp = getAvailableApplications();
        req.setAttribute("applicantsList", listOfApp );

        RequestDispatcher rd = req.getRequestDispatcher("applications.jsp");
        rd.forward(req, resp);
    }

    private List<Application> getAvailableApplications() {
        List<Application> listOfApplications = new ArrayList<>();

        try {
            //step1: load driver class
            Class.forName("com.mysql.jdbc.Driver");

            //step2: establish a connection by providing connection url, username and password.
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passportseva", "root", "root");


            //step3: create a statement object on connection obj
            Statement stmt = con.createStatement();

            //step4: pass a query to the executeQuery method of statement object
            // the query result will be returned as a ResultSet object
            ResultSet rs = stmt.executeQuery("select * from passport_applications");

            //step5: read the result through resultset object
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getDate(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getDate(6));


                Application application = new Application(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6));
                listOfApplications.add(application);
            }

            //step6: close the connection obj
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found : " + e);
        } catch (SQLException e) {
            System.out.println("SQL Exception : " + e);
        }
        return listOfApplications;
    }
}
