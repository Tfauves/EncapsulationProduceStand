package com.company.util;

import java.text.NumberFormat;


public abstract class Formatter {
    public static String getDisplayPrice(int price) {
        return NumberFormat.getCurrencyInstance().format(price / 100);
    }
}