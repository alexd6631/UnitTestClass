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
        int res = sample.simpleMethod(true, true);
		assertEquals(110, res);
    }
//
    @Test
    public void fullBranchCoverage() {
        int res = sample.simpleMethod(false, false);
		assertEquals(0, res);
    }
//    
    @Test
    public void fullPathCoverage() {
    	 int res1 = sample.simpleMethod(true, false);
		assertEquals(10, res1);
    	 int res2 = sample.simpleMethod(false, true);
		assertEquals(100, res2);
    }
}