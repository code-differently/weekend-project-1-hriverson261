package org.codedifferently;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String custName = input.nextLine();

        System.out.println("Enter your budget");
        double budget = input.nextDouble();

        System.out.println("Enter coupon code: ");
        String couponCode = input.nextLine();

        input.close();

    }

}
