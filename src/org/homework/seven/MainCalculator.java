package org.homework.seven;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char inputYesNo;
        do{
            System.out.println("Enter expression ");
            String input = scanner.nextLine();
            System.out.println(calculator.getResult(input));
            System.out.println("Would you like to enter other expressions? (Y/N) ");
            inputYesNo = scanner.nextLine().charAt(0);
        } while (inputYesNo == 'Y');
        System.out.println("Goodbye");
    }
}
