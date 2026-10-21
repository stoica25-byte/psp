package exercise5_starvation;

public class Wallet {
    private int amount;

    public Wallet(int amount) {
        this.amount = amount;
    }

    public synchronized int withdraw(int money) {
        if (amount >= money) { // check there is enough money
            amount -= money;
            return money;
        }
        return 0;
    }
}
