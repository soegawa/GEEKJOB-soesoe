<%-- 
    Document   : challenge5-2-2
    Created on : 2017/11/13, 18:03:53
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
                char type = 'A';
                
                switch(type){
                    case 'A': out.print("英語");
                      break;
                    case 'あ': out.print("日本語");
                      break;
                }
            %>
        </h1>
    </body>
</html>
