package com.ynov.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GameLoopTest {
    private Snippet.RandomNumberGenerator rng;
    private Snippet.UserInput userInput;
    private Snippet.UserOutput userOutput;
    private Snippet.GameLoop gameLoop;

    @Before
    public void setUp() throws Exception {
        rng = mock(Snippet.RandomNumberGenerator.class);
        userInput = mock(Snippet.UserInput.class);
        userOutput = mock(Snippet.UserOutput.class);
        gameLoop = new Snippet.GameLoop(rng, userInput, userOutput);
    }

    @Test
    public void testLoopForever() throws Exception {
        when(rng.getNumber()).thenReturn(7);

        // ???
    }
}