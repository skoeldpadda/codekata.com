package org.skoeldpadda.codekata.kata01.m1;

import org.junit.Test;

/**
 * Created by gerd on 08.09.16.
 */
public class TillTest {

    @Test
    public void testSeveralProducts() {
        // Products
        Product pWater = new Product("Naturalis water", true);
        Product pTomatoes = new Product("Tomatoes", false);

        // Each product can have several prices
        Price simple = new SimplePrice(10.0);
        Price three_for_a_dollar = new DiscountPrice(3, 7.0);

        // Our supermarket basket
        Item[] items = new Item[] {
            new Item(pWater, 6), new Item(pTomatoes, 10)
        };

        Till till = new TillImpl();
        Cost totalCost = till.getCost(items);
    }
}
