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
    
    public void setPublisher() {
        this.publisher = publisher;
    }
    
    public void setPublicationDate() {
        this.publicationdate = publication;
    }
    
    public void setEdition() {
        this.edition = edition;
    }
    
    @Override
    public void print() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Edition: " + edition);
    }
    
}
