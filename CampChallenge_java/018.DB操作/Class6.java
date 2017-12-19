
import java.sql.*;

public class Class6 {

    public static void main(String[] args) {
        Connection db_con = null;
        PreparedStatement db_st = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:8889/Challenge_db", "SOESOE", "password");
            db_st = db_con.prepareStatement("delete from profiles where profilesID = ?");
            db_st.setInt(1, 6);
            int num = db_st.executeUpdate();

            System.out.print(num);

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
