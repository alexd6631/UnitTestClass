package com.ynov.test.exam.partie3;

public class MyProcess {
    private String id;
    private int priority;

    public MyProcess(String id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }
}
