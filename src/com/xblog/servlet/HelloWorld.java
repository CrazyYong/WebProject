package com.xblog.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by cmx on 2017/8/25.
 */
public class HelloWorld extends HttpServlet {
    private String message;

    @Override
    public void init() throws ServletException {
        message = "Hello world, this message is from servlet!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//设置响应内容类型
        resp.setContentType("text/html");
//设置逻辑实现
        PrintWriter out = resp.getWriter();
        out.println("<h3>" + message + "</h3>");
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
