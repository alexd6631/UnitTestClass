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

    @Override
    public String toString() {
        return "StatistiqueEleve{" +
                "idEleve=" + idEleve +
                ", moyenne=" + moyenne +
                ", ecartType=" + ecartType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StatistiqueEleve that = (StatistiqueEleve) o;

        if (Double.compare(that.ecartType, ecartType) != 0) return false;
        if (idEleve != that.idEleve) return false;
        if (Double.compare(that.moyenne, moyenne) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idEleve;
        temp = Double.doubleToLongBits(moyenne);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(ecartType);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
