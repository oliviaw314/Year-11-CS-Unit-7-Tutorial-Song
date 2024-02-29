import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> previousListeners = new ArrayList<String>();

    public Song(String title, String artist) {
        this.title=title;
        this.artist=artist;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> listeners) {
       int noOfNewListeners=0;
       for (String listener: listeners) {
           if (!previousListeners.contains(listener.toLowerCase())) {
               previousListeners.add(listener.toLowerCase());
               noOfNewListeners++;
           }
       }
       return noOfNewListeners;
    }
}
