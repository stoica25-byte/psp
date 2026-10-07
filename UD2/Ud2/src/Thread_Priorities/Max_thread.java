package Thread_Priorities;

public class Max_thread implements Runnable {
    private int contador = 0;
    private String name;


    public Max_thread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for(int i = 0; i < 1000000; i++){
           contador++;
        }
        System.out.println("Thread: "+ name + "finished");
    }

}
