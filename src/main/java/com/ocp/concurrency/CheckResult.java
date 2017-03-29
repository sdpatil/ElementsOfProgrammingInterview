package com.ocp.concurrency;

import java.util.concurrent.*;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class CheckResult {
    private static int counter = 0;

    public static void main(String[] argv) throws InterruptedException, ExecutionException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++)
                    CheckResult.counter++;
            });
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");

        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if (service != null)
                service.shutdown();
        }

    }

    /*public static void main(String[] argv) throws InterruptedException{
        new Thread( () ->{
            for(int i = 0; i < 500; i++)
                CheckResult.counter++;
        }).start();

        while (CheckResult.counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }

        System.out.println("Reached");
    }*/
}
