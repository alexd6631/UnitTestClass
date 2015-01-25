package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.components.NoteEleveReader;
import com.ynov.test.cours2.di.models.NoteEleve;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class NoteEleveReaderImpl implements NoteEleveReader {
    @Override
    public List<NoteEleve> readNotes(File inFile) throws IOException {
        return null;
    }
}
