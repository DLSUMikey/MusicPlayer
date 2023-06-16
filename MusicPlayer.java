public class MusicPlayer{


private String deviceName;
private ArrayList<Song> songList;
private ArrayList<Playlist> playlistList;

public MusicPlayer(String deviceName)
{
    this.deviceName = deviceName;
}

public boolean createPlaylist(String name)
{
    boolean result = false;
    if(Playlist >= 5) {
        this.playlistList.add(new Playlist(name));
        result = true;
    }
    return result;
}   

public void addSong(Song song)
{
    this.song
}


public void addSong(int songindex, int playlistindex)
{

}

public void playSong(int index)
{
    system.out.println(deviceName + " is not playing")
}

public void playPlaylist(int index)
{

}






}