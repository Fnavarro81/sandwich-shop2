package com.pluralsight;

import java.util.*;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Assigning variables
        double sandwichPrice = 0;
        double regularPrice = 5.45;
        double largePrice = 8.95;
        double pediatricAgeDiscount = 0.90;
        double geriatricAgeDiscount = 0.80;
        double trueDiscount = 1;
        double regularLoadedFee = 1.00;
        double largeLoadedFee = 1.75;
        double trueLoadedFee = 0;
        boolean choosingSize = true;


        // Assigning Price
        while (choosingSize) {
            System.out.println("Would you like 1.Regular: base price $5.45 or 2.Large: base price $8.95?: ");
            String size = inputScanner.next();

            System.out.println("Would you like your sandwich loaded? Yea or No: ");
            String loaded = inputScanner.next();

            if (size.equalsIgnoreCase("1")) {
                sandwichPrice = regularPrice;
                choosingSize = false;
                    if (loaded.equalsIgnoreCase("Yes")) {
                        trueLoadedFee = regularLoadedFee;
                        System.out.println("Loaded Fee applied for regular sandwich!");
                    } else if (loaded.equalsIgnoreCase("No")) {
                        System.out.println("No loaded fee applied");
                    } else {
                        System.out.println("Invalid choice, please use either Yes or No");
                    }
            } else if (size.equalsIgnoreCase("2")) {
                sandwichPrice = largePrice;
                choosingSize = false;
                    if (loaded.equalsIgnoreCase("Yes")) {
                        trueLoadedFee = largeLoadedFee;
                        System.out.println("Loaded Fee applied for large sandwich!");
                    } else if (loaded.equalsIgnoreCase("No")) {
                        System.out.println("No loaded fee applied");
                    } else {
                        System.out.println("Invalid choise, please use either Yes or No");
                    }
            } else {
                System.out.println("Invalid choice, please use either 1 or 2");
            }
        }

        // Assigning discount to age
        System.out.println("What is your age?: ");
        double age = inputScanner.nextDouble();

        if (age <= 17) {
            trueDiscount = pediatricAgeDiscount;
            System.out.println("You are receiving a %10 discount on your order!");
        } else if (age >= 65) {
            trueDiscount = geriatricAgeDiscount;
            System.out.println("You are receiving a %20 discount on your order!");
        }

        // Total cost displayed
        double totalCost = (sandwichPrice * trueDiscount) + trueLoadedFee;
        System.out.printf("$%.2f\n", totalCost);
    }
}


