package org.homework.two;

import java.util.Scanner;

public class Trapezoid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("Perimeter of trapezoid = " + perimeter);
    }
}
