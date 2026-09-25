package bookworm;

// -------------------------------------------------------------------------
/**
 *  The Media superclass that holds common methods associated with the other
 *  types of media in the Library.
 * 
 *  @author oliver
 *  @version Sep 24, 2026
 */
public class Media {

    private String title;

    private int id;

    private boolean isAvailable;

    // ----------------------------------------------------------
    /**
     * Create a new Media object.
     * 
     * @param mTitle the title
     * @param mId the unique id
     */
    public Media(String mTitle, int mId) {
        title = mTitle;
        id = mId;
        isAvailable = false;
    }


    // ----------------------------------------------------------
    /**
     * Gets the media's name
     * 
     * @return title
     */
    public String getName() {
        return title;
    }
    
    // ----------------------------------------------------------
    /**
     * Setter method for the name
     * @param str
     */
    public void setName(String str) {
        title = str;
    }


    // ----------------------------------------------------------
    /**
     * Gets the media avalibity
     * 
     * @return the media avalibilty
     */
    public boolean isAvailable() {
        return isAvailable;
    }
    
    // ----------------------------------------------------------
    /**
     * Setter for isAvailable
     * @param val the new value
     */
    public void setAvailable(boolean val) {
        isAvailable = val;
    }


    // ----------------------------------------------------------
    /**
     * Gets the media's id
     * 
     * @return the media's id
     */
    public int getId() {
        return id;
    }


    // ----------------------------------------------------------
    /**
     * Prints information about the media.
     */
    public void print() {
        System.out.println("Media title: " + title + ", Media Id: " + id
            + ", Avaliability: " + isAvailable);
    }

}