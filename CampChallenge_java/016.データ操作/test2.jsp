<%-- 
    Document   : test2
    Created on : 2017/12/05, 15:17:22
    Author     : soele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("UTF-8");
    
    String str = request.getParameter("total");
    String str2 = request.getParameter("count");
    String str3 = request.getParameter("type");
    //引数がString型のため、int型に直す
    int shurui = Integer.parseInt(str3);
    
    if(shurui == 1){
        out.print("雑貨<br>");
    }
    else if(shurui == 2){
        out.print("生鮮食品<br>");
    }
    else{
        out.print("その他<br>");
    }
    //引数がString型のため、int型に直す
    int gaku = Integer.parseInt(str);
    int kosu = Integer.parseInt(str2);
    //一個あたりの額をだす
    out.print("一個当たり"+gaku / kosu+"円<br>");
    //総額に応じたポイント
    if(gaku >= 5000){
        out.print(gaku*5/100+"ポイント付与");
    }
    else if(gaku >= 3000){
        out.print(gaku*4/100+"ポイント付与");
    }
%>
