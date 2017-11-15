<%-- 
    Document   : challenge8-3
    Created on : 2017/11/15, 12:54:51
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
            int total = 0;
            
                for(int i=1;i<=100;i++){
                    total = total + i;
                }
                
            %>
        </h1>
    </body>
</html>
