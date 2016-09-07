package com.ee;

/**
 * Created by saurabh on 7/9/16.
 */
public class CricketPlayer {

    String name;
    int yearOfDebut;

    private PlayingStrategy playingStrategy;

    public CricketPlayer(String name, int yearOfDebut, PlayingStrategy playingStrategy) {
        this.name = name;
        this.yearOfDebut = yearOfDebut;
        this.playingStrategy = playingStrategy;
    }

    public String getName() {
        return name;
    }

    public int getYearOfDebut() {
        return yearOfDebut;
    }

    public void setPlayingStrategy(PlayingStrategy playingStrategy) {
        this.playingStrategy = playingStrategy;
    }

    public String getPlayingStrategy() {
        return playingStrategy.name();
    }

    public String play() {
        return  playingStrategy.play();
    }

}
