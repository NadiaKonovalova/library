public class Book {
    private String bookId;
    private String author;
    private String title;
    private int yearOfRelease;
    private String language;
    private String genres;
    private int copyOfBook;


    public Book() {
    }

    private static long idCounter = 0;

    public static synchronized String bookId()
    {
        return String.valueOf(idCounter++);
    }

    public Book(String bookId, String author, String title, int yearOfRelease, String language, String genres, int copyOfBook) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.language = language;
        this.genres = genres;
        this.copyOfBook = copyOfBook;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
    public int getCopyOfBook() {
        return copyOfBook;
    }

    public void setCopyOfBook(int copyOfBook) {
        this.copyOfBook = copyOfBook;
    }

    public static long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(long idCounter) {
        Book.idCounter = idCounter;
    }

    @Override
    public String toString() {
        return  '\n' +
                //"bookId = " + bookId + '\n' +
                "author = " + author + '\n' +
                "title = " + title + '\n' +
                "yearOfRelease = " + yearOfRelease +'\n'+
                "language = " + language + '\n' +
                "genres = " + genres + '\n' +
                "_______________________"+ '\n';
    }
}
