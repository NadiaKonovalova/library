import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class LibraryManager {
    DbConnector dbConnector = new DbConnector();
    Scanner scanner = new Scanner(System.in);
    String again = "y";
    String action = scanner.nextLine().toString();
    public void manageBooks() {
            while (again == "y") {
                again = JOptionPane.showInputDialog(
                        new StringBuilder().append("Please choose option:")
                                .append("\n1. add the book")
                                .append("\n2. find the book")
                                .append("\n3. delete the book")
                                .append("\n4. Exit")
                                .toString());
                switch (action) {
                    case "1":
                        //add
                        break;
                    case "2":
                        //find
                        break;
                    case "3":
                        //delete
                        break;
                }
            }
    }

    public void addBook(){

    }



    private Integer getUserInput1(String message1) { return Integer.parseInt(JOptionPane.showInputDialog(null, message1));}

    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }


}
