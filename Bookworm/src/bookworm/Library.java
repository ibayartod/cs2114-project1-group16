package bookworm;

import java.util.ArrayList;

public class Library {
        
    private ArrayList<User> users;
    
    private ArrayList<Media> media;
    
    public Library() {
        
    }
    
    // add/remove
    
    public boolean addUser() {
        return false;
    }
    
    public boolean removeUser() {
        return false;
    }
    
    public boolean addMedia() {
        return false;
    }
    
    public boolean removeMedia() {
        return false;
    }
    
    // getters/setters
    
    public User getUser(String str) {
        return new User();
    }
    
    public User getUser(int id) {
        return new User();
    }
    
    public int getIdOfUser(String name) {
        return -1;
    }
    
    
    // other methods
    
    public boolean checkOutMedia() {
        return false;
    }
    
    public Media search(String str) {
        return new Media();
    }
    
    public Media search(int id) {
        return new Media();
    }
    

}
