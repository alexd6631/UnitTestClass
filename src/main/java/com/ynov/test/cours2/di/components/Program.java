package com.ynov.test.cours2.di.components;

import com.ynov.test.cours2.di.components.impl.*;

public class Program {

    public static void main(String[] args) {
        new StatistiquesService(
                new OptionsParserImpl(), new NoteEleveReaderImpl(), new StatistiquesCalculateurImpl(), new ClockImpl(), new StatistiquesEleveWriterImpl()
        );
    }
}
