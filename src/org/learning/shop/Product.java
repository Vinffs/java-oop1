package org.learning.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    // ATTRIBUTES
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private final double vat = 0.23;

    // CONSTRUCTORS

    public Product(String name, String description, double price) {
        // generate random number
        Random randomGenerator = new Random();
        int randomCode = randomGenerator.nextInt(99_999_999);

        // treat price as a number with 2 decimals
        BigDecimal correctPrice = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);

        this.code = randomCode;
        this.name = name;
        this.description = description;
        this.price = correctPrice;
    }


    // METHODS

    public BigDecimal netPrice(){
        return this.price;
    }

    public BigDecimal grossPrice() {
        BigDecimal vat = new BigDecimal(this.vat);
        BigDecimal gross = this.price.add(this.price.multiply(vat));

        return gross.setScale(2, RoundingMode.HALF_UP);
    }

    public String fullName() {
        String formatCode = String.format("%08d", this.code);
        return formatCode + "-" + this.name;
    }



}
