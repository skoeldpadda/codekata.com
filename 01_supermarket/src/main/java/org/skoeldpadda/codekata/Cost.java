package org.skoeldpadda.codekata;

/**
 * Created by gerd on 08.09.16.
 */
public interface Cost {

    Money getTotalCost();
    PricingDecision[] getPricingDecisions();
}
