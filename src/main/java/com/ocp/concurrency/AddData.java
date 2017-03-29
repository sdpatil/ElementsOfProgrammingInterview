package com.ocp.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by sunilpatil on 3/17/17.
 */
public class AddData {
    public static void main(String[] argv)throws Exception{
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println("Result " + result.get());
        }finally {
            if(service != null)
                service.shutdown();;
        }

    }
}
