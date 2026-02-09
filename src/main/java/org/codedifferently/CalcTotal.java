package org.codedifferently;

public class CalcTotal {

    public static double subTotal(double item1, double item2, double item3){
        double subTotal = Math.round(item1 + item2 + item3);
        return subTotal;
    }

    public static double taxAmount(double total){

        return Math.round(total * RandomGenerator.tax());
    }

    public static double totalAmount(double subTotal, double taxAmount, double discount){
        double totalAmount = Math.round((subTotal + taxAmount)*discount);
        return totalAmount;




























































    }




}
