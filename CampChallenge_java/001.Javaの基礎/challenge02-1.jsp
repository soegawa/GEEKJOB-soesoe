<%-- 
    Document   : challenge02-1
    Created on : 2017/11/13, 15:14:37
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
            <%
            int age = 26;
            String name = "添川";
            
            
            out.print(name + "と申します！<br>");
            out.print("年齢は"+age+"歳です。");
           
            %>
        </h1>
    </body>
</html>
