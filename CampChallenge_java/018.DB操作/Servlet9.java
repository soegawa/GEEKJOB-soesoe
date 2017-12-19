
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet9 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        
        Connection db_con = null;
        PreparedStatement db_st = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "SOESOE", "password");
            db_st = db_con.prepareStatement("insert into profiles values(?,?,?,?,?)");
            //フォームから受け取る。Stringでしか受け取れない。
            String IDs = request.getParameter("profilesID");
            String name = request.getParameter("name");
            String tel = request.getParameter("tel");
            String ages = request.getParameter("age");
            String birth = request.getParameter("日付");
            //intへ変換
            int ID = Integer.parseInt(IDs);
            int age = Integer.parseInt(ages);
            
            db_st.setInt(1,ID);//ID
            db_st.setString(2,name);//名前
            db_st.setString(3,tel);//電話番号
            db_st.setInt(4,age);//年齢
            db_st.setString(5,birth);//誕生日
            
            int num =db_st.executeUpdate();
            
            out.println("更新された行数:"+num);
            
            db_st.close();
            db_con.close();
        } catch (SQLException e_sql){
            out.println("接続時にエラーが発生いたしました:"+e_sql.toString());
        } catch (Exception e) {
            out.println("接続時にエラーが発生いたしました:"+e.toString());
        } finally {
            if (db_con != null){
                try{
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
