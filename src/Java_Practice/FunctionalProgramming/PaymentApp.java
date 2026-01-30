package Java_Practice.FunctionalProgramming;

public class PaymentApp {
    public static void main(String[] args) {

        // Creadit Card Payment

        PaymentProcessor creditCardPayment = new PaymentProcessor() {
            @Override
            public void pay(double amount) {
                System.out.println("Processing Credit Card payment..");
                System.out.println("Amount: " + amount);
                System.out.println("CreaditCard Payment Successful...");
            }
        };

        PaymentProcessor UPIPayment = new PaymentProcessor() {
            @Override
            public void pay(double amount) {
                System.out.println("Processing UPIPayment");
                System.out.println("Amount: "+amount);
                System.out.println("UPI Payment Successful...");
            }
        };

        PaymentProcessor NetBankingPayment = new PaymentProcessor() {
            @Override
            public void pay(double amount) {
                System.out.println("Processing NetBanking Payment");
                System.out.println("Amount: "+amount);
                System.out.println("Netbanking Payment Successful...");
            }
        };

        creditCardPayment.pay(2000);
        UPIPayment.pay(3000);
        NetBankingPayment.pay(5000);
    }
}
