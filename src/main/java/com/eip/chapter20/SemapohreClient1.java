package com.eip.chapter20;

import java.util.Random;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class SemapohreClient1 implements Runnable {

    Semaphore semaphore;
    String clientName;

    public SemapohreClient1(Semaphore semaphore, String clientName){
        this.semaphore = semaphore;
        this.clientName = clientName;
    }


    @Override
    public void run() {
        try {
            Random random = new Random();
            while (true) {

            //    System.out.println(clientName + " Acquiring Semaphore " + Thread.currentThread().getName());
                semaphore.acquire();
                System.out.println(clientName + " Doing some important work " + Thread.currentThread().getName());
                Thread.sleep(random.nextInt(3000));
                //System.out.println(clientName + " Semaphore released " + Thread.currentThread().getName());
                semaphore.release();
                //System.out.println(clientName + " Semaphore released, going to sleep " + Thread.currentThread().getName());

                Thread.sleep(random.nextInt(3000));

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
