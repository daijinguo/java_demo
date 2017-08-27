package com.dai.java.thread;

import com.dai.java.ApplicationManager;
import com.dai.java.IApplicationRun;

public class HelloThread extends IApplicationRun {

    public HelloThread(String title, boolean is2run) {
        super(title, is2run);

        ApplicationManager.register(this);
    }

    public HelloThread() {
        this(HelloThread.class.getSimpleName(), true);
    }

    @Override
    public void AppRun(String[] args) {
        System.out.println("this is simple thread demo");
    }

    @Override
    public int Instance() {
        return (new HelloThread()).hashCode();
    }
}
