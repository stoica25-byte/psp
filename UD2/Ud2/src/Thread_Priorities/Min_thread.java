package Thread_Priorities;

public class Min_thread implements Runnable{
    private int counter = 0;
    @Override
    public void run() {
        for(int i = 0; i < 1000000; i++){
            counter++;
        }
    }

}
