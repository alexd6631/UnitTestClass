package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.components.StatistiquesEleveWriter;
import com.ynov.test.cours2.di.models.StatistiqueEleve;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class StatistiquesEleveWriterImpl implements StatistiquesEleveWriter {

    @Override
    public void writeStatistiques(List<StatistiqueEleve> statistiquesEleve, File outFile) throws IOException {

    }
}
