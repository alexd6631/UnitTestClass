package com.ynov.test.exam.partie3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriorityProcessManagerTest extends ProcessManagerTest {

    @Override
    protected ProcessManager createProcessManager() {
        return new PriorityProcessManager();
    }

    @Test
    public void testYieldProcess() {
        MyProcess p1 = new MyProcess("0001", 1);
        MyProcess p2 = new MyProcess("0002", 2);
        MyProcess p3 = new MyProcess("0003", 2);
        MyProcess p4 = new MyProcess("0003", 3);
        processManager.queueProcess(p1);
        processManager.queueProcess(p2);
        processManager.queueProcess(p3);
        processManager.queueProcess(p4);

        assertEquals(p4, processManager.yieldProcess());
        assertEquals(p2, processManager.yieldProcess());
        assertEquals(p3, processManager.yieldProcess());
        assertEquals(p1, processManager.yieldProcess());
        assertEquals(null, processManager.yieldProcess());
    }
}