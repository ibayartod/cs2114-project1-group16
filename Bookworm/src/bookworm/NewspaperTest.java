package bookworm;

import student.TestCase;

/**
 * Tests the Newspaper class.
 */
public class NewspaperTest extends TestCase {

    private Newspaper newspaper;
     
    /**
     * Sets up the test.
     */
    public void setUp() {
        newspaper = new Newspaper();
    }
    
    /**
     * Tests the constructor.
     */
    public void testConstructor() {
        assertEquals("", newspaper.getPublisher());
        assertEquals("", newspaper.getPublicationDate());
        assertEquals("", newspaper.getEdition());
    }

    /**
     * Tests setPublisher.
     */
    public void testSetPublisher() {
        newspaper.setPublisher("The New York Times");
        assertEquals("The New York Times", newspaper.getPublisher());
    }

    /**
     * Tests setPublicationDate.
     */
    public void testSetPublicationDate() {
        newspaper.setPublicationDate("9/24/2026");
        assertEquals("9/24/2026", newspaper.getPublicationDate());
    }
    
    /**
     * Tests setEdition.
     */
    public void testSetEdition() {
        newspaper.setEdition("Morning");
        assertEquals("Morning", newspaper.getEdition());
    }
}
