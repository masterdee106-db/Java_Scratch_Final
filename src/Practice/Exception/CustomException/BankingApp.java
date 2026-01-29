package Practice.Exception.CustomException;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1000);

        try {
            ba.withdrawal(2000);
        }
        catch(InsufficientBalanceException i){
            System.out.println(i.getMessage());
        }
    }
}
