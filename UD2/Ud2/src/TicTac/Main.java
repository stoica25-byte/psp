package TicTac;

public class Main {
    static void main() throws InterruptedException{

        System.out.println("inicio del programa");
        Thread ThreadTic = new Thread(new TicRunnable());
        Thread ThreadTac = new Thread(new Tac());



        ThreadTic.start();
        ThreadTac.start();

        ThreadTac.join();
        ThreadTic.join();

        System.out.println("fin del programa");
    }
}

