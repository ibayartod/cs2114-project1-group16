package bookworm;


public class Newspaper extends Media {
    
    private String publisher;
    
    private String publicationDate; // "4/10/1995" for example
    
    private String edition;
    
    public Newspaper() {
        publisher = "";
        publicationDate = "";
        edition = "";
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public String getPublicationDate() {
        return publicationDate;
    }
    
    public String getEdition() {
        return edition;
    }
    
    public String setPublisher() {
        this.publisher = publisher;
    }
    
    public String setPublicationDate() {
        this.publicationdate = publication;
    }
    
    public String setEdition() {
        this.edition = edition;
    }
    
    @Override
    public void print() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Edition: " + edition);
    }
    
}
