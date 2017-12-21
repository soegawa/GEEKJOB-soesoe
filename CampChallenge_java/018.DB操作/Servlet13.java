/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author soele
 */
public class Servlet13 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "SOESOE", "password");
            //フォームから情報を取得
            String name = request.getParameter("name");//name
            String ageS = request.getParameter("age");//age
                int age = Integer.parseInt(ageS);//ageをintへ
            String birth = request.getParameter("birthday");//birthday
            
            db_st = db_con.prepareStatement("select * from profiles where name=? and age=? and birthday=?");
            
            db_st.setString(1,name);
            db_st.setInt(2,age);
            db_st.setString(3,birth);
            
            db_data=db_st.executeQuery();
            while(db_data.next()){
                int IDR =db_data.getInt("profilesID");
                String nameR =db_data.getString("name");
                String telR =db_data.getString("tel");
                int ageR =db_data.getInt("age");
                String birthR = db_data.getString("birthday");
                
                    out.print("profilesID:"+IDR);
                    out.print("  name:"+nameR);
                    out.print("  tel:"+telR);
                    out.print("  age:"+ageR);
                    out.println("  birthday:"+birthR+"<br>");
            }
            
            db_data.close();
            db_con.close();
            db_st.close();
        } catch (SQLException e_sql) {
            out.println("接続時にエラーが発生いたしました:" + e_sql.toString());
        } catch (Exception e) {
            out.println("接続時にエラーが発生いたしました:" + e.toString());
        } finally {
            if (db_con != null) {
                try {
                    db_con.close();
                } catch (Exception e_con) {
                    out.println(e_con.getMessage());
                }
            }

        }
    }
            
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
