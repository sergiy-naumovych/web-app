package com.test.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by SERGE on 06.07.2014.
 */
public class MockController extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //RequestDispatcher page = req.getRequestDispatcher("a/b.jsp");

        resp.getWriter().write("Hello World");
    }
}
