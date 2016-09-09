package org.skoeldpadda.codekata.kata01.m1;

/**
 * Created by gerd on 08.09.16.
 */
public class SimplePrice implements Price {

    private double pricePerQuantity;

    public SimplePrice(double pricePerQuantity) {
        this.pricePerQuantity = pricePerQuantity;
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
