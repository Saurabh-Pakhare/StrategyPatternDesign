package com.ee;

/**
 * Created by saurabh on 7/9/16.
 */
public class EnumStrategyDemo {

    public static void main(String[] args) {

        CricketPlayer cricketPlayer = new CricketPlayer("Sachin", 1989,PlayingStrategy.ONE_DAY);
        System.out.println(cricketPlayer.getName() + " is " + cricketPlayer.play());

        cricketPlayer.setPlayingStrategy(PlayingStrategy.TEST);
        System.out.println(cricketPlayer.getName() + " is " + cricketPlayer.play());

        cricketPlayer.setPlayingStrategy(PlayingStrategy.T20);
        System.out.print(cricketPlayer.getName() + " is " + cricketPlayer.play());
    }
}
