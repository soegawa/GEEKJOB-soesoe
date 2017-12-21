<%-- 
    Document   : Challenge12
    Created on : 2017/12/21, 13:47:07
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
    <center>
        <font size="5">複合検索フォーム
        <form action="Servlet13" method="post">
            <p>
                名前:<input type="text" name="name" placeholder="田中 太郎"><br>
            </p>
            <p>
             年齢:<input type="number" name="age"><br>
            </p>
            <p>
                誕生日:<input type="text" name="birthday" placeholder="19XX-XX-XX"><br>
            </p>
            <p>
                <input type="submit" name="Submit">
            </p>
        </form>
        </font></center>
    </body>
</html>
