package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.components.StatistiquesCalculateur;
import com.ynov.test.cours2.di.models.NoteEleve;
import com.ynov.test.cours2.di.models.StatistiqueEleve;

import java.util.List;

public class StatistiquesCalculateurImpl implements StatistiquesCalculateur {
    @Override
    public List<StatistiqueEleve> calculStats(List<NoteEleve> notes, long currentTime) {
        return null;
    }
}
