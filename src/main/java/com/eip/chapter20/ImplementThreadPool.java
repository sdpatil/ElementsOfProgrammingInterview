package com.eip.chapter20;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class ImplementThreadPool {
    public static final int PORT = 8080;
    public static void main(String[] argv) throws IOException{
        ServerSocket serverSocket = new ServerSocket(PORT);
        for(;;){
            Socket sc = serverSocket.accept();
            processRequest(sc);
        }
    }

    public static void processRequest(Socket sc){

    }
}
