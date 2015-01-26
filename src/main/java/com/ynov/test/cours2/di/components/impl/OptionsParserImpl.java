package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.components.OptionsParser;
import com.ynov.test.cours2.di.models.Options;

import java.io.File;

public class OptionsParserImpl implements OptionsParser {
    @Override
    public Options parseOptions(String[] args) {
        if (args.length >= 2) {
            return new Options(
                    new File(args[0]),
                    new File(args[1])
            );
        } else throw new IllegalArgumentException("Invalid number of arguments");
    }
}
