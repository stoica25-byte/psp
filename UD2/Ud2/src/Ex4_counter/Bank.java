package Ex4_counter;

public class Bank {
    private int money;

    public Bank(int money){
        this.money = money;
    }

    public synchronized  void addMoney(int i){
        money += i;
    }

    public int getMoney(){
        return this.money;
    }
}
