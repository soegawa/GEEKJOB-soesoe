<%-- 
    Document   : challenge8-1
    Created on : 2017/11/15, 11:02:52
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
               long total = 1;
               for(int i=0;i<20;i++){
                   total = total * 8;
                   
               } 
            out.print(total);
            %>
        </h1>
    </body>
</html>
