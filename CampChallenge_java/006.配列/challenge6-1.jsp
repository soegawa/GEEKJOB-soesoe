<%-- 
    Document   : challenge6-1
    Created on : 2017/11/14, 16:26:34
    Author     : soele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%@ page import="java.util.ArrayList" %>
            <%
                
                ArrayList<String> data1 = new ArrayList<String>();
                
                data1.add("10");
                data1.add("100"); 
                data1.add("soeda"); 
                data1.add("hayashi"); 
                data1.add("-20"); 
                data1.add("118"); 
                data1.add("END"); 
                
                
            %>
        </h1>
    </body>
</html>
