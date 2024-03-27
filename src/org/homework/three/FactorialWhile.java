package org.homework.three;

public class FactorialWhile {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println("Factorial of " + number + " is: " + factorial(number));

    }
    public static int factorial(int number) {
        int factorial = 1;
        int i = 1;
        while(i <= number){
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }
}
