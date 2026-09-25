package bookworm;

// -------------------------------------------------------------------------
/**
 *  Test method for the media class
 * 
 *  @author oliver
 *  @version Sep 24, 2026
 */
class MediaTest extends student.TestCase {

    private Media media1;

    /**
     * Sets up the test case.
     */
    public void setUp() {
        media1 = new Media("harry potter", 1);
    }


    /**
     * Tests GetName().
     */
    public void testGetName() {
        assertEquals("harry potter", media1.getName());
    }


    /**
     * Tests GetId().
     */
    public void testGetId() {
        assertEquals(1, media1.getId());
    }


    /**
     * Tests isAvailable().
     */
    public void testisAvailable() {
        assertTrue(media1.isAvailable());
    }

}