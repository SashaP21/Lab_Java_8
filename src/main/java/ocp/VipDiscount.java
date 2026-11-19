package ocp;

public class VipDiscount implements DiscountCalculator {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.1;
    }
}
