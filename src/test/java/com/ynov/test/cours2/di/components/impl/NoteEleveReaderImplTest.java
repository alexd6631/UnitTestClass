package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.components.NoteEleveReader;
import com.ynov.test.cours2.di.models.NoteEleve;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class NoteEleveReaderImplTest {

    private NoteEleveReader noteEleveReader;

    @Before
    public void setUp() throws Exception {
        noteEleveReader = new NoteEleveReaderImpl();
    }

    private Date dateHelper(int day, int month, int year) {
        return new Date(year - 1900, month - 1, day);
    }

    @Test
    public void testSimpleData() throws Exception {
        List<NoteEleve> noteEleves = noteEleveReader.readNotes(new File("notes-test.csv"));
        System.out.println(noteEleves);
        /*
0;Jean Dupont;5,57;16-12-2014
0;Jean Dupont;14,46;12-01-2015
1;Jeanine Dupond;0,23;29-11-2014
         */


        assertEquals(Arrays.asList(
                new NoteEleve(0, "Jean Dupont", 5.57f, dateHelper(16, 12, 2014)),
                new NoteEleve(0, "Jean Dupont", 14.46f, dateHelper(12, 1, 2015)),
                new NoteEleve(1, "Jeanine Dupond", 0.23f, dateHelper(29, 11, 2014))
                ), noteEleves);
    }
}