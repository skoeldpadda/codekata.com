package org.skoeldpadda.codekata.kata01.m1;

/**
 * Created by gerd on 08.09.16.
 */
public class Product {

    private String name;
    private boolean isCountable;

    public Product(String name, boolean isCountable) {
        this.name = name;
        this.isCountable = isCountable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCountable() {
        return isCountable;
    }

    public void setCountable(boolean countable) {
        isCountable = countable;
    }
}
