import javax.swing.*;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public class UserManager {
    Main main = new Main();

    public void userLogIn() {
        String choice = "";
        while (!choice.equals("3")) {
            choice = JOptionPane.showInputDialog(
                    new StringBuilder().append("Please choose an option:")
                            .append("\n1. Register new user")
                            .append("\n2. Log In")
                            .append("\n3. Exit")
                            .toString());
        }
        switch(choice){
            case"1":
                this.registerNewUser();
                break;
            case"2":
                this.logIn();
                break;
        }
    }

    private void logIn() {
        //

    }

    private void registerNewUser(Connection connection, String users) throws SQLException {

    }
}
