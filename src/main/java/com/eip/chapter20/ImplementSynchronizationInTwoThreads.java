package com.eip.chapter20;

/**
 * Created by sunilpatil on 3/29/17.
 */
public class ImplementSynchronizationInTwoThreads {

    public static class OddEvenMonitor{
        public static final boolean ODD_TURN = true;
        public static final boolean EVEN_TURN = false;
        private boolean turn = ODD_TURN;

        public synchronized void waitTurn(boolean oldTurn){
            while (turn != oldTurn){
                try {
                    wait();
                }catch (InterruptedException ex){
                    System.out.println("Interrupted exception in wait() " + ex);
                }
            }
        }

        public synchronized void toggleTurn(){
            turn ^= true;
            notify();
        }
    }

    public static class OddThread extends Thread{
        private final OddEvenMonitor monitor;

        public OddThread(OddEvenMonitor oddEvenMonitor){
            monitor = oddEvenMonitor;
        }

        @Override
        public void run() {
            for(int i = 1; i <= 100; i = i+2){
                monitor.waitTurn(OddEvenMonitor.ODD_TURN);
                System.out.println("i = " + i);
                monitor.toggleTurn();
            }
        }
    }

    public static class EvenThread extends Thread{
        private final OddEvenMonitor monitor;

        public EvenThread(OddEvenMonitor oddEvenMonitor){
            monitor = oddEvenMonitor;
        }

        @Override
        public void run() {
            for(int i = 2; i <= 100; i = i+2){
                monitor.waitTurn(OddEvenMonitor.EVEN_TURN);
                System.out.println("i = " + i);
                monitor.toggleTurn();
            }
        }
    }

    public static void main(String[] argv){
        OddEvenMonitor oddEvenMonitor = new OddEvenMonitor();
        Thread t1 = new OddThread(oddEvenMonitor);
        Thread t2 = new EvenThread(oddEvenMonitor);

        t1.start();
        t2.start();
    }
}
