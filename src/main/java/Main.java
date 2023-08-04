import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private final UserManager userManager = new UserManager();
    public static void main(String[] args) throws SQLException {
        Main main = new Main();

        String  dbURL = "jdbc:mysql://localhost:3306/usersList";
        String username = "JAVA_35_36";
        String password = "Welcome2023";
        try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            main.start();
        }catch (Exception e){
            e.printStackTrace();
        }

        }
    String start() {

            String userChoice = "";

            while (!userChoice.equals("3")) {
                userChoice = JOptionPane.showInputDialog(
                        JOptionPane.showInputDialog(
                                new StringBuilder()
                                        .append("Welcome to 'MyLibrary'!\n Please choose your role")
                                        .append("\n1. choose if you want log in like user")
                                        .append("\n2. choose if you want log in like staff")
                                        .append("\n3. to exit")
                                        .toString()));
            }

            switch (userChoice) {
                case "1":
                    this.userManager.userLogIn();
                    break;
                case "2":
                    // this.userManager.staffLogIn();
                    break;
            }
        return userChoice;
    }
    }