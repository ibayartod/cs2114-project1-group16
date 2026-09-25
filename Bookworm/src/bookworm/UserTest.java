package bookworm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for {@link User}.
 * <p>
 * Assumes {@code Media} has a constructor that takes a {@code String} title
 * (e.g. {@code new Media("Some Title")}). Adjust the {@code Media} setup in
 * {@link #setUp()} if the real constructor differs.
 */
public class UserTest
{

    private User user;
    private Media media1;
    private Media media2;

    @BeforeEach
    public void setUp()
    {
        user = new User("jdoe", 101);
        media1 = new Media("The Hobbit");
        media2 = new Media("Dune");
    }


    @Test
    public void testConstructorSetsFields()
    {
        assertEquals("jdoe", user.getUsername());
        assertEquals(101, user.getId());
    }


    @Test
    public void testNewUserHasZeroBalance()
    {
        assertEquals(0.0, user.getBalance());
    }


    @Test
    public void testNewUserHasEmptyCheckedOutList()
    {
        assertTrue(user.getCheckedOut().isEmpty());
    }


    @Test
    public void testSetUsername()
    {
        user.setUsername("janedoe");
        assertEquals("janedoe", user.getUsername());
    }


    @Test
    public void testSetBalance()
    {
        user.setBalance(5.50);
        assertEquals(5.50, user.getBalance());
    }


    @Test
    public void testChangeBalancePositiveAddsFine()
    {
        user.setBalance(2.00);
        user.changeBalance(1.25);
        assertEquals(3.25, user.getBalance(), 0.0001);
    }


    @Test
    public void testChangeBalanceNegativeReducesFine()
    {
        user.setBalance(5.00);
        user.changeBalance(-2.00);
        assertEquals(3.00, user.getBalance(), 0.0001);
    }


    @Test
    public void testCheckOutAddsMedia()
    {
        user.checkOut(media1);
        assertTrue(user.hasCheckedOut(media1));
        assertEquals(1, user.getCheckedOut().size());
    }


    @Test
    public void testCheckOutMultipleMedia()
    {
        user.checkOut(media1);
        user.checkOut(media2);
        assertEquals(2, user.getCheckedOut().size());
        assertTrue(user.hasCheckedOut(media1));
        assertTrue(user.hasCheckedOut(media2));
    }


    @Test
    public void testReturnMediaRemovesFromCheckedOut()
    {
        user.checkOut(media1);
        user.returnMedia(media1);
        assertFalse(user.hasCheckedOut(media1));
        assertTrue(user.getCheckedOut().isEmpty());
    }


    @Test
    public void testHasCheckedOutFalseWhenNeverCheckedOut()
    {
        assertFalse(user.hasCheckedOut(media1));
    }


    @Test
    public void testReturnMediaNotCheckedOutDoesNothing()
    {
        user.checkOut(media1);
        user.returnMedia(media2);
        assertEquals(1, user.getCheckedOut().size());
        assertTrue(user.hasCheckedOut(media1));
    }

}
