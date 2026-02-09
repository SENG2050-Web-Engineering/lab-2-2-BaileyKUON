package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse resp)
            throws ServletException, IOException {

        String firstName = "";
        firstName = request.getParameter("firstName");
        String lastName = "";
        lastName = request.getParameter("lastName");

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang>");
        out.println("<head> <title> Greeting Servlet </title> </head>");
        out.println("<body>");
        out.println("<h1>Greeting Servlet</h1>");
        if (lastName.matches(".*\\d.*") || lastName == "" || firstName.matches(".*\\d.*") || firstName == "") {
            out.println("<h2> Your first name and/or last name cannot be null or contain numbers e.g. (0-9)</h2>");
        } else {
            out.println("<h2>Welcome " + firstName + " " + lastName
                    + " to the greeting servlet where your name will be displayed with a welcome message.</h2>");
        }
        out.println("</body>");
        out.println("</html>");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse resp)
            throws ServletException, IOException {

        String firstName = "";
        firstName = request.getParameter("firstName");
        String lastName = "";
        lastName = request.getParameter("lastName");

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang>");
        out.println("<head> <title> Greeting Servlet </title> </head>");
        out.println("<body>");
        out.println("<h1>Greeting Servlet</h1>");
        if (lastName.matches(".*\\d.*") || lastName == "" || firstName.matches(".*\\d.*") || firstName == "") {
            out.println("<h2> Your first name and/or last name cannot be null or contain numbers e.g. (0-9)</h2>");
        } else {
            out.println("<h2>Welcome " + firstName + " " + lastName
                    + " to the greeting servlet where your name will be displayed with a welcome message.</h2>");
        }
        out.println("</body>");
        out.println("</html>");

    }
}