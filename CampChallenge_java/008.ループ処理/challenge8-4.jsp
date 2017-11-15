<%-- 
    Document   : challenge8-4
    Created on : 2017/11/15, 14:21:10
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
                int num = 1000;
                
                while(num<100 == false){
                    num = num / 2;
                }
            %>
        </h1>
    </body>
</html>
