
import java.sql.*;
import java.text.SimpleDateFormat;

public class Class7 {
    public static void main(String[] args) {
        Connection db_con = null;
        PreparedStatement db_st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "SOESOE", "password");
            db_st = db_con.prepareStatement("update profiles set name=?,age=?,birthday=? where profilesID = ?");

            java.util.Date day = sdf.parse("1967-11-06");//誕生日
            //java.util.Dateをjava.sql.Dateへ変換
            java.sql.Date day2 = new java.sql.Date(day.getTime());
            
            db_st.setString(1,"松岡 修造");
            db_st.setInt(2,48);
            db_st.setDate(3,day2);
            db_st.setInt(4,1);//ID
            int num =db_st.executeUpdate();
            System.out.println("更新された行数:"+num);
            
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

