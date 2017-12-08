<%-- 
    Document   : test5
    Created on : 2017/12/07, 14:49:54
    Author     : soele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    String str = request.getParameter("数値");
    int kazu = Integer.parseInt(str);
    out.print(str + "<br>");
    //一桁の素数で割る

    for (int i = 2; i <= 7; i++) {
        //素数でない4,6ははずす
        if (i == 4 || i == 6) {
            continue;
        }
        //割り切れるまで、そして『数値』と同じでないiで割る(同じだと１になってしまう)
        while (kazu >= 4 && kazu % i == 0 && kazu != i) {
            kazu = kazu / i;
            //割った素数を表示
            out.print(i + "   ");

        }
    }
    if (kazu >= 10) {
        out.print("余り");
    }

    out.print(kazu);
%>
