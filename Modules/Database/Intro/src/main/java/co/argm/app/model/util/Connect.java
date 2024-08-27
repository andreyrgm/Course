package co.argm.app.model.util;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class Connect {
    static String url = "jdbc:mysql://localhost:3306/java_course";
    static String user = "root";
    static String password = "ArGm_2005";

    public static Connection getInstance() throws SQLException {
        return getConnection(url, user, password);
    }
}
