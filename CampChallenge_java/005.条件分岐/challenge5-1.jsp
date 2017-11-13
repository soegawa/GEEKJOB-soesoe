<%-- 
    Document   : challenge5-1
    Created on : 2017/11/13, 17:00:33
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
               int num = 2;
               
               if(num == 1){out.print("１です！");
               }
               else if(num == 2){out.print("プラグラミングキャンプ！");
               }
               else{out.print("その他です！");
               }
               
            %>
        </h1>
    </body>
</html>
