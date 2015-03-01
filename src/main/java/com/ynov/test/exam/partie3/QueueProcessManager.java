package com.ynov.test.exam.partie3;

import java.util.LinkedList;

public class QueueProcessManager extends BaseProcessManager {
    @Override
    public MyProcess yieldProcess() {
        return processes.size() > 0 ? processes.pop() : null;
    }
}
