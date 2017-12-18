/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author soele
 */
public class Class2 {
    public static void main(String[] args) {
        Connection db_con = null;
    try
    {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "SOESOE", "password");
            db_con.close();
            System.out.println("接続されました！");
    } catch (SQLException e_sql){
            System.out.println("接続時にエラーが発生いたしました:"+e_sql.toString());
        } catch (Exception e) {
            System.out.println("接続時にエラーが発生いたしました:"+e.toString());
        } finally {
        if (db_con != null){
            try{
                db_con.close();
            } catch (Exception e_con) {
                System.out.println(e_con.getMessage());
            }
        }
    }
    }
}
