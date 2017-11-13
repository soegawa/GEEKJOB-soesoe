<%-- 
    Document   : challenge5-2-1
    Created on : 2017/11/13, 17:20:58
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
                int type = 1;
                switch(type){
                    case 1: out.print("one");
                      break;
                    case 2: out.print("twe");
                      break;
                    default:out.print("想定外");
                      break;
                }
            %>
            
        </h1>
    </body>
</html>
