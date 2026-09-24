package bookworm;

import student.TestCase;

public class MovieTest extends TestCase {

    private Movie movie;

    public void setUp() {
        movie = new Movie();
    }

    public void testConstructor() {
        assertEquals("", movie.getDirector());
        assertEquals("", movie.getRuntime());
        assertEquals("", movie.getRating());
    }

    public void testSetDirector() {
        movie.setDirector("Christopher Nolan");
        assertEquals("Christopher Nolan", movie.getDirector());
    }

    public void testSetRuntime() {
        movie.setRuntime("148");
        assertEquals("148", movie.getRuntime());
    }

    public void testSetRating() {
        movie.setRating("5");
        assertEquals("5", movie.getRating());
    }
}
