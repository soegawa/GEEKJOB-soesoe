<%-- 
    Document   : challenge3-1
    Created on : 2017/11/13, 15:53:43
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
                final int BASE = 100;
                int num = 2;
                
                int tasu = BASE + num;
                int hiku = BASE - num;
                int kake = BASE * num;
                int waru = BASE / num;
                out.print("定数＝"+BASE+"<br>"+"変数＝"+num+"<br>"+"<br>"
                        +"足し算　"+tasu+"<br>"
                        +"引き算　"+hiku+"<br>"
                        +"掛け算　"+kake+"<br>"
                        +"割り算　"+waru);
            %>
        </h1>
    </body>
</html>
