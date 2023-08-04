import javax.swing.*;

public class Main {
    private  UserManager userManager = new UserManager();
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
    public void start() {

        String userChoice = "";

        while (!userChoice.equals("")) {
            userChoice = JOptionPane.showInputDialog(new StringBuilder()
                    .append("Welcome to 'MyLibrary'! Please choose your role")
                    .append("\n1. -> choose if you want log in like user")
                    .append("\2.-> choose if you want log in like staff")
                    .append("\n3.-> to exit")
                    .toString());
        }

        switch (userChoice) {
            case "1":
                this.userManager.userLogIn();
                break;
            case "2":
                // this.userManager.staffLogIn();
                break;
        }
    }
}