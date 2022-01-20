import java.util.ArrayList;

public class Album {
    public final String titel;
    public final int year;
    private final Artist artist;
    private final ArrayList<Song> songs = new ArrayList<>();

    public Album(String titel, int year, Artist artist) {
        this.titel = titel;
        this.year = year;
        this.artist = artist;
    }

    public void addTrack(Song song) {
        songs.add(song);
    }

    public Song getTrack(int index) {
        if (index < 1||index> songs.size()) {
            return  null;
        }
        return songs.get(index - 1);
    }

    public String toString() {
        return titel + "(" + year + ")";
    }

}
