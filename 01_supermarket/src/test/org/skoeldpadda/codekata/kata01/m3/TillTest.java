package org.skoeldpadda.codekata.kata01.m3;

import org.junit.Test;
import org.skoeldpadda.codekata.kata01.m1.*;

/**
 * Created by gerd on 08.09.16.
 */
public class TillTest {

    @Test
    public void testSeveralProducts() {
        // Products
        Product pWater = new Product("Naturalis water", true);
        Product pTomatoes = new Product("Tomatoes", false);

        // Each product has exactly one price
        Price simple = new SimplePrice(10.0);
        pWater.setPrice(simple);

        // Ofers are to be modeled as products with negative prices!
        Product three_for_a_doller = new Product("Offer: Three water bottles for a dollar", true);



        Till till = new TillImpl();
        Cost totalCost = till.getCost(items);
    }
}
