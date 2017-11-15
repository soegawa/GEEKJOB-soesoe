<%-- 
    Document   : newjsp
    Created on : 2017/11/15, 11:51:24
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
            String moji1 ="A";
            String moji2 ="A";
            
            for(int i=0;i<29;i++){
            moji1 = moji1 + moji2;
            }
            
            
            %>
        </h1>
    </body>
</html>
