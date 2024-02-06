package org.homework.five;

import java.util.Scanner;

public class AlgorithmId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert type of Algorithm 1 or 2: ");
        int algorithmId = scanner.nextInt();

        switch (algorithmId) {
            case 1:
                System.out.println("Insert loop type of Fibonacci Sequence:");
                int loopTypeForOne = scanner.nextInt();
                System.out.println("Insert number for Fibonacci Sequence:");
                int number1 = scanner.nextInt();
                FibonacciSequence fibonacci = new FibonacciSequence(number1);

                switch (loopTypeForOne) {
                    case 1:
                        int[] resultWhile = fibonacci.getFibonacciWhile();
                        printFibonacciNumbers(resultWhile);

                        break;
                    case 2:
                        int[] resultDowhile = fibonacci.getFibonacciDoWhile();
                        printFibonacciNumbers(resultDowhile);
                        break;
                    case 3:
                        int[] resultFor = fibonacci.getFibonacciFor();
                        printFibonacciNumbers(resultFor);
                        break;
                }

                break;

            case 2:
                System.out.println("Insert loop type of Factorial:");
                int loopTypeForTwo = scanner.nextInt();
                System.out.println("Insert number for Factorial:");
                int number2 = scanner.nextInt();
                Factorial factorial = new Factorial(number2);

                switch (loopTypeForTwo) {
                    case 1:
                        int resultFacWhile = factorial.getFactorialWhile();
                        System.out.println(resultFacWhile);;
                        break;
                    case 2:
                        int resultFacDoWhile = factorial.getFactorialDoWhile();
                        System.out.println(resultFacDoWhile);
                        break;
                    case 3:
                        int resultFacFor = factorial.getFactorialFor();
                        System.out.println(resultFacFor);
                        break;
                }

        }

    }
    public static void printFibonacciNumbers (int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i <= 5) {
                System.out.print(array[i]);
                System.out.print(" ");
            } else {
                System.out.print("...");
                break;
            }

        }
    }
}
