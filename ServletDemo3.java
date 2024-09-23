package com.example.class01servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/demo3")
public class ServletDemo3 implements Servlet {

    /**
     * 执行 Servlet  方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("servletDemon3 执行");
        System.out.println("service 执行");

    }

    /**
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servletDemon3 初始化");

    }

    /**
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     *
     */
    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }

    /**
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        return "";
    }
}