package com.ynov.test.cours3;

public class CodeCoverageSample {

    public int simpleMethod(boolean a, boolean b) {
        int res = 0;
        if (a) {
            res += 10;
        }
        if (b) {
            res += 100;
        }
        return res;
    }
    
    public void untested() {
    	System.out.println("I am untested");
    }
}
