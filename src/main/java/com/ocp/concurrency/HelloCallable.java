package com.ocp.concurrency;

import java.util.concurrent.*;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class HelloCallable implements Callable<Integer> {
    @Override
    public java.lang.Integer call() throws Exception {
        System.out.println("Entering helloCallable.call");
        Thread.sleep(1000);
        System.out.println("Exiting helloCallable.call");
        return 1;
    }

    public static void main(String[] argv) throws Exception {
        System.out.println("Entering helloCallable.main");

        ExecutorService service = null;
        try {
            service =  Executors.newSingleThreadExecutor();
            Future<Integer> response = Executors.newSingleThreadExecutor().submit(new HelloCallable());
            System.out.println("Response from the thread " + response.get());
        }finally {
            System.out.println("Calling shutdown on the service");
            service.shutdown();
            service.awaitTermination(5, TimeUnit.SECONDS);
            if(service.isShutdown()){
                System.out.println("All tasks are finished");
            }else{
                System.out.println("At least one task is still running");
            }

        }
        System.out.println("Exiting helloCallable.main");
    }
}
