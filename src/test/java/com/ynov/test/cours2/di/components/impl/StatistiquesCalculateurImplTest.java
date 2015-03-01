package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.models.NoteEleve;
import com.ynov.test.cours2.di.models.StatistiqueEleve;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class StatistiquesCalculateurImplTest {

    private Date dateHelper(String dateString) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testCalculStats() throws Exception {
        StatistiquesCalculateurImpl calculator = new StatistiquesCalculateurImpl();

        List<NoteEleve> notes = Arrays.asList(
                new NoteEleve(1, "test", 5f, dateHelper("01/01/2015")),
                new NoteEleve(1, "test", 15f, dateHelper("01/01/2015")),
                new NoteEleve(1, "test", 15f, dateHelper("01/02/2015")),
                new NoteEleve(2, "test2", 15f, dateHelper("01/02/2015"))
        );

        List<StatistiqueEleve> statistiqueEleves = calculator.calculStats(notes, dateHelper("01/01/2015").getTime());

        List<StatistiqueEleve> expected = Arrays.asList(
                new StatistiqueEleve(1, 10, 5));

        assertEquals(expected, statistiqueEleves);
    }
}