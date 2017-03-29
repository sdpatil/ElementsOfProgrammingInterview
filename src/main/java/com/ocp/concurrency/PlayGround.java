package com.ocp.concurrency;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class PlayGround {
    public static void main(String[] argv){
        System.out.println(Thread.currentThread().getName());
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread t = new Thread(new HelloRunnable());
        t.start();

        Thread t1 = new Thread(() -> System.out.println("Inside lambda thread " + Thread.currentThread().getName()));
        t1.start();
    }
}
