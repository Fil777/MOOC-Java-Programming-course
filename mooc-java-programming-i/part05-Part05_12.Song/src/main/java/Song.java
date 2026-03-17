
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return durationInSeconds;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }
        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Song)) {
            return false;
        }

        // let's cast the object to SimpleDate
        Song s = (Song) compared;

        boolean a = (artist.equals(s.getArtist()));
        boolean b = (name.equals(s.getName()));
        boolean c = (durationInSeconds == s.getDuration());
        return a && b && c;
    }
}
