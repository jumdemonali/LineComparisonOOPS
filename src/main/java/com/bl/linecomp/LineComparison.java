package com.bl.linecomp;

import java.util.Scanner;

public class LineComparison {
    public static int x, x1, x2, x3, x4, y, y1, y2, y3, y4;
    public static double distance1, distance2;

    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison program!!");
        variables();
    }

    public static void variables() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Coordinates of first line : ");
        System.out.print("Enter the value of x1 of line1 ");
        x = sc.nextInt();
        System.out.print("Enter the value of x2 of line1 ");
        x1 = sc.nextInt();
        System.out.print("Enter the value of y1 of line1 ");
        y = sc.nextInt();
        System.out.print("Enter the value of y2 of line1 ");
        y1 = sc.nextInt();
        double line1 = (Math.sqrt(Math.pow((x1 - x), 2)) + Math.pow((y1 - y), 2));

        System.out.println("Enter Coordinates of second line : ");
        System.out.println("Enter the value of x1  of line2 ");
        x3 = sc.nextInt();
        System.out.println("Enter the value of x2  of line2 ");
        x4 = sc.nextInt();
        System.out.println("Enter the value of y1  of line2 ");
        int y3 = sc.nextInt();
        System.out.println("Enter the value of y2  of line2 ");
        y4 = sc.nextInt();
        double line2 = (Math.sqrt(Math.pow((x4 - x3), 2)) + Math.pow((y4 - y3), 2));
        compareTo(line1, line2);
    }

    static void compareTo(Double value1, Double value2) {
        if (value1 == value2) {
            System.out.println("Both lines are equal in length.");
        }
        else {
            System.out.println("Line are not equal in length");
        }
    }
}

