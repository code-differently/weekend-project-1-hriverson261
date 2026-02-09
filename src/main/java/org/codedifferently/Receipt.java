package org.codedifferently;

public class Receipt {

    public static String recieptCode(String userName){
    String userLetters = userName.substring(0,3).toUpperCase();
    String idNum = "" + RandomGenerator.visitID();
    String recieptCode = userLetters + "-" + idNum;

    return recieptCode;

    }

    public static double discount(double custCode, double validCode){
        if (custCode == validCode){
            double disAmount = (1-0.15);
            return disAmount;
        }

        else {
            double disAmount = 1;
            return disAmount;
        }
    }
    public static void recepitLayout(String receiptCode,double item1, double item2, double item3, double subAmount,
                                     double taxAmount, double totalAmount){
        System.out.println("----WELCOME TO THE CODE'S MYSTERY SHACK----\n" + "Receipt code: " + receiptCode + "\n" +
        "Item 1: $" + item1 +"\n" + "Item 2: $" + item2 + "\n" + "Item 3: $" + item3 +
                "\n" + "Subtotal: $" + subAmount + "\nTax applied to total: $"+ taxAmount + "%\n"
        +"----DISCOUNT CODE----\n" + "Discount: 15% Off \nFinal Total: $" + totalAmount);
    }


    public static void canYouAffordIt(double total, double budget){

        double finalTotal = total - budget;

        if(budget < total){
            System.out.println("You do not have enough. You need $" + Math.round(finalTotal)+ " to complete you order");

        }
        else{
            System.out.println("You have enough! your change is $" + Math.abs(Math.round(finalTotal)) + ".");
        }

    }


}

