package com.ynov.test.exam.partie3;

public class PriorityProcessManager extends BaseProcessManager {


    @Override
    public MyProcess yieldProcess() {
        if (processes.size() > 0) {
            int maxPriority = -1;
            int index = -1;
            for (int i=0; i<processes.size(); i++) {
                MyProcess p = processes.get(i);
                if (p.getPriority() > maxPriority) {
                    maxPriority = p.getPriority();
                    index = i;
                }
            }
            return processes.remove(index);
        } else {
            return null;
        }
    }
}
