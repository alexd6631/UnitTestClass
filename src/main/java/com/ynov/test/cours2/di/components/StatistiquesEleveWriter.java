package com.ynov.test.cours2.di.components;

import com.ynov.test.cours2.di.models.StatistiqueEleve;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface StatistiquesEleveWriter {
    void writeStatistiques(List<StatistiqueEleve> statistiquesEleve, File outFile) throws IOException;
}
