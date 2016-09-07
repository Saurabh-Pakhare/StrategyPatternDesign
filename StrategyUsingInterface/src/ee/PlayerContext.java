package ee;

/**
 * Created by saurabh on 7/9/16.
 */
public class PlayerContext {

    String name;

    private PlayingStrategy playingStrategy;

    public PlayerContext(String name, PlayingStrategy playingStrategy) {
        this.name = name;
        this.playingStrategy = playingStrategy;
    }

    public String getName() {
        return name;
    }

    public void setPlayingStrategy(PlayingStrategy playingStrategy) {
        this.playingStrategy = playingStrategy;
    }

    public String play() {

        return playingStrategy.play();
    }
}
