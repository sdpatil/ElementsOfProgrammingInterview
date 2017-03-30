package com.eip.chapter20;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class TwoThreadIncrementDriver {
    public static AtomicInteger counter;
    public static int N;

    public static void main(String[] argv)throws Exception{
        counter = new AtomicInteger();
        N = (argv.length >0 )? Integer.parseInt(argv[0]) : 100;

        Thread t1 = new Thread(new IncrementThread());
        Thread t2 = new Thread(new IncrementThread());

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Value of counter " + counter);
    }

    public static class IncrementThread implements Runnable{
        @Override
        public void run() {
            for(int i = 0; i < TwoThreadIncrementDriver.N; i++){

                try {
                    Thread.sleep(1);
                }catch (Exception ex){

                }
                TwoThreadIncrementDriver.counter.incrementAndGet();
            }
        }
    }
}
