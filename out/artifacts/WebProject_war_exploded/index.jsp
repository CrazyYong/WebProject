<%--
  Created by IntelliJ IDEA.
  User: cmx
  Date: 2017/8/24
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" import="java.util.*" errorPage="error.jsp" pageEncoding="UTF-8"%>
<html>
  <head>
    <%= new java.util.Date() %>

    <%
           int sum=0;//声明变量

           /*编写语句*/
           for (int i=1;i<=100;i++){
               sum+=i;
           }
           out.println("<h1>Sum="+sum+"</h1>");
       %>
    <title>第一个Web项目</title>
  </head>
  <body>
  <%
           //这行代码肯定会出错，因为除数是0，一运行就会抛出异常
            int x = 1/0;
         %>
  Hello World
  </body>
</html>
