package Thread_Priorities;

public class Main {
    public static void main(String[] args) {
        
        Thread maxThread = new Thread(new Max_thread("max"));
        Thread ThreadAVG = new Thread(new Max_thread("avg"));
        Thread minThread = new Thread(new Max_thread("min"));

        maxThread.setPriority(Thread.MAX_PRIORITY);
        ThreadAVG.setPriority(Thread.NORM_PRIORITY);
        minThread.setPriority(Thread.NORM_PRIORITY);

        maxThread.start();
        ThreadAVG.start();
        minThread.start();


    }
}
