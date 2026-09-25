package bookworm;

/**
 * Unit tests for {@link User}.
 * <p>
 * Assumes {@code Media} has a constructor that takes a {@code String} title
 * (e.g. {@code new Media("Some Title")}). Adjust the {@code Media} setup in
 * {@link #setUp()} if the real constructor differs.
 */
public class UserTest extends student.TestCase {

    private User user;
    private Media media1;
    private Media media2;

    public void setUp() {
        user = new User("jdoe", 101);
        media1 = new Media("The Hobbit");
        media2 = new Media("Dune");
    }

    public void testConstructorSetsFields() {
        assertEquals("jdoe", user.getUsername());
        assertEquals(101, user.getId());
    }

    public void testNewUserHasZeroBalance() {
        assertEquals(0.0, user.getBalance());
    }

    public void testNewUserHasEmptyCheckedOutList() {
        assertTrue(user.getCheckedOut().isEmpty());
    }

    public void testSetUsername() {
        user.setUsername("janedoe");
        assertEquals("janedoe", user.getUsername());
    }

    public void testSetBalance() {
        user.setBalance(5.50);
        assertEquals(5.50, user.getBalance());
    }

    public void testChangeBalancePositiveAddsFine() {
        user.setBalance(2.00);
        user.changeBalance(1.25);
        assertEquals(3.25, user.getBalance(), 0.0001);
    }

    public void testChangeBalanceNegativeReducesFine() {
        user.setBalance(5.00);
        user.changeBalance(-2.00);
        assertEquals(3.00, user.getBalance(), 0.0001);
    }

    public void testCheckOutAddsMedia() {
        user.checkOut(media1);
        assertTrue(user.hasCheckedOut(media1));
        assertEquals(1, user.getCheckedOut().size());
    }

    public void testCheckOutMultipleMedia() {
        user.checkOut(media1);
        user.checkOut(media2);
        assertEquals(2, user.getCheckedOut().size());
        assertTrue(user.hasCheckedOut(media1));
        assertTrue(user.hasCheckedOut(media2));
    }

    public void testReturnMediaRemovesFromCheckedOut() {
        user.checkOut(media1);
        user.returnMedia(media1);
        assertFalse(user.hasCheckedOut(media1));
        assertTrue(user.getCheckedOut().isEmpty());
    }

    public void testHasCheckedOutFalseWhenNeverCheckedOut() {
        assertFalse(user.hasCheckedOut(media1));
    }

    public void testReturnMediaNotCheckedOutDoesNothing() {
        user.checkOut(media1);
        user.returnMedia(media2);
        assertEquals(1, user.getCheckedOut().size());
        assertTrue(user.hasCheckedOut(media1));
    }

}
