package practical3Aweek4Inlab1;

public class MusicStreamingApp {
	public static void main(String[] args) {
       
        MusicPlayer localPlayer = new LocalMusicAdapter(new LocalMusicPlayer());
        MusicPlayer localPlayerWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(localPlayer));
        localPlayerWithFeatures.play();
        
        System.out.println("--------------------");

       
        MusicPlayer onlinePlayer = new OnlineMusicAdapter(new OnlineMusicPlayer());
        MusicPlayer onlinePlayerWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(onlinePlayer));
        onlinePlayerWithFeatures.play();
        
        System.out.println("--------------------");

       
        MusicPlayer radioPlayer = new RadioMusicAdapter(new RadioMusicPlayer());
        MusicPlayer radioPlayerWithFeatures = new EqualizerDecorator(new VolumeControlDecorator(radioPlayer));
        radioPlayerWithFeatures.play();
    }
}
