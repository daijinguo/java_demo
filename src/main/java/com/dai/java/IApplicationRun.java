package com.dai.java;

public abstract class IApplicationRun {

    private String mTitle;
    private boolean mIsToRun;

    public IApplicationRun(String title, boolean toRun) {
        mTitle = title;
        mIsToRun = toRun;
    }

    public IApplicationRun() {
        this("", true);
    }

    public String Title() {
        return mTitle;
    }

    public boolean IsToRun() {
        return mIsToRun;
    }

    public abstract void AppRun(String args[]);

    /**
     * create a new install
     *
     * @return the hash code of the instance
     */
    public abstract int Instance();
}
