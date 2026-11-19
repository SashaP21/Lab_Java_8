package ocp;

public class RegularDiscount implements DiscountCalculator {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.05;
    }
}
