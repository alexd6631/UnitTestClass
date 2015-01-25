package com.ynov.test.cours2.di.components;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StatistiquesServiceTest {

    @Mock
    Clock clock;

    @Test
    public void testSimpleMock() {
        when(clock.getCurrentTime()).thenReturn(1234L);
        assertEquals(1234L, clock.getCurrentTime());
    }
}