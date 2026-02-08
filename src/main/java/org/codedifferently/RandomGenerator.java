package org.codedifferently;

import java.util.Random;

public class RandomGenerator {
    public static int visitID(){
        Random rand = new Random();

        int visitNum = rand.nextInt(1000,100000);
        return visitNum;
    }

    public static double itemPrice(){
        Random rand = new Random();
        double priceItem = rand.nextDouble(5.99,59.99);
        return priceItem;
    }

    public static double fee(){
        Random rand = new Random();
        double fee = rand.nextDouble(.99,9.99);
        return fee;
    }

}
