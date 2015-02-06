package com.ynov.test.cours3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CodeCoverageSampleTest {

    private CodeCoverageSample sample;

    @Before
    public void setUp() {
        sample = new CodeCoverageSample();
    }

    @Test
    public void fullLineCoverage() throws Exception {
        assertEquals(110, sample.simpleMethod(true, true));
    }

    @Test
    public void fullBranchCoverage() {
        assertEquals(0, sample.simpleMethod(false, false));
    }
    
    @Test
    public void fullPathCoverage() {
    	 assertEquals(10, sample.simpleMethod(true, false));
    	 assertEquals(100, sample.simpleMethod(false, true));
    }
}