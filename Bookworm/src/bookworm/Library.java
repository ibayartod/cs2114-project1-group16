package bookworm;

import java.util.ArrayList;

// -------------------------------------------------------------------------
/**
 *  The overarching Library class
 * 
 *  @author oliver
 *  @version Sep 23, 2026
 */
public class Library {
        
    private ArrayList<User> users;
    
    private ArrayList<Media> media;
    
    // ----------------------------------------------------------
    /**
     * Create a new Library object.
     */
    public Library() {
        
    }
    
    private int getUserIndex(User user) {
        return this.users.indexOf(user);
    }
    
    private int getMediaIndex(Media m) {
        return this.media.indexOf(m);
    }
    
    // add/remove
    
    // ----------------------------------------------------------
    /**
     * Adds a user to the list
     * @param user The user to be added
     * @return true if it succeeds, false if it can't add the user
     */
    public boolean addUser(User user) {
        if (user == null) {
            return false;
        }
        users.add(user);
        return true;
    }
    
    // ----------------------------------------------------------
    /**
     * Removes a user from the list of users
     * @param user the user to be removed
     * @return the user that was removed, or null if it doesn't exist
     */
    public User removeUser(User user) {
        int index = getUserIndex(user);
        if (index == -1) {
            return null;
        }
        return users.remove(index);
    }
    
    // ----------------------------------------------------------
    /**
     * Adds a media to the media
     * @param m The media to be added
     * @return true if adding succeeds, false if it fails
     */
    public boolean addMedia(Media m) {
        if (m == null) {
            return false;
        }
        media.add(m);
        return true;
    }
    
    // ----------------------------------------------------------
    /**
     * Removes media from the media list
     * @param m the media to be removed
     * @return the media that was removed, null if it doesn't exist
     */
    public Media removeMedia(Media m) {
        int index = getMediaIndex(m);
        if (index == -1) {
            return null;
        }
        return media.remove(index);
    }
    
    // getters/setters
    
    // ----------------------------------------------------------
    /**
     * Gets the user by searching their username (ignoring case)
     * @param str the input string
     * @return the user that was searched for, or null if it fails
     */
    public User getUser(String str) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equalsIgnoreCase(str)) {
                return users.get(i);
            }
        }
        return null;
    }
    
    // ----------------------------------------------------------
    /**
     * Gets the user from searching the id
     * more precise than the string version because every user has unique ids
     * @param id the input id
     * @return the user that was searched for
     */
    public User getUser(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return users.get(i);
            }
        }
        return null;
    }
    
    public int getIdOfUser(String name) {
        User user = getUser(name);
        if (user == null) {
            return -1;
        }
        return user.getId();
    }
    
    
    // other methods
    
    // ----------------------------------------------------------
    /**
     * Checks out media from the library and gives it to a user
     * @param user the user checking it out
     * @param m the media being checked out
     * @return true upon succeed, else false
     */
    public boolean checkOutMedia(User user, Media m) {
        if (user == null || m == null) {
            return false;
        }
        
        if (!m.isAvailable()) {
            return false;
        }
        
        user.checkOut(m);
        
        m.setAvailable(false);
        
        return true;
    }
    
    // ----------------------------------------------------------
    /**
     * Returns media from a user and makes it available to check out again
     * @param user the user returning the media
     * @param m the media being checked in
     * @return true upon succeed, else false
     */
    public boolean returnMedia(User user, Media m) {
        
        if (user == null || media == null) {
            return false;
        }
        
        if (m.isAvailable()) {
            return false; // it's already checked back in
        }
        
        if (!user.checkIn(m)) {
            return false; // the user doesn't have the media
        }
        
        m.setAvailable(true);
        
        return true;
    }
    
    // ----------------------------------------------------------
    /**
     * Searches for media by its title
     * @param str what the user searches for
     * @return a list of Media that has the substring str in it
     */
    public ArrayList<Media> search(String str) {
        ArrayList<Media> results = new ArrayList<Media>();
        
        for(int i = 0; i < media.size(); i++) {
            String title = media.get(i).getName();
            if (title.contains(str)) {
                results.add(media.get(i));
            }
        }
        return results;
    }
    
    // ----------------------------------------------------------
    /**
     * Searches for media by its Id number.
     * @param id the media Id number
     * @return the piece of media with that Id number
     */
    public Media search(int id) {
        Media results;
        for(int i = 0; i < media.size(); i++) {
            int mediaId = media.get(i).getId();
            if (mediaId == id) {
                results = media.get(i);
            }
        }
        return results;
    }
    

}
