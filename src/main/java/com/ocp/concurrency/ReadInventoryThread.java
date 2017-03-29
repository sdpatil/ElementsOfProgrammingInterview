package com.ocp.concurrency;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class ReadInventoryThread extends Thread{
    @Override
    public void run() {
        System.out.println("Printing Zoo inventory");
    }

    public static void main(String[] argv){
        System.out.println("Begin");
        (new Thread(new ReadInventoryThread())).start();
        (new Thread(new PrintData())).start();
        (new Thread(new ReadInventoryThread())).start();
        System.out.println("End");
    }
}
