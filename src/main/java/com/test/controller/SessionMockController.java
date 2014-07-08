package com.test.controller;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Matrix on 07.07.2014.
 */
public class SessionMockController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //List<Cookie> cookies =  Arrays.asList(req.getCookies());
        AtomicInteger counter = (AtomicInteger)session.getAttribute("counter");
        if(counter == null){
            counter = new AtomicInteger(1);
            session.setAttribute("counter", counter);
        }

        int numberOfVisits = counter.getAndDecrement();
        resp.getWriter().write("You visit this page: " + numberOfVisits + " time");
    }
}
