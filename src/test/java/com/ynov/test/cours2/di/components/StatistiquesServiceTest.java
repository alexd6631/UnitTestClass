package com.ynov.test.cours2.di.components;

import com.ynov.test.cours2.di.models.NoteEleve;
import com.ynov.test.cours2.di.models.Options;
import com.ynov.test.cours2.di.models.StatistiqueEleve;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StatistiquesServiceTest {

    @Mock
    OptionsParser parser;
    @Mock
    NoteEleveReader reader;
    @Mock
    Clock clock;
    @Mock
    StatistiquesCalculateur calculateur;

    @Mock
    StatistiquesEleveWriter writer;

    private StatistiquesService service;

    @Before
    public void setupService() {
        service = new StatistiquesService(
                parser, reader, calculateur, clock, writer
        );
    }

    @Test
    public void testRun() throws Exception {
        String args[] = {};
        File f1 = new File("f1");
        File f2 = new File("f2");
        List<NoteEleve> l1 = Arrays.asList(
                new NoteEleve(1, "test", 10, new Date())
        );
        List<StatistiqueEleve> l2 = Arrays.asList(
                new StatistiqueEleve(1, 10, 1)
        );
        long t1 = 12345646;
        when(parser.parseOptions(args))
                .thenReturn(new Options(f1, f2));
        when(reader.readNotes(f1)).thenReturn(l1);
        when(clock.getCurrentTime()).thenReturn(t1);
        when(calculateur.calculStats(l1, t1)).thenReturn(l2);

        service.run(args);

        verify(writer).writeStatistiques(l2, f2);
    }

}