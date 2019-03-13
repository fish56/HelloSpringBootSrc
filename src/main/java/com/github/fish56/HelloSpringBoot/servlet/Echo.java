package com.github.fish56.HelloSpringBoot.servlet;

import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(urlPatterns = "/servlet/echo")
public class Echo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
        String method = request.getMethod();
        String requestUrl = request.getRequestURI();
        String qs = request.getQueryString();
        Enumeration<String> headerNames = request.getHeaderNames();
        ServletInputStream in = request.getInputStream();

        PrintWriter out = response.getWriter();
        out.println("method: " + method);
        out.println("requestURL: " + requestUrl);
        out.println("qs: " + qs);
        out.println("Headers: ");
        while (headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            out.println(name + ": " + request.getHeader(name));
        }

        out.println("request body: ");
        byte[] bytes = new byte[200];
        int length = 1;
        while (length != -1){
            length = in.read(bytes);
            if(length > 0){
                out.println(new String(bytes, 0, length));
            }
        }
        response.setStatus(201);
        response.setHeader("hello","world");
    }
}