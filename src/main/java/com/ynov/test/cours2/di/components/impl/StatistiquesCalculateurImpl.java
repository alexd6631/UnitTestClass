package com.ynov.test.cours2.di.components.impl;

import com.ynov.test.cours2.di.components.StatistiquesCalculateur;
import com.ynov.test.cours2.di.models.NoteEleve;
import com.ynov.test.cours2.di.models.StatistiqueEleve;

import java.util.*;

public class StatistiquesCalculateurImpl implements StatistiquesCalculateur {

    private boolean isSameMonth(Date d1, Date d2) {
        return d1.getYear() == d2.getYear() && d1.getMonth() == d2.getMonth();
    }

    @Override
    public List<StatistiqueEleve> calculStats(List<NoteEleve> notes, long currentTime) {
        Date thisMonth = new Date(currentTime);
        Map<Integer, List<NoteEleve>> notesMapping = new HashMap<Integer, List<NoteEleve>>();
        for (NoteEleve note : notes) {
            if (isSameMonth(thisMonth, note.getDate())) {
                int id = note.getIdEleve();
                List<NoteEleve> notesForStudent = notesMapping.get(id);
                if (notesForStudent == null) {
                    notesForStudent = new ArrayList<NoteEleve>();
                    notesForStudent.add(note);
                    notesMapping.put(id, notesForStudent);
                } else {
                    notesForStudent.add(note);
                }
            }
        }

        List<StatistiqueEleve> statistiques = new ArrayList<StatistiqueEleve>();
        for (int id : notesMapping.keySet()) {
            List<NoteEleve> notesForStudent = notesMapping.get(id);
            double moy = 0;
            for (NoteEleve note : notesForStudent) {
                moy += note.getNote();
            }
            moy = moy / notesForStudent.size();

            double ecartType = 0;
            for (NoteEleve note : notesForStudent) {
                ecartType += Math.pow(note.getNote() - moy, 2);
            }
            ecartType = ecartType / notesForStudent.size();
            ecartType = Math.sqrt(ecartType);

            statistiques.add(new StatistiqueEleve(id, moy, ecartType));
        }
        return statistiques;
    }
}
