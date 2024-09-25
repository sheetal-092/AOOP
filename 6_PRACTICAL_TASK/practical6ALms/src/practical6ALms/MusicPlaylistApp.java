package practical6ALms;

public class MusicPlaylistApp {
	 public static void main(String[] args) {
	        MusicPlaylist playlist = new MusicPlaylist();
	        playlist.addSong("Song 1");
	        playlist.addSong("Song 2");
	        playlist.removeSong("Song 1");
	        playlist.addSong("Song 3");
	        playlist.moveSong(0, 1);
	        playlist.displayPlaylist();
	    }
}
