package Practice.EncapsulationConcept;

 class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;

        if (balance>0){
            this.balance=balance;
        }
        else {
            this.balance=0;
        }
    }

    // Read only Properties

    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }


    // Deposite with validation

    public void deposit(double amount){
        if (amount>0){
            balance=balance+amount;
            System.out.println(amount+" Deposited Successfully...");
        }
        else {
            System.out.println("Invalid Deposite amount");
        }
    }

    // Withdrawl logic with validation

    public void withdrawal(double amount){
        if (balance<=0){
            System.out.println("Invalid withdrawl amount...");
        } else if (amount > balance) {
            System.out.println("You don't have sufficient amount to withdrawal...");
        }
        else {
            balance=balance-amount;
            System.out.println("Withdrawl Successful: "+amount);
        }
    }
    public void getAccountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("AccountHolder Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}

public class BankApp{
    public static void main(String[] args) {

        BankAccount account = new BankAccount("574366571449", "Deepan Behera", 234.00);
        account.getAccountDetails();
        account.deposit(2000);
        account.getAccountDetails();
        account.withdrawal(1200);
        account.getAccountDetails();
    }
}

