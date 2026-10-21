package Ex4_counter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Bank b = new Bank(0);

        //crear los hilos
        Thread alex = new Thread(new Person(b));
        Thread lizer = new Thread(new Person(b));

        alex.start();
        lizer.start();

        alex.join();
        lizer.join();

        System.out.println(b.getMoney());
    }
}
