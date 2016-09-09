package org.skoeldpadda.codekata.kata01.m1;

/**
 * Created by gerd on 09.09.16.
 */
public class DiscountPrice implements Price {

    private int quantity;

    private double totalPrice;

    public DiscountPrice(int quantity, double totalPrice) {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    @Override
    public double[] getPossibleCounts(double maxCount) {
        return new double[0];
    }

    @Override
    public PricingDecision getPricingDecision(Item item) {
        return null;
    }
}
