package com.ynov.test.cours2.di.models;

public class StatistiqueEleve {
    private final int idEleve;
    private final double moyenne;
    private final double ecartType;

    public StatistiqueEleve(int idEleve, double moyenne, double ecartType) {
        this.idEleve = idEleve;
        this.moyenne = moyenne;
        this.ecartType = ecartType;
    }

    public int getIdEleve() {
        return idEleve;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public double getEcartType() {
        return ecartType;
    }
}
