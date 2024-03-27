package org.homework.two;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of trianle edges");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double area = (a * b) / 2;
        System.out.println(" Area of triangle = " + area);
    }
}
