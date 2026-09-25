package bookworm;

import student.TestCase;

/**
 * Tests the Book class.
 */
public class BookTest extends student.TestCase {

    private Book book;

    /**
     * Sets up the test.
     */
    public void setUp() {
        book = new Book("Little Women", "Louisa May Alcott", 32);
    }

    /**
     * Tests the constructor.
     */
    public void testConstructor() {
        assertEquals("Louisa May Alcott", book.getAuthor());
        assertEquals("", book.getGenre());
        assertEquals("", book.getISBN());
    }

    /**
     * Tests setAuthor.
     */
    public void testSetAuthor() {
        book.setAuthor("George Orwell");
        assertEquals("George Orwell", book.getAuthor());
    }

    /**
     * Tests setGenre.
     */
    public void testSetGenre() {
        book.setGenre("Fiction");
        assertEquals("Fiction", book.getGenre());
    }

    /**
     * Tests setISBN.
     */
    public void testSetISBN() {
        book.setISBN("123456789");
        assertEquals("123456789", book.getISBN());
    }
}