package com.ynov.test.exam.partie3;

public interface ProcessManager {
    boolean isProcessQueued(String pid);

    void queueProcess(MyProcess p);

    MyProcess yieldProcess();
}
