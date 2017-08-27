package com.dai.java;

import java.util.List;

public class ThisMain {

    public static void main(String args[]) {
        System.out.println("********** this is main begin **********");

        List<IApplicationRun> lists = ApplicationManager.getLists();
        if (null != lists) {
            for (int i = 0; i < lists.size(); i++) {
                IApplicationRun run = lists.get(i);
                if (!run.IsToRun()) continue;

                System.out.println();

                System.out.println("\t Index = " + (i + 1));
                System.out.println("\t Title = " + run.Title());
                run.AppRun(args);
            }
        }

        System.out.println("*********** this is main end ***********");
    }
}
