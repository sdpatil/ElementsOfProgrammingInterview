package com.ocp.concurrency;

import java.util.concurrent.*;

/**
 * Created by sunilpatil on 3/21/17.
 */
public class HelloFixedRateScheduler {

    public static void main(String[] argv){
        ScheduledExecutorService schedulerService = null;
        final long startTime = System.currentTimeMillis();
        try {
            schedulerService = Executors.newScheduledThreadPool(1);
            schedulerService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Inside HelloFixedRateScheduler.run  " + (System.currentTimeMillis()-startTime)) ;
                }
            }, 30, 5, TimeUnit.SECONDS);
        }catch (Exception ex){
            if(schedulerService != null)
                schedulerService.shutdown();
        }
    }
}
