package com.ocp.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class SheepManager {

    private AtomicInteger sheepCount = new AtomicInteger(0);

    private void incrementAndReport(){
        synchronized (this) {
            System.out.print((sheepCount.incrementAndGet()) + " ");
        }
    }

    public static void main(String[] argv){
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(30);
            SheepManager sheepManager = new SheepManager();
            for(int i = 0; i < 20; i++) {
                    service.submit(() -> sheepManager.incrementAndReport());
            }
        }finally {
            if(service != null)
                service.shutdown();
        }
    }
}
