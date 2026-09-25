package bookworm;

/**
 * Represents a newspaper.
 */
public class Newspaper extends Media {

    private String publisher;
    private String publicationDate;
    private String edition;

    /**
     * Creates a new Newspaper.
     * @param p the publisher
     * @param id the unique id
     */
    public Newspaper(String p, int id) {
        super("", id);
        publisher = p;
        publicationDate = "";
        edition = "";
    }

    /**
     * Gets the publisher.
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Gets the publication date.
     * @return the publication date
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Gets the edition.
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the publisher.
     * @param publisher the publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Sets the publication date.
     * @param publicationDate the publication date
     */
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Sets the edition.
     * @param edition the edition
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * Prints the newspaper information.
     */
    @Override
    public void print() {
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("Edition: " + edition);
    }
}