
import java.sql.*;
import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;

public class Class3 {
    public static void main(String[] args) {
        Connection db_con = null;
        PreparedStatement db_st = null;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "SOESOE", "password");
                //INSERT文
            db_st = db_con.prepareStatement("insert into profiles values(?,?,?,?,?)");
            
            Date day = sdf.parse("2000-01-01");//誕生日
            //java.util.Dateをjava.sql.Dateへ変換
            java.sql.Date day2 = new java.sql.Date(day.getTime());
            
            db_st.setInt(1,5);//ID
            db_st.setString(2,"a");//名前
            db_st.setString(3,"a");//電話番号
            db_st.setInt(4,37);//年齢
            db_st.setDate(5,day2);//誕生日
            
            
            int num =db_st.executeUpdate();
            
            System.out.println(num);
            
            
            db_st.close();
            db_con.close();
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
