package com.ynov.test.cours2.di.models;

import java.util.Date;

public class NoteEleve {
    private final int idEleve;
    private final String nomEleve;
    private final double note;
    private final Date date;

    public NoteEleve(int idEleve, String nomEleve, double note, Date date) {
        this.idEleve = idEleve;
        this.nomEleve = nomEleve;
        this.note = note;
        this.date = date;
    }

    public int getIdEleve() {
        return idEleve;
    }

    public String getNomEleve() {
        return nomEleve;
    }

    public double getNote() {
        return note;
    }

    public Date getDate() {
        return date;
    }
}
