<%-- 
    Document   : Challenge4
    Created on : 2017/12/21, 10:52:29
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
        <div align="center">
        <font size="5">上書きフォーム
        <form action="Servlet11" method="post">
            <p>
                　　　ID:<input type="number" name="profilesID"><br>
            </p>
            <p>
                　　名前:<input type="text" name="name" placeholder="田中 太郎"><br>
            </p>
            <p>
                電話番号:<input type="text" name="tel" placeholder="XXX-XXXX-XXXX"><br>
            </p>
            <p>
                　　年齢:<input type="number" name="age"><br>
            </p>
            <p>
                　誕生日:<input type="date" name="birthday" placeholder="19XX-XX-XX"><br>
            </p>
            <p>
                <input type="submit" name="Submit">
            </p>
        </form>
        </font>
        </div>
    </body>
</html>
