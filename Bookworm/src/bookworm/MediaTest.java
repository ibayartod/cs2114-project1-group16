package Bookworm.src.bookworm;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MediaTest {

    private Media media1;

    /**
     * Sets up the test case.
     */
    public void setUp() {
        media1 = new Media("harry potter", 1, true);
    }


    /**
     * Tests GetName().
     */
    @Test
    public void testGetName() {
        assertEquals("harry potter", media1.getName());
    }


    /**
     * Tests GetId().
     */
    @Test
    public void testGetId() {
        assertEquals(1, media1.getId());
    }


    /**
     * Tests isAvailable().
     */
    @Test
    public void testisAvailable() {
        assertTrue(media1.isAvailable());
    }

}
