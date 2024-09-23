package com.example.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @author 28234
 * @description
 * @date
 */
@WebServlet("/requestDemo01")
public class RequestDemo01 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1.获取请求方法
        String method = req.getMethod();
        System.out.println("获取请求方法" + method);

//        2.获取Servlet请求参数
                String servletPath =req.getServletPath();
        System.out.println("获取ServletPath" + servletPath);
//        3.获取get请求参数
        String queryString = req.getQueryString();
        System.out.println("获取请求参数" + queryString);
//        4.获取请求URI和URl
        String requestURI = req.getRequestURI();
        System.out.println("请求URI" + requestURI);
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("获取请求URL" + requestURL);
//        5.获取版本协议
        String protocol = req.getProtocol();
        System.out.println("版本协议" + protocol);
//        6.获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println("获取虚拟目录" + contextPath);
    }
}