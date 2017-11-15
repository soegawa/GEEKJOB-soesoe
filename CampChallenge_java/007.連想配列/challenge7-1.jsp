<%-- 
    Document   : challenge7-1
    Created on : 2017/11/15, 10:46:08
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
            <%@ page import="java.util.HashMap"%>
            
            <%
              HashMap<String,String> data2 = new HashMap<String,String>();
              
              data2.put("1","AAA");
              data2.put("hello","world");
              data2.put("soeda","33");
              data2.put("20","20");
              

            %>
        </h1>
    </body>
</html>
