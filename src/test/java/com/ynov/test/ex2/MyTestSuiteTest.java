package com.ynov.test.ex2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MyTestSuiteTest {

    private MyTestSuite testSuite;

    @Before
    private void setup() {
        testSuite = new MyTestSuite();
    }

    @Test
    public void testRun() throws Exception {
        MyTest test1 = mock(MyTest.class);
        MyTest test2 = mock(MyTest.class);
        MyTest test3 = mock(MyTest.class);

        testSuite.addTest(test1);
        testSuite.addTest(test3);
        testSuite.addTest(test2);

        testSuite.run();

        verify(test1, atLeast(1)).run();
        verify(test2, atLeast(1)).run();
        verify(test3, atLeast(1)).run();

    }
}