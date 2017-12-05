<%-- 
    Document   : test.jsp
    Created on : 2017/12/05, 13:42:02
    Author     : soele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<p>
<%
    request.setCharacterEncoding("UTF-8");
    out.print(request.getParameter("名前")+"<br>");
    out.print(request.getParameter("性別")+"<br>");
    out.print(request.getParameter("趣味")+"<br>");
%>
</p>
