package exercise5_starvation;

public class Person  extends Thread{
    private final int id;
    private final Wallet wallet;
    private int myMoney = 0;

    public Person(Wallet wallet, int id) {
        this.wallet = wallet;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            myMoney += wallet.withdraw(10);
        }
        System.out.println("Person " + id + ": " + myMoney + " €");
    }
}

