package Practice.Exception.CustomException;

public class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
    }

    public void withdrawal(double amount) throws InsufficientBalanceException{
        if (amount>balance){
            throw new InsufficientBalanceException(("Withdrawal failed: Insufficient Balance..."));
        }
        balance=balance-amount;
        System.out.println("Withdrawal successfull, Balance: "+balance);
    }


}
