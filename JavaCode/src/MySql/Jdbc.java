package MySql;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
try {

    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TKA", "root", "rootroot");
    Statement stmt = conn.createStatement();
    String sqlQuery = "select * from student";
    ResultSet rs = stmt.executeQuery(sqlQuery);

    while (rs.next()) {
        System.out.println(rs.getInt("sid"));

        //("sid")+"->"+("sname")
        System.out.println(rs.getString("sname"));
        System.out.println(rs.getInt("sPhone"));
        System.out.println(rs.getString("sCity"));
    }
} catch (Exception e){
    System.out.println(e);
}


    }

}
