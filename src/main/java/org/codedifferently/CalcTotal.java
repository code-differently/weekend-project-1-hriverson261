package org.codedifferently;

public class CalcTotal {

    public static double subTotal(double item1, double item2, double item3){
        double subTotal = item1 + item2 + item3;
        return subTotal;
    }

    public static double tax(double itemPrice){
        double taxAmount = itemPrice * 0.15;
        return taxAmount;
    }

    public static double totalAmount(double subTotal, double taxAmount, double fee){
        double totalAmount = subTotal + taxAmount+ fee;
        return totalAmount;
    }


}
