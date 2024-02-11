package thetechcompanyapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thetechcompany", "root", "Dushan1234");
        } catch (ClassNotFoundException | SQLException ex) {
            // Log the exception or print the stack trace

        }
        return con;
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            // Log the exception or print the stack trace

        }
    }
}
