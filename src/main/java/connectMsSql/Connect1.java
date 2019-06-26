package connectMsSql;

import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class Connect1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/loans",
                "postgres",
                "123"
        );

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(
                "SELECT * FROM client"
        );

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " "
                    + resultSet.getInt("id_user_data") + " "
                    + resultSet.getBoolean("vip")
            );
        }

        connection.close();
    }

}
