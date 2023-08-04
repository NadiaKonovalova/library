import javax.swing.*;

public class LibraryManager {
    DbConnector dbConnector = new DbConnector();
    public void addBook(){
        Book book = new Book();
        book.setAuthor(this.getUserInput("add the Author"));
        book.setTitle(this.getUserInput("add the title of the book"));
        book.setYearOfRelease(this.getUserInput1("add year of book"));
        book.setLanguage(this.getUserInput("add the language of the book"));
        book.setGenres(this.getUserInput("add the genre of the book"));
        book.setCopyOfBook(this.getUserInput1("add the copies of book"));

    }

    private Integer getUserInput1(String message1) { return Integer.parseInt(JOptionPane.showInputDialog(null, message1));}

    private String getUserInput(String message) {
        return JOptionPane.showInputDialog(null, message);
    }


}
