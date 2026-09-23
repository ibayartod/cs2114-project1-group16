package bookworm;

public class Media {

    private String title;

    private int id;

    private boolean isAvailable;

    public Media(String mTitle, int mId, boolean mIsAvailable) {
        title = mTitle;
        id = mId;
        isAvailable = mIsAvailable;
    }


    public String getName() {
        return title;
    }


    public boolean isAvailable() {
        return isAvailable;
    }


    public void print() {
        System.out.println("Media title: " + title + ", Media Id: " + id
            + ", Avaliability: " + isAvailable);
    }

}
