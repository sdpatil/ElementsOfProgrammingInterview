package com.ocp.concurrency;

import java.util.concurrent.*;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class HelloScheduler {

    public static void main(String[] argv){
        System.out.println("Number of processors " + Runtime.getRuntime().availableProcessors());
        ScheduledExecutorService service = null;
        try{
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable task1 = () -> System.out.println("Hello Zoo");
            Callable<String> task2 = () -> {
                System.out.println("Monkey");
                return "Monkey";
            };

            Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
            Future<?> result2 = service.schedule(task2, 8, TimeUnit.SECONDS);

        }finally {
            if(service != null)
                service.shutdown();
        }
    }
}
