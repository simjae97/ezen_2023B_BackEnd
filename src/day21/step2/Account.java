package day21.step2;

public class Account {
    //1. 필드
    private long balance;

    //2.생성자
    public Account(){

    }

    //3.메소드
    public long getBalance(){
        return balance;
    }
    public void deposit ( int money){
        balance += money;
    }
    public void withdraw(int money) throws InsufficientException{
        if(balance < money){
            throw new InsufficientException("잔고 부족"+(money-balance)+"모자람");
        }
        balance -= money;
    }
}
