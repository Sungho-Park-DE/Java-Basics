public class Song {
    public final String titel;
    public final Artist artist;
    public final Album album;

    public Song(String titel, Artist artist, Album album) {
        this.titel = titel;
        this.artist = artist;
        this.album = album;
    }

    public String toString() {
        return titel + " - " + artist.name + "\n" + album.titel+"("+album.year+")";
    }
}
