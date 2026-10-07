package Countdown;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("inicio del programa");
        Thread workThread = new Thread( new Worker_Thread());

        workThread.start();

        Thread.sleep(2000);
        workThread.interrupt();
        
        
    }
}
