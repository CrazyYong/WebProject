<%--
  Created by IntelliJ IDEA.
  User: cmx
  Date: 2017/8/24
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" errorPage="error.jsp" pageEncoding="UTF-8"%>
<html>
  <head>
    <%--使用<jsp:forward>标签跳转到forwarddemo02.jsp
    <jsp:forward page="/error.jsp"/>--%>


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
  <jsp:include page="/head.jsp"/>
 网页主体
  <jsp:include page="/foot.jsp"/>
  </body>
</html>
