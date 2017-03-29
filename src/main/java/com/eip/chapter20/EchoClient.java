package com.eip.chapter20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class EchoClient {
    public static void main(String[] argv)throws Exception{
        if(argv.length !=2){
            System.err.println(
                    "Usage: java EchoClient <host name> <port number>");
            System.exit(1);
        }

        String hostname = argv[0];
        int portNumber = Integer.parseInt(argv[1]);


        Socket echoSocket = null;
        try {
            echoSocket = new Socket(hostname, portNumber);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in));
            String userInput;
            while((userInput = stdIn.readLine()) != null ){
                out.println(userInput);
                System.out.println("echo " + in.readLine());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(echoSocket != null)
                echoSocket.close();
        }
    }
}
