package com.emisdep;

import java.util.*;

public class Operators {

    // Complete the solve function below.
    private static double solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip_total = meal_cost * tip_percent / 100;
        double tax_total = meal_cost * tax_percent / 100;

        return meal_cost + tip_total + tax_total;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        double meal_total = solve(meal_cost, tip_percent, tax_percent);

        System.out.println(Math.round(meal_total));

        scanner.close();
    }
}
