package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.components.NoteEleveReader;
import com.ynov.test.cours2.di.models.NoteEleve;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NoteEleveReaderImpl implements NoteEleveReader {
    @Override
    public List<NoteEleve> readNotes(File inFile) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)));
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(inFile), "utf-8"
                    )
            );
            String line;
            List<NoteEleve> notes = new ArrayList<NoteEleve>();
            while ((line = reader.readLine()) != null) {
                String[] fragments = line.split(";");
                int id = Integer.parseInt(fragments[0]);
                String name = fragments[1];
                float note = Float.parseFloat(fragments[2].replace(',', '.'));
                String dateString = fragments[3];
                Date date = null;
                try {
                    date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
                } catch (ParseException e) {
                    throw new IOException(e);
                }
                notes.add(new NoteEleve(id, name, note, date));
            }

            return notes;
        } finally {
            if (reader != null) {
                reader.close();
            }
        }

    }
}
