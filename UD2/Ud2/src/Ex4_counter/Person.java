package Ex4_counter;

public class Person implements  Runnable{

    private Bank bank;

    public Person(Bank bank){
        this.bank = bank;
    }
    @Override 
    public void run(){
        for(int i = 0; i < 10000; i++){
            bank.addMoney(1);
        }
    }
}
