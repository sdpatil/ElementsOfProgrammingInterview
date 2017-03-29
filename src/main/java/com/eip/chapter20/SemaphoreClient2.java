package com.eip.chapter20;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class SemaphoreClient2 implements Runnable {

    Semaphore semaphore;

    public SemaphoreClient2(Semaphore semaphore){
        this.semaphore = semaphore;
    }


    @Override
    public void run() {
        try {
            System.out.println("SemaphoreClient2. rying to Acquiring Semaphore " + Thread.currentThread().getName());
            semaphore.acquire();
            System.out.println("SemaphoreClient2.Semaphore acquired, going to sleep " + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("SemaphoreClient2.Semaphore released " + Thread.currentThread().getName());

            semaphore.release();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
