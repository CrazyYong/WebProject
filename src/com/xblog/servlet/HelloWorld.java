package com.xblog.servlet;

import javax.servlet.ServletConfig;
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


    /**
          * 当servlet配置了初始化参数后，web容器在创建servlet实例对象时，
          * 会自动将这些初始化参数封装到ServletConfig对象中，并在调用servlet的init方法时，
          * 将ServletConfig对象传递给servlet。进而，程序员通过ServletConfig对象就可以
           * 得到当前servlet的初始化参数信息。
           */
    @Override
    public void init(ServletConfig config) throws ServletException {
        message = "Hello world, this message is from servlet!";
    }


         /**
          * 使用PrintWriter流输出中文
          * @param response
          * @throws IOException
          */
                public void outputChineseByPrintWriter(HttpServletResponse response) throws IOException{String data = "中国--";

                //通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
                //response.setHeader("content-type", "text/html;charset=UTF-8");
                 response.setCharacterEncoding("UTF-8");//设置将字符以"UTF-8"编码输出到客户端浏览器
                /**
                 * PrintWriter out = response.getWriter();这句代码必须放在response.setCharacterEncoding("UTF-8");之后
                 * 否则response.setCharacterEncoding("UTF-8")这行代码的设置将无效，浏览器显示的时候还是乱码
                   */
                PrintWriter out = response.getWriter();//获取PrintWriter输出流
                 /**
                 * 多学一招：使用HTML语言里面的<meta>标签来控制浏览器行为，模拟通过设置响应头控制浏览器行为
                  * out.write("<meta http-equiv='content-type' content='text/html;charset=UTF-8'/>");
                  * 等同于response.setHeader("content-type", "text/html;charset=UTF-8");
                  */
                 out.write("<meta http-equiv='content-type' content='text/html;charset=UTF-8'/>");
                 out.write(data);//使用PrintWriter流向客户端输出字符
            }




    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//设置响应内容类型
        resp.setContentType("text/html");
//设置逻辑实现
        PrintWriter out = resp.getWriter();
        out.println("<h3>" + message + "</h3>");

        outputChineseByPrintWriter(resp);//使用PrintWriter流输出中文
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
