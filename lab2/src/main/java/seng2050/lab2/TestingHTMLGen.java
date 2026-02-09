package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TestingHTMLGen extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println(HTMLGen.doctype());
        out.println(HTMLGen.head("TestingHTMLGen"));
        out.println(HTMLGen.style("* {text-align: center;}"));
        out.println(HTMLGen.h1("Testing Heading 1"));
        out.println(HTMLGen.h2("Testing Heading 2"));
        out.println(HTMLGen.h3("Testing Heading 3"));
        out.println(HTMLGen.script("alert('Testing script')"));
    }
}