package com.github.tests;

import org.junit.Test;
import com.github.robertlocke.Timer;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class TimerTest {



    @Test
    public void testTimerSecond() {

        Timer spyTimer = Mockito.spy(new Timer());
        Mockito.doReturn(1_000l).when(spyTimer).milliseconds();
        assertEquals("It took 1 seconds to execute this program.", spyTimer.duration());
    }

    @Test
    public void testTimer1Minute() {

        Timer spyTimer = Mockito.spy(new Timer());
        Mockito.doReturn(60_000l).when(spyTimer).milliseconds();
        assertEquals("It took 1 minutes to execute this program.", spyTimer.duration());
    }

    @Test
    public void testTimer1Hour() {

       Timer spyTimer = Mockito.spy(new Timer());
        Mockito.doReturn(3_600_000l).when(spyTimer).milliseconds();
        assertEquals("It took 1 hours to execute this program.", spyTimer.duration());
    }

    @Test
    public void testTimer27Hours() {

        Timer spyTimer = Mockito.spy(new Timer());
        Mockito.doReturn(100_600_000l).when(spyTimer).milliseconds();
        assertEquals("It took 27 hours to execute this program.", spyTimer.duration());
    }



}