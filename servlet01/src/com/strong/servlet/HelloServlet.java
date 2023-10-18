package com.strong.servlet;

import jakarta.servlet.*;

import java.io.IOException;

public class HelloServlet implements Servlet {
    private int cout;
    public HelloServlet() {
        System.out.println("HelloServlet 无参数构造方法被执行了");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        System.out.println("init()->>HelloWordServlet ");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service->>HelloServlet"+cout++);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy ->>HelloServlet");
    }
}
