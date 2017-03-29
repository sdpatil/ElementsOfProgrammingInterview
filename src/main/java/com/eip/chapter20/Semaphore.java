package com.eip.chapter20;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class Semaphore {

    private final int MAX_AVAILABLE;
    private int taken;

    public Semaphore(int maxAvailable){
        MAX_AVAILABLE = maxAvailable;
        taken = 0;
    }

    public synchronized void acquire() throws InterruptedException{
        while(this.taken == MAX_AVAILABLE) {
    //        System.out.println("Semaphore not available waiting " + Thread.currentThread().getName());
            wait();
        }
   //     System.out.println("Semaphore is available, performing task "+ Thread.currentThread().getName());
        this.taken++;
    }

    public synchronized void release() throws InterruptedException{
     //   System.out.println("Releasing semaphore "+ Thread.currentThread().getName());

        this.taken--;
        this.notifyAll();
    }

    public static void main(String[] argv){
        Semaphore semaphore = new Semaphore(1);
        Thread t1 = new Thread(new SemapohreClient1(semaphore,"First"));
        t1.start();

        Thread t2 = new Thread(new SemapohreClient1(semaphore, "Second"));
        t2.start();

        Thread t3 = new Thread(new SemapohreClient1(semaphore, "Third"));
        t3.start();
    }

}
