package Preojct;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionProvider {

    private static final String URL      = "jdbc:mysql://localhost:3306/lms";
    private static final String USER     = "root";
    private static final String PASSWORD = "";

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            return con;
        } catch (ClassNotFoundException e) {
            System.err.println("[DB ERROR] MySQL Connector JAR is missing: " + e.getMessage());
            JOptionPane.showMessageDialog(null,
                "MySQL Connector JAR not found!\n\nAdd mysql-connector-j.jar to your project libraries.",
                "Missing JAR", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (SQLException e) {
            System.err.println("[DB ERROR] SQL Exception: " + e.getMessage());
            System.err.println("[DB ERROR] Error Code: " + e.getErrorCode());
            System.err.println("[DB ERROR] SQL State: " + e.getSQLState());
            JOptionPane.showMessageDialog(null,
                "Database Error:\n\n" + e.getMessage() +
                "\n\nSQL State: " + e.getSQLState() +
                "\nError Code: " + e.getErrorCode(),
                "Connection Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (Exception e) {
            System.err.println("[DB ERROR] Unexpected error: " + e.getMessage());
            JOptionPane.showMessageDialog(null,
                "Unexpected Error:\n\n" + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}