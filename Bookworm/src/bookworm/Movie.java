package bookworm;

/**
 * Represents a movie.
 */
public class Movie extends Media {
    
    private String director;
    
    private String runtime; // minutes
    
    private String rating; // 1-5
    
    /**
     * Creates a movie.
     */
    public Movie() {
        super("", 0, true);
        director = "";
        runtime = "";
        rating = "";
    }
    
     /**
     * Gets the director.
     * @return director
     */
    public String getDirector() {
        return director;
    }
    
    /**
     * Gets the runtime.
     * @return runtime
     */
    public String getRuntime() {
        return runtime;
    }
    
    /**
     * Gets the rating.
     * @return rating
     */
    public String getRating() {
        return rating;
    }
    
    /**
     * Sets the director.
     * @param director new director
     */
    public void setDirector(String director) {
        this.director = director
    }

    /**
     * Sets the runtime.
     * @param runtime new runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /**
     * Sets the rating.
     * @param rating new rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Prints movie information.
     */
    @Override
    public void print() {
        System.out.println("Director" + director);
        System.out.println("Runtime" + runtime);
        System.out.println("Rating" + rating);
    }
}
