package bookworm;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 *  Library test class
 * 
 *  @author oliver
 *  @version Sep 24, 2026
 */
public class LibraryTest extends student.TestCase {
    private Library library;

    public void setUp() {
        library = new Library();
        User user1 = new User("Jeff", 0);
        library.addUser(user1);
        User user2 = new User("George", 1);
        library.addUser(user2);
        
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 0);
        library.addMedia(book1);
        Movie movie1 = new Movie("Harry Potter 2", "Chris Columbus", 1);
        library.addMedia(movie1);
        Book book2 = new Book("Harry Potter 2", "J. K. Rowling", 2);
        library.addMedia(book2);
        Newspaper newspaper1 = new Newspaper("New York Times", 3);
        library.addMedia(newspaper1);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests removing users
     */
    public void testAddUser() {
        assertFalse(library.addUser(null));
        library.addUser(new User("Henry", 2));
        assertEquals(library.getNumUsers(), 3);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests removing users
     */
    public void testRemoveUser() {
        User user1 = library.getUser(0);
        library.removeUser(user1);
        assertEquals(library.getNumUsers(), 1);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests getNumUsers
     */
    public void testGetNumUsers() {
        assertEquals(library.getNumUsers(), 2);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests addMedia
     */
    public void testAddMedia() {
        assertFalse(library.addMedia(null));
        library.addMedia(new Media("name", 67));
        assertEquals(library.getNumMedia(), 5);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests remove media 
     */
    public void testRemoveMedia() {
        Media media1 = library.search(67);
        library.removeMedia(media1);
        assertEquals(library.getNumMedia(), 4);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests getNumMedia
     */
    public void testGetNumMedia() {
        assertEquals(library.getNumMedia(), 4);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests both getUser methods
     */
    public void testGetUser() {
        User user1 = library.getUser("George");
        User user2 = library.getUser(1);
        assertEquals(user1, user2);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests checkOutMedia
     */
    void testCheckOutMedia() {
        assertFalse(library.checkOutMedia(null, null));
        
        User user = library.getUser("George");
        Media media = library.search(0);
        assertTrue(library.checkOutMedia(user, media));
        assertFalse(library.checkOutMedia(user, media));
    }
    
    // ----------------------------------------------------------
    /**
     * Tests returnMedia method
     */
    void testReturnMedia() {
        assertFalse(library.returnMedia(null, null));
        User user1 = library.getUser("George");
        User user2 = library.getUser("Jeff");
        Media media = library.search(0);
        
        assertFalse(library.returnMedia(user1, media));
        library.checkOutMedia(user1, media);
        assertFalse(library.returnMedia(user2, media));
        assertTrue(library.returnMedia(user1, media));
    }
    
    // ----------------------------------------------------------
    /**
     * Tests search method (search by String)
     */
    void testSearchString() {
        ArrayList<Media> results = library.search("Harry");
        assertEquals(results.size(), 3);
        
        results = library.search("star wars");
        assertEquals(results.size(), 0);
        
    }
    
    // ----------------------------------------------------------
    /**
     * Tests seach method (search by int id)
     */
    void testSearchId() {
        ArrayList<Media> results = library.search("Harry");
        Media result = library.search(0);
        
        assertEquals(result, results.get(0));
        
        result = library.search(40);
        assertNull(result);
    }

}
