package bookworm;

import student.TestCase;

public class BookTest extends TestCase {

    private Book book;

    public void setUp() {
        book = new Book();
    }

    public void testConstructor() {
        assertEquals("", book.getAuthor());
        assertEquals("", book.getGenre());
        assertEquals("", book.getISBN());
    }

    public void testSetAuthor() {
        book.setAuthor("J.K. Rowling");
        assertEquals("J.K. Rowling", book.getAuthor());
    }

    public void testSetGenre() {
        book.setGenre("Fantasy");
        assertEquals("Fantasy", book.getGenre());
    }

    public void testSetISBN() {
        book.setISBN("123456789");
        assertEquals("123456789", book.getISBN());
    }
}
