public class Book {

    private String author;
    private String title;

    private Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }

}
