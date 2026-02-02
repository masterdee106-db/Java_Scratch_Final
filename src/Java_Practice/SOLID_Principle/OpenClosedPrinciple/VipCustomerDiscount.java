package Java_Practice.SOLID_Principle.OpenClosedPrinciple;

public class VipCustomerDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscount() {
        return 20.0;
    }
}
