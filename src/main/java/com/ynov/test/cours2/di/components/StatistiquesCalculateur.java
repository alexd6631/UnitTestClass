package com.ynov.test.cours2.di.components;

import com.ynov.test.cours2.di.models.NoteEleve;
import com.ynov.test.cours2.di.models.StatistiqueEleve;

import java.util.List;

public interface StatistiquesCalculateur {
    List<StatistiqueEleve> calculStats(List<NoteEleve> notes, long currentTime);
}
