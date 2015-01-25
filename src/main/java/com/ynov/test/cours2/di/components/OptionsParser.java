package com.ynov.test.cours2.di.components;

import com.ynov.test.cours2.di.models.Options;

public interface OptionsParser {
    Options parseOptions(String[] args);
}
