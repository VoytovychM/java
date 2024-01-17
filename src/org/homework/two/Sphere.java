package org.homework.two;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double area = 4 * Math.PI * Math.pow(r, 2);
        System.out.println("Area of sphere = " + area);
    }
}
