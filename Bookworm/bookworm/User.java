package bookworm;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 *  The user class contained in the library, which has a list of currently
 *  checked out media
 * 
 *  @author oliver
 *  @version Sep 24, 2026
 */
public class User {

    private String username;

    private int id;

    private double balance;

    private ArrayList<Media> checkedOut;

    // ----------------------------------------------------------
    /**
     * Create a new User object.
     * @param username the username
     * @param id unique indentifier
     */
    public User(String username, int id) {
        this.username = username;
        this.id = id;
        this.balance = 0.0;
        this.checkedOut = new ArrayList<Media>();
    }

    // ----------------------------------------------------------
    /**
     * Getter for the username
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    // ----------------------------------------------------------
    /**
     * Setter for the username
     * @param username the new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    // ----------------------------------------------------------
    /**
     * Getter method for the unqiue ID
     * @return the ID
     */
    public int getId() {
        return id;
    }

    // ----------------------------------------------------------
    /**
     * Getter method for the balance
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }


    // ----------------------------------------------------------
    /**
     * Setter method for the balance
     * @param balance the balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }


    // ----------------------------------------------------------
    /**
     * Adjusts the balance by an amount, can be positive or negative
     * @param amount the amount the balance is being changed by
     */
    public void changeBalance(double amount) {
        this.balance += amount;
    }

    // ----------------------------------------------------------
    /**
     * Getter method for the list of media checked out by the user
     * @return the media checked out by the user
     */
    public ArrayList<Media> getCheckedOut() {
        return checkedOut;
    }

    // ----------------------------------------------------------
    /**
     * adds something to the checked out array
     * @param media the media that was checked out
     */
    public void checkOut(Media media) {
        checkedOut.add(media);
    }

    // ----------------------------------------------------------
    /**
     * return media (remove from the user's local list)
     * @param media the media being returned
     * @return the media that was removed
     */
    public boolean returnMedia(Media media) {
        return checkedOut.remove(media);
    }

    // ----------------------------------------------------------
    /**
     * Checks whether the user has a certain media checked out
     * @param media the media being checked
     * @return whether it's checked out or not
     */
    public boolean hasCheckedOut(Media media) {
        return checkedOut.contains(media);
    }

}