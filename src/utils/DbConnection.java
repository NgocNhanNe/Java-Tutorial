package utils;

import java.sql.*;
import java.util.Arrays;

public class DbConnection {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/ex1";
    static final String USERNAME = "root";
    static final String PASSWORD = "Ngocnhan2104!";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        }

    }

