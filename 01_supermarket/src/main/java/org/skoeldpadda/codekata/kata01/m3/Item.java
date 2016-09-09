package org.skoeldpadda.codekata.kata01.m3;

/**
 * Created by gerd on 08.09.16.
 */
public class Item {

    private double count;
    private Product product;

    public Item(Product product, double count) {
        this.product = product;
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }
}
