public class Song{

    private String title;
    private String artist;
    private String genre;
    private ArrayList<String> lyrics;
    private float playTime;

    public Song(String title, String genre, String artist, ArrayList<String> lyrics)
    {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
        this.lyrics = lyrics;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getGenre()
    {
        return genre;
    }

    public ArrayList<String> getLyrics()
    {
        return lyrics;
    }



    




}