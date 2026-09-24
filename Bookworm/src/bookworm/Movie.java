package bookworm;


public class Movie extends Media {
    
    private String director;
    
    private String runtime; // minutes
    
    private String rating; // 1-5
    
    public Movie() {
        
    }
    
    public String getDirector() {
        return director;
    }
    
    public String getRuntime() {
        return runtime;
    }
    
    public String getRating() {
        return rating;
    }
    
    public String setDirector(String director) {
        this.director = director
    }
    
    public String setRuntime(String runtime) {
        this.runtime = runtime;
    }
    
    public String setRating(String rating) {
        this.rating = rating;
    }
    
    @Override
    public void print() {
        System.out.println("Director" + director);
        System.out.println("Runtime" + runtime);
        System.out.println("Rating" + rating);
    }
}
