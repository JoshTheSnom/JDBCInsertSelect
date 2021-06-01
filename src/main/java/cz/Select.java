package cz;

import java.sql.*;

public class Select {
    public static void main(String args[])throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/c3zoo", "root", ""
        );

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM zvirata");
        String format = "%-20s%s%n";
        while(result.next()) {
            System.out.printf(format, result.getString("jmeno"), result.getString("druh"));
        }

        connection.close();
    }
}
