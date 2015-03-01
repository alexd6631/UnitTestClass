package com.ynov.test.exam.partie2;

public class MyString {
    private StringBuffer _sb;

    public MyString(String s) {
        _sb = new StringBuffer(s);
    }

    public String getString() {
        return _sb.toString();
    }

    public void setString(String s) {
        _sb = new StringBuffer(s);
    }

    public void toUpperCase() {
        for (int i=0; i<_sb.length(); i++) { //On boucle sur tous les caractères de la chaine, et on les passe en majuscule
            char c = _sb.charAt(i);
            _sb.setCharAt(i, Character.toUpperCase(c));
        }
    }

    public int numberOfChar(char c) {
        int occurences = 0;
        for (int i = 0; i < _sb.length(); i++) { //Pour chaque caractère, on teste si il est égal au caractère demandé,
                                                 // si oui on incrémente le compteur des occurences
            if (c == _sb.charAt(i)) occurences++;
        }
        return occurences;
    }

    /**
     * Méthode utilitaire pour tester si un caractère est une voyelle
     */
    private boolean isVoyel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int numberOfVoyels() {
        int occurences = 0;
        for (int i = 0; i < _sb.length(); i++) { //Comme numberOfChar mais en testant si les caractères sont des voyelles.
            if (isVoyel(_sb.charAt(i))) occurences++;
        }
        return occurences;
    }

    public String getFirstWord() {
        StringBuffer sb = new StringBuffer(); //On construit un buffer vide qui contiendra le premier mot
        for (int i = 0; i < _sb.length(); i++) { //On parcourt chaque caractère
            char c = _sb.charAt(i);
            if (c == ' ' || c == '\t' || c == '\n') break; //Si le caractère est un espace (ou tab, ou saut de ligne)
                                                           // il s'agit de la fin du premier mot -> on break
            sb.append(c); //On ajoute le caractère
        }
        return sb.toString();
    }

    public boolean isPalindrome() {
        StringBuffer copy = new StringBuffer(_sb);
        return copy.reverse().toString().equals(_sb.toString());
    }
}
