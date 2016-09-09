package org.skoeldpadda.codekata.kata01.m1;

/**
 * Created by gerd on 08.09.16.
 */
public interface Price {

    double[] getPossibleCounts(double maxCount);
    PricingDecision getPricingDecision(Item item);
}
