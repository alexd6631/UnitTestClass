package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.components.OptionsParser;
import com.ynov.test.cours2.di.models.Options;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class OptionsParserImplTest {
    private OptionsParser optionsParser;

    @Before
    public void setup() {
        optionsParser = new OptionsParserImpl();
    }

    @Test
    public void testParseOptions() throws Exception {
        String[] args = {"in.txt", "out.txt"};

        Options result = optionsParser.parseOptions(args);
        Options expected = new Options(
                new File("in.txt"),
                new File("out.txt")
        );
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongArgumentsNumber() {
        String[] args = {"test"};
        optionsParser.parseOptions(args);
    }


}