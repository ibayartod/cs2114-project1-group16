package bookworm;

import student.TestCase;

/**
 * Tests the Movie class.
 */
public class MovieTest extends student.TestCase {

    private Movie movie;

    /**
     * Sets up the test.
     */
    public void setUp() {
        movie = new Movie("Titanic", "Christopher Nolan", 12);
    }

    /**
     * Tests the constructor.
     */
    public void testConstructor() {
        assertEquals("Christopher Nolan", movie.getDirector());
        assertEquals("", movie.getRuntime());
        assertEquals("", movie.getRating());
    }

    /**
     * Tests setDirector.
     */
    public void testSetDirector() {
        movie.setDirector("Christopher Nolan");
        assertEquals("Christopher Nolan", movie.getDirector());
    }

     /**
     * Tests setRuntime.
     */
    public void testSetRuntime() {
        movie.setRuntime("148");
        assertEquals("148", movie.getRuntime());
    }

    /**
     * Tests setRating.
     */
    public void testSetRating() {
        movie.setRating("5");
        assertEquals("5", movie.getRating());
    }
}