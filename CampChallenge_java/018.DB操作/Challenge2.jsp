<%-- 
    Document   : Challenge2
    Created on : 2017/12/19, 16:43:01
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
        <form action="Servlet9" method="post">
            <p>
                <input type="number" name="profilesID"> ID<br>
            </p>
            <p>
                <input type="text" name="name" placeholder="田中 太郎"> 名前<br>
            </p>
            <p>
                <input type="text" name="tel" placeholder="XXX-XXXX-XXXX"> 電話番号<br>
            </p>
            <p>
                <input type="number" name="age"> age<br>
            </p>
            <p>
                <input type="date" name="birthday" placeholder="19XX-XX-XX"> birthday<br>
            </p>
            <p>
                <input type="submit" name="btnSubmit">
            </p>
        </form>
    </body>
</html>
