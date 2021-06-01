package cz;

import java.sql.*;

public class Insert {
    public static void main(String args[])throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/games", "root", ""
        );

        PreparedStatement pStatement = connection.prepareStatement("INSERT INTO games VALUES (NULL, ?, ?, ?, ?);");

        pStatement.setString(1, "The Witcher 3: Wild Hunt");
        pStatement.setInt(2, 89);
        pStatement.setDate(3, java.sql.Date.valueOf("2015-05-18"));
        pStatement.setString(4, "CD Projekt Red");

        pStatement.executeUpdate();

        pStatement.close();
        connection.close();
    }
}
