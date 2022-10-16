package com.example.api_playground;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class BackGroundTasks {

    private static Executor executor = Executors.newSingleThreadExecutor();

    public static void execute(Runnable runnable){
        executor.execute(runnable);
    }
}
