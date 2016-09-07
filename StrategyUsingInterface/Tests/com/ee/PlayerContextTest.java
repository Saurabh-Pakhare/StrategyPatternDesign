package com.ee;

import ee.AggressiveStrategy;
import ee.MixedStrategy;
import ee.PlayerContext;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by saurabh on 7/9/16.
 */
public class PlayerContextTest {


    PlayerContext cricketPlayer;

    @Before
    public void setUp() throws Exception {

        cricketPlayer = new PlayerContext("Dhoni", new MixedStrategy());
    }

    @org.junit.Test
    public void isShouldPlayWithTheSpecifiedStrategy() throws Exception {

        assertEquals("Playing Aggressive and Defensive!", cricketPlayer.play());
    }

    @Test
    public void isShouldNotBeEqualToTheDefaultStrategy() throws Exception {

        cricketPlayer.setPlayingStrategy(new AggressiveStrategy());

        assertNotEquals("Playing Aggressive and Defensive as needed", cricketPlayer.play());
    }


}