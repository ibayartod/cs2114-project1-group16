package bookworm;

import student.TestCase;

public class NewspaperTest extends TestCase {

    private Newspaper newspaper;

    public void setUp() {
        newspaper = new Newspaper();
    }

    public void testConstructor() {
        assertEquals("", newspaper.getPublisher());
        assertEquals("", newspaper.getPublicationDate());
        assertEquals("", newspaper.getEdition());
    }

    public void testSetPublisher() {
        newspaper.setPublisher("The New York Times");
        assertEquals("The New York Times", newspaper.getPublisher());
    }

    public void testSetPublicationDate() {
        newspaper.setPublicationDate("9/24/2026");
        assertEquals("4/10/1995", newspaper.getPublicationDate());
    }

    public void testSetEdition() {
        newspaper.setEdition("Morning");
        assertEquals("Morning", newspaper.getEdition());
    }
}
