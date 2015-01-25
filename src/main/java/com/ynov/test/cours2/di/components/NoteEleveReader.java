package com.ynov.test.cours2.di.components;

import com.ynov.test.cours2.di.models.NoteEleve;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface NoteEleveReader {
    public List<NoteEleve> readNotes(File inFile) throws IOException;
}
