package org.codedifferently;

import java.util.Random;

public class RandomGenerator {
    public static int visitID(){
        Random rand = new Random();

        int visitNum = rand.nextInt(100,999);
        return visitNum;
    }

    public static double itemPrice(){
        Random rand = new Random();
        double priceItem = rand.nextDouble(5.99,59.99);
        return Math.round(priceItem);
    }

    public static double tax(){
        Random rand = new Random();
        double tax = (rand.nextDouble(10))/100;
        return tax;
    }



}
