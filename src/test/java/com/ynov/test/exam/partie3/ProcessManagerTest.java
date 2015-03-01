package com.ynov.test.exam.partie3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public abstract class ProcessManagerTest {
    abstract protected ProcessManager createProcessManager();
    protected ProcessManager processManager;

    @Before
    public void setUp() throws Exception {
        processManager = createProcessManager();
    }

    @Test
    public void testExistingProcess() throws Exception {
        //Etant donné un gestionnaire de processus
        //Contenant deux process p1, p2
        MyProcess p1 = new MyProcess("0001", 0);
        MyProcess p2 = new MyProcess("0002", 0);
        processManager.queueProcess(p1);
        processManager.queueProcess(p2);
        //Lorsque je teste si p1 est contenu par le gestionnaire avec son id
        boolean res = processManager.isProcessQueued("0001");
        //Alors le gestionnaire renvoit vrai
        assertTrue(res);
    }

    @Test
    public void testNonExistingProcess() throws Exception {
        //Etant donné un gestionnaire de processus
        //Contenant deux process p1, p2
        MyProcess p1 = new MyProcess("0001", 0);
        MyProcess p2 = new MyProcess("0002", 0);
        processManager.queueProcess(p1);
        processManager.queueProcess(p2);
        //Lorsque je teste si p3 est contenu par le gestionnaire
        boolean res = processManager.isProcessQueued("0003");
        //Alors le gestionnaire renvoit false
        assertFalse(res);
    }
}