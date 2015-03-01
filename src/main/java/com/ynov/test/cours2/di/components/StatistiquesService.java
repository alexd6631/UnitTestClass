package com.ynov.test.cours2.di.components;

import com.ynov.test.cours2.di.models.NoteEleve;
import com.ynov.test.cours2.di.models.Options;
import com.ynov.test.cours2.di.models.StatistiqueEleve;

import java.util.List;

public class StatistiquesService {
    private final OptionsParser parser;
    private final NoteEleveReader reader;
    private final StatistiquesCalculateur calculateur;
    private final Clock clock;
    private final StatistiquesEleveWriter writer;

    public StatistiquesService(OptionsParser parser, NoteEleveReader reader, StatistiquesCalculateur calculateur, Clock clock, StatistiquesEleveWriter writer) {
        this.parser = parser;
        this.reader = reader;
        this.calculateur = calculateur;
        this.clock = clock;
        this.writer = writer;
    }

    public void run(String[] args) throws Exception {
        Options options = parser.parseOptions(args);
        List<NoteEleve> noteEleves = reader.readNotes(options.getInFile());
        List<StatistiqueEleve> statistiqueEleves =
                calculateur.calculStats(noteEleves,
                                        clock.getCurrentTime());
        writer.writeStatistiques(statistiqueEleves, options.getOutFile());
    }
}
