package JDBC;

import utils.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnection.getConnection();
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO student(student_id, student_name, student_age) VALUES (5,\"Ten\",15)";
        statement.executeUpdate(sql);
                ResultSet rs = statement.executeQuery(sql);

                while (rs.next()) {
                    int student_id = rs.getInt(1);
                    String student_name = rs.getString(2);
                    int age = rs.getInt(3);
                    System.out.println("id: " + student_id + ", name: " + student_name + ", Age: ," + age);
                }
        connection.close();

    }
}
