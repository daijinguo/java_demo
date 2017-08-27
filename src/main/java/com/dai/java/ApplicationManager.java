package com.dai.java;

import java.util.ArrayList;
import java.util.List;

public final class ApplicationManager {

    private static final List<IApplicationRun> ms_array = new ArrayList<>();

    public static void register(IApplicationRun app) {
        if (null != app) {
            ms_array.add(app);
        }
    }

    public static List<IApplicationRun> getLists() {
        return ms_array;
    }

    public static void clean() {
        ms_array.clear();
    }

}
