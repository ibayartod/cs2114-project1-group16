package bookworm;

public class Media {

    private String title;

    private int id;

    private boolean isAvailable;

    // ----------------------------------------------------------
    /**
     * Create a new Media object.
     * 
     * @param mTitle
     * @param mId
     * @param mIsAvailable
     */
    public Media(String mTitle, int mId, boolean mIsAvailable) {
        title = mTitle;
        id = mId;
        isAvailable = mIsAvailable;
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
     * Gets the media avalibity
     * 
     * @return the media avalibilty
     */
    public boolean isAvailable() {
        return isAvailable;
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
