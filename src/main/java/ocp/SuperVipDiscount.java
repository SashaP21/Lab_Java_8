package ocp;

public class SuperVipDiscount implements DiscountCalculator {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.2;
    }
}
