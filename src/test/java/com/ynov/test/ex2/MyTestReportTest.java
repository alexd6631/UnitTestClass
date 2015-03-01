package com.ynov.test.ex2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTestReportTest {

    private MyTestReport report;

    @Before
    public void setup() {
        report = new MyTestReport();
    }

    @Test
    public void testToString() throws Exception {
        report.addSuccess();
        report.addFailure();
        report.addError();
        assertEquals(".FE", report.toString());
    }

    @Test
    public void testToStringSimpleSuccess() throws Exception {
        report.addSuccess();
        assertEquals(".", report.toString());
    }

    @Test
    public void testToStringSimpleError() throws Exception {
        report.addError();
        assertEquals("E", report.toString());
    }

    @Test
    public void testToStringSimpleFailure() throws Exception {
        report.addFailure();
        assertEquals("F", report.toString());
    }

    @Test
    public void testNoTest() throws Exception {
        assertEquals("", report.toString());
    }
}