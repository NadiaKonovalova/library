import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    public static void main(String[] args) {
        String  dbURL = "jdbc:mysql://localhost:3306/usersList";
        String username = "JAVA_35_36";
        String password = "Welcome2023";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL,username,password);
            System.out.println("Connection is Successful to the library database");

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);

        }
    }
}
