package bookworm;


public class Book extends Media {
    
    private String author;
    
    private String genre;
    
    private String ISBN;
    
    public Book() {
        
    }
    
    public void print() {
        author = "";
        genre = "";
        ISBN =  "";
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setISBN() {
        this.ISBN = ISBN;
    }
    
    @Override
    public void print() {
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("ISBN" + ISBN);
    }
 
}
