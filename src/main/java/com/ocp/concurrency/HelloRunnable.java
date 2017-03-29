package com.ocp.concurrency;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("HelloRunnable " + Thread.currentThread().getName() );
    }
}
