package com.strong.servlet;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class TestGenericServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //首先来
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();

        ServletConfig servletConfig = getServletConfig();
        String servletName = servletConfig.getServletName();
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();
        writer.print(servletName+"<br>");

        while (initParameterNames.hasMoreElements()) {
            String initName = initParameterNames.nextElement();
            String initParameter = servletConfig.getInitParameter(initName);
            writer.print(initName + "=" + initParameter);
            writer.print("<br>");
        }
        System.out.println(getServletContext());

    }
}
