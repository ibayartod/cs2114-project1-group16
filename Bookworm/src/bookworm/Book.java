package bookworm;

/**
 * Represents a book.
 */
public class Book extends Media {

    private String author;
    private String genre;
    private String ISBN;

    /**
     * Creates a new Book.
     */
    public Book() {
        super("", 0, true);
        author = "";
        genre = "";
        ISBN = "";
    }

    /**
     * Gets the author.
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the genre.
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Gets the ISBN.
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the author.
     * @param author the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets the genre.
     * @param genre the genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Sets the ISBN.
     * @param ISBN the ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Prints the book information.
     */
    @Override
    public void print() {
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("ISBN: " + ISBN);
    }
}
