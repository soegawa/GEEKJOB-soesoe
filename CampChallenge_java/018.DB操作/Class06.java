
import java.sql.*;

public class Class06 {

    public static void main(String[] args) {
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "SOESOE", "password");
            db_st = db_con.prepareStatement("delete from profiles where profilesID = ?");
            db_st.setInt(1, 6);
            int num = db_st.executeUpdate();
            db_st = db_con.prepareStatement("select * from profiles");
            db_data = db_st.executeQuery();

                System.out.println("更新された行数:"+num);
            while(db_data.next()){
                int ID = db_data.getInt("profilesID");
                String name = db_data.getString("name");
                String tel = db_data.getString("tel");
                int age = db_data.getInt("age");
                String birth = db_data.getString("birthday");
                
                System.out.print("profilesID:" + ID);
                System.out.print(" name:" + name);
                System.out.print(" tel:" + tel);
                System.out.print(" age:" + age);
                System.out.println(" birthday:" + birth);
            }

            db_st.close();
            db_con.close();
        } catch (SQLException e_sql) {
            System.out.println("接続時にエラーが発生いたしました:" + e_sql.toString());
        } catch (Exception e) {
            System.out.println("接続時にエラーが発生いたしました:" + e.toString());
        } finally {
            if (db_con != null) {
                try {
                    db_con.close();
                } catch (Exception e_con) {
                    System.out.println(e_con.getMessage());
                }
            }
        }

    }
}
