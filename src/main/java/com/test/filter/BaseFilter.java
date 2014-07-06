package com.test.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by SERGE on 06.07.2014.
 */
public abstract class BaseFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //NOP
    }

    @Override
    public abstract void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException;

    @Override
    public void destroy() {
        //NOP
    }
}
