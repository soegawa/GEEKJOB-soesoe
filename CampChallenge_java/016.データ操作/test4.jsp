<%-- 
    Document   : test4
    Created on : 2017/12/11, 11:56:17
    Author     : soele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF8");
    HttpSession hs3 = request.getSession();
    ArrayList ary = new ArrayList((ArrayList)hs3.getAttribute("Data"));
    String chk0="";
    String chk1="";
    if(ary.get(1).equals("0")){chk0 = "checked";}
    else if(ary.get(1).equals("1")){chk1 = "checked";}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Servlet3" method="get">
            <p>
                <input type="text" name="名前" value=<%if(ary.get(0)!=null){out.print(ary.get(0));}%>>名前<br>
            <p>
                <input type="radio" name="性別" value="0" <%=chk0%>>男
                <input type="radio" name="性別" value="1" <%=chk1%>>女<br>
            </p>
            <p>
                <textarea name="趣味"><%if(ary.get(2)!=null){out.print(ary.get(2));}%></textarea>趣味<br>
            </p>
            <p>
                <input type="submit" name="btnSubmit">
            </p>
        </form>
        
    </body>
</html>
