package Java_Practice.FunctionalProgramming;

public class PaymentApp_LambdaExpression {
    public static void main(String[] args) {
        PaymentProcessor creditCard =
                amount -> {
                    System.out.println("Processing Credit Card Payment...");
                    System.out.println("Amount: "+amount);
                    System.out.println("CreditCard Payment Successful...");
                };

        PaymentProcessor netBanking =
                amount -> {
                    System.out.println("Processing NetBanking Payment...");
                    System.out.println("Amount: "+amount);
                    System.out.println("NetBanking Payment Successful...");
                };

        PaymentProcessor phonePay=
                amount -> {
                    System.out.println("Processing Phonepay payment...");
                    System.out.println("Amount: "+amount);
                    System.out.println("Phonepay Amount successful...");
                };

        phonePay.pay(2000);
        creditCard.pay(5000);
        netBanking.pay(7000);
    }
}
