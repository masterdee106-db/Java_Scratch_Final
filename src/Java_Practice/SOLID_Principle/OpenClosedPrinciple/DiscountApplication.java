package Java_Practice.SOLID_Principle.OpenClosedPrinciple;

public class DiscountApplication {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        DiscountStrategy regular= new RegularCustomerDiscount();
        DiscountStrategy premium = new PremiumCustomerDiscount();
        DiscountStrategy vip = new VipCustomerDiscount();

        System.out.println("Regular Discount: "+
                discountService.getDiscount(regular));

        System.out.println("Premium Discount: "+
                discountService.getDiscount(premium));

        System.out.println("Vip Discount: "+
                discountService.getDiscount(vip));
    }
}
