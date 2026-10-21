package exercise5_starvation;

public class Main {
     public static void main(String[] args) {
        Wallet wallet = new Wallet(100); // initial balance: €100
        for (int i = 0; i < 10; i++) {   // create and start 10 people
            new Person(wallet, i).start();
        }
    }
}

