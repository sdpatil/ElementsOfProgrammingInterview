package com.ocp.concurrency;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class PrintData implements Runnable {
    @Override
    public void run() {
        for (int i = 0 ;i < 3 ; i++)
            try {

                System.out.println("Printing Record: " + i);
                Thread.sleep(500);
            }catch (Exception ex){

            }
    }

    public static void main(String[] argv){
        (new Thread(new PrintData())).start();
    }
}
