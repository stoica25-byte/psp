package Countdown;

public class Worker_Thread implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
            while(!Thread.currentThread().isInterrupted()){
                System.out.print("Working...");
                
                try {
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                    // TODO: handle exception
                    Thread.currentThread().interrupt();
                   System.out.print("hilo interrumpido");
                }
            }
            System.out.println("cleanly stopped");
            
        

    }

}
