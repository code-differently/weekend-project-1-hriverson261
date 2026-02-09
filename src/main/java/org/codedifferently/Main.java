package org.codedifferently;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Importing the Scanner class to accept user input
        Scanner input = new Scanner(System.in);

        // Collecting Customer information
        System.out.println("Enter first name: ");
        String custName = input.nextLine();

        System.out.println("Enter coupon code: ");
        double couponCode = input.nextDouble();

        System.out.println("Enter your budget: ");
        double budget = input.nextDouble();

        // Closing the Scanner
        input.close();

        // Generating item prices to calculate subTotal and tax amount
        double itemPrice1 = RandomGenerator.itemPrice();
        double itemPrice2 = RandomGenerator.itemPrice();
        double itemPrice3 = RandomGenerator.itemPrice();
        double subTotal = CalcTotal.subTotal(itemPrice1, itemPrice2, itemPrice3);
        double taxAmount = CalcTotal.taxAmount(subTotal);

        //Creating the item tax and visitID number
        double itemTax = RandomGenerator.tax();
        int visitNum = RandomGenerator.visitID();

        //Checking if customer code is equal to the  discount code, if yes discount 15% is applied
        double validCode = 105;
        double discountValid = Receipt.discount(couponCode,validCode);

        //Calculating total
        double totalAmount = CalcTotal.totalAmount(subTotal,taxAmount,discountValid);

        //Receipt with all infromation is printed
        Receipt.recepitLayout(Receipt.recieptCode(custName),itemPrice1,itemPrice2,itemPrice3,subTotal,
                taxAmount,totalAmount);
        Receipt.canYouAffordIt(totalAmount,budget);



    }

}
