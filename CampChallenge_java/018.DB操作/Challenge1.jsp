<%-- 
    Document   : Challenge1
    Created on : 2017/12/19, 15:02:24
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
        <h1>検索用フォーム</h1>
        <form action="Servlet8" method="post">
            <p>
                <input type="text" name="名前">名前<br>
            </p>
            <p>
                <input type="submit" name="btnSubmit">
            </p>
        </form>
    </body>
</html>
