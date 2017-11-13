<%-- 
    Document   : challenge4-1
    Created on : 2017/11/13, 16:48:09
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
                final String NAME = "groove";
                final String haihun = "-";
                final String NAME2 = "gear";
                out.print(NAME + haihun + NAME2 );
            %>
            
        </h1>
    </body>
</html>
