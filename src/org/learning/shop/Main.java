package org.learning.shop;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        Product iphone = new Product("Iphone 99 Pro", "New Chip M10 Ultra Pro Mega Hyper...", 200_000);

        System.out.println("Check Out Our New Product!");
        System.out.println("Net Price: € " + iphone.netPrice());
        System.out.println("Gross Price: € " + iphone.grossPrice());
        System.out.println("Full Product name: " + iphone.fullName());

        System.out.println();

        Product samsung = new Product("Samsung XYZ", "Better than the Iphone for sure", 1249.99);

        System.out.println("Check Out Our New Product!");
        System.out.println("Net Price: € " + samsung.netPrice());
        System.out.println("Gross Price: € " + samsung.grossPrice());
        System.out.println("Full Product name: " + samsung.fullName());

    }
}

