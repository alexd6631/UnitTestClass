package com.ynov.test.cours2.di.models;

import java.util.Date;

public class NoteEleve {
    private final int idEleve;
    private final String nomEleve;
    private final float note;
    private final Date date;

    public NoteEleve(int idEleve, String nomEleve, float note, Date date) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteEleve noteEleve = (NoteEleve) o;

        if (idEleve != noteEleve.idEleve) return false;
        if (Float.compare(noteEleve.note, note) != 0) return false;
        if (date != null ? !date.equals(noteEleve.date) : noteEleve.date != null) return false;
        if (nomEleve != null ? !nomEleve.equals(noteEleve.nomEleve) : noteEleve.nomEleve != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idEleve;
        result = 31 * result + (nomEleve != null ? nomEleve.hashCode() : 0);
        temp = Double.doubleToLongBits(note);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NoteEleve{" +
                "idEleve=" + idEleve +
                ", nomEleve='" + nomEleve + '\'' +
                ", note=" + note +
                ", date=" + date +
                '}';
    }
}
