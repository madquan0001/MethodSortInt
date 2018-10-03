package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Import three numbers");
        System.out.print("Number 1 : ");
        num1 = scanner.nextDouble();
        System.out.print("Number 2 : ");
        num2 = scanner.nextDouble();
        System.out.print("Number 3 : ");
        num3 = scanner.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3)
    {
        double n;
        if (num1 > num2)
        {
            n = num2;
            num2 = num1;
            num1 = n;
        }
        if (num1 > num3)
        {
            n = num3;
            num3 = num1;
            num1 = n;
        }
        if (num2 > num3)
        {
            n = num3;
            num3 = num2;
            num2 = n;
        }
        System.out.println("After sort : " + num1 + " - " + num2 + " - " + num3);
    }
}
