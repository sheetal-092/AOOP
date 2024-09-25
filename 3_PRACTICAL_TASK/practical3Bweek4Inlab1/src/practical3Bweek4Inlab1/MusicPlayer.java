package practical3Bweek4Inlab1;

public interface MusicPlayer {
	 void play();
	}

	
	class LocalMusicPlayer {
	    public void playLocalFile() {
	        System.out.println("Playing music from local file...");
	    }
	}

	
	class OnlineMusicPlayer {
	    public void streamOnline() {
	        System.out.println("Streaming music from online service...");
	    }
	}

	
	class RadioMusicPlayer {
	    public void playRadio() {
	        System.out.println("Playing music from radio station...");
	    }
	}

	
	class LocalMusicAdapter implements MusicPlayer {
	    private LocalMusicPlayer localMusicPlayer;

	    public LocalMusicAdapter(LocalMusicPlayer localMusicPlayer) {
	        this.localMusicPlayer = localMusicPlayer;
	    }

	    @Override
	    public void play() {
	        localMusicPlayer.playLocalFile();
	    }
	}

	
	class OnlineMusicAdapter implements MusicPlayer {
	    private OnlineMusicPlayer onlineMusicPlayer;

	    public OnlineMusicAdapter(OnlineMusicPlayer onlineMusicPlayer) {
	        this.onlineMusicPlayer = onlineMusicPlayer;
	    }

	    @Override
	    public void play() {
	        onlineMusicPlayer.streamOnline();
	    }
	}

	
	class RadioMusicAdapter implements MusicPlayer {
	    private RadioMusicPlayer radioMusicPlayer;

	    public RadioMusicAdapter(RadioMusicPlayer radioMusicPlayer) {
	        this.radioMusicPlayer = radioMusicPlayer;
	    }

	    @Override
	    public void play() {
	        radioMusicPlayer.playRadio();
	    }
	}


	abstract class MusicPlayerDecorator implements MusicPlayer {
	    protected MusicPlayer decoratedPlayer;

	    public MusicPlayerDecorator(MusicPlayer player) {
	        this.decoratedPlayer = player;
	    }

	    public void play() {
	        decoratedPlayer.play();
	    }
	}

	
	class EqualizerDecorator extends MusicPlayerDecorator {

	    public EqualizerDecorator(MusicPlayer player) {
	        super(player);
	    }

	    public void play() {
	        super.play();
	        setEqualizer();
	    }

	    private void setEqualizer() {
	        System.out.println("Equalizer settings applied.");
	    }
	}

	
	class VolumeControlDecorator extends MusicPlayerDecorator {

	    public VolumeControlDecorator(MusicPlayer player) {
	        super(player);
	    }

	    public void play() {
	        super.play();
	        setVolume();
	    }

	    private void setVolume() {
	        System.out.println("Volume control enabled.");
	    }
}
