package com.ocp.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class ZooInfo {

    public static void main(String[] argv){
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("Begin");

            service.execute(() -> System.out.println("Printing zoo inventory"));
            service.execute(() ->{
                for (int i = 0; i <3 ;i++){
                    System.out.println("Printing records: " + i);
                }
            });
            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");

        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(service != null)
                service.shutdown();
        }
    }
}
