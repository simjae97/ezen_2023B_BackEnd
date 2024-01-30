package day21.step2;

public class Step2 {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : "+account.getBalance());

        try {
            account.withdraw(30000);
        }
        catch (InsufficientException e ){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
