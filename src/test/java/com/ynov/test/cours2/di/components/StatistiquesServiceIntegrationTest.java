package com.ynov.test.cours2.di.components;

import com.ynov.test.cours2.di.components.impl.NoteEleveReaderImpl;
import com.ynov.test.cours2.di.components.impl.OptionsParserImpl;
import com.ynov.test.cours2.di.components.impl.StatistiquesCalculateurImpl;
import com.ynov.test.cours2.di.components.impl.StatistiquesEleveWriterImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StatistiquesServiceIntegrationTest {
    @Mock
    Clock clock;

    @Test
    public void testIntegration() {
        StatistiquesService service = new StatistiquesService(
                new OptionsParserImpl(),
                new NoteEleveReaderImpl(),
                new StatistiquesCalculateurImpl(),
                clock,
                new StatistiquesEleveWriterImpl()
        );
    }


}
