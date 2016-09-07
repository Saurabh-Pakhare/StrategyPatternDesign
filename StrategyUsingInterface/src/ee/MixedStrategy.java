package ee;

/**
 * Created by saurabh on 7/9/16.
 */
public class MixedStrategy implements PlayingStrategy {

    @Override
    public String play() {
        return "Playing Aggressive and Defensive!";
    }
}
