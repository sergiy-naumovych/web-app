package com.test.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by SERGE on 06.07.2014.
 */
public class ProcessingTimeFilter extends BaseFilter{

    public ProcessingTimeFilter(){

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getInitParameterNames());
        System.out.println(">> ProcessingTimeFilter - init");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        long inTime = System.nanoTime();
        chain.doFilter(req, res);
        long outTime = System.nanoTime();
        System.out.println(">> ProcessingTimeFilter: dt = " + (outTime - inTime));
        System.out.println();
    }

    @Override
    public void destroy() {

    }
}
