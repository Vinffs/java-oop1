package org.learning.shop;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product prova = new Product("Prova", "Questa è una prova", 29.00);

        System.out.println(prova.netPrice());

        System.out.println(prova.grossPrice());
    }
}

