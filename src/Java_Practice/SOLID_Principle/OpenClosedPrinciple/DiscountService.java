package Java_Practice.SOLID_Principle.OpenClosedPrinciple;

public class DiscountService {
    public double getDiscount(DiscountStrategy discountStrategy){
        return discountStrategy.calculateDiscount();
    }
}
