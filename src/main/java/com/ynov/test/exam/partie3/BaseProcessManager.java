package com.ynov.test.exam.partie3;

import java.util.LinkedList;

public abstract class BaseProcessManager implements ProcessManager {
    protected LinkedList<MyProcess> processes = new LinkedList<MyProcess>();

    @Override
    public boolean isProcessQueued(String pid) {
        for (MyProcess process : processes) {
            if (process.getId().equals(pid)) return true;
        }
        return false;
    }

    @Override
    public void queueProcess(MyProcess p) {
        processes.add(p);
    }
}
