package org.skoeldpadda.codekata.kata01.m3;

/**
 * Created by gerd on 08.09.16.
 */
public class SimplePrice implements Price {

    private double pricePerQuantity;

    public SimplePrice(double pricePerQuantity) {
        this.pricePerQuantity = pricePerQuantity;
    }

    @Override
    public double getPrice() {
        return pricePerQuantity;
    }
}
