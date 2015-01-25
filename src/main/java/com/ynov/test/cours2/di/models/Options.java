package com.ynov.test.cours2.di.models;

import java.io.File;

public class Options {

    private final File inFile;
    private final File outFile;

    public Options(File inFile, File outFile) {
        this.inFile = inFile;
        this.outFile = outFile;
    }

    public File getInFile() {
        return inFile;
    }

    public File getOutFile() {
        return outFile;
    }
}
