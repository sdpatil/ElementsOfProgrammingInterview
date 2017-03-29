package com.eip.chapter20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class EchoServer {

    public static void main(String[] args)throws Exception{
        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]);
        ServerSocket serverSocket = null;
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        try{
            serverSocket = new ServerSocket(portNumber);
            while (true) {
                Socket clientSocket = serverSocket.accept();
             //   RequestHandlder requestHandlder = new RequestHandlder(clientSocket);
                executorService.submit(new RequestHandlder(clientSocket));
              //  Thread t = new Thread(requestHandlder);
               // t.start();
            }

        }catch (Exception ex){

        }finally {
            if(serverSocket !=null)
                serverSocket.close();
        }

    }

    static final class RequestHandlder implements Runnable{
        Socket clientSocket;

        public RequestHandlder(Socket socket){
            this.clientSocket = socket;
        }
        @Override
        public void run() {
            try {
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println("Message received: " + inputLine);
                    out.println(inputLine);
                }
            }catch (Exception ex){

            }
        }
    }
}
