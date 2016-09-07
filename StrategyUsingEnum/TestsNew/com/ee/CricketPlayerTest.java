package com.ee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by saurabh on 7/9/16.
 */
public class CricketPlayerTest {

    CricketPlayer cricketPlayer;

    @Before
    public void setUp() throws Exception {

        cricketPlayer = new CricketPlayer("Sachin", 1989, PlayingStrategy.ONE_DAY);

    }

    @org.junit.Test
    public void isShouldPlayWithTheSpecifiedStrategy() throws Exception {

        assertEquals("Playing Aggressive and Defensive as needed", cricketPlayer.play());
    }

    @Test
    public void isShouldNotBeEqualToTheDefaultStrategy() throws Exception {

        cricketPlayer.setPlayingStrategy(PlayingStrategy.T20);

        assertNotEquals("Playing Aggressive and Defensive as needed", cricketPlayer.play());
    }

    @Test
    public void isShouldReturnCurrentStrategy() throws Exception {

        assertEquals("ONE_DAY", cricketPlayer.getPlayingStrategy());
    }

}