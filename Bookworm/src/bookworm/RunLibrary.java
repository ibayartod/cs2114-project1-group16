package bookworm;
// -------------------------------------------------------------------------
/**
 *  Demo of usage of the Library class
 * 
 *  @author oliver
 *  @version Sep 25, 2026
 */
public class RunLibrary {

    // ----------------------------------------------------------
    /**
     * Main
     * @param args args
     */
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addUser(new User("Jeff Baker", 0));
        lib.addUser(new User("Samantha Kruel", 1));
        lib.addUser(new User("Emma Degman", 2));
        lib.addUser(new User("Greg Baker", 3));
        
        User user = lib.getUser("Emma Degman");
        // searches for books that match "to kill" and checks out the first one
        Media book = lib.search("To kill").get(0);
        book.print();
        lib.checkOutMedia(user, book);
        book.print(); // is now not available
        
        User otherUser = lib.getUser(1);
        // fails because this user didn't check out the book
        lib.returnMedia(otherUser, book); 

        // succeeds
        lib.returnMedia(user, book);
        book.print(); // is available again


    }

}
