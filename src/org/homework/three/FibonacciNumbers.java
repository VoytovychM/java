package org.homework.three;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(Arrays.toString(returnUsingFor(n)));
        System.out.println(Arrays.toString(returnUsingWhile(n)));
        System.out.println(Arrays.toString(returnUsingDowhile(n)));
    }

    public static int[] returnUsingFor(int n) {
        /// 0, 1, 1, 2, 3, 5
        int[] fibonacci = new int[n];
        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public static int[] returnUsingWhile(int n) {
        int[] fibonacci = new int[n];
          int a = 0;
          int b = 1;
          int i = 0;

            while (i < n) {
                fibonacci[i] = a;
                int next = a + b;
                a = b;
                b = next;
                i++;
            }
            return fibonacci;
        }
        public static int[] returnUsingDowhile(int n) {
            int[] fibonacci = new int[n];
            int a = 0;
            int b = 1;
            int i = 0;
            do {
                fibonacci[i] = a;
                int next = a + b;
                a = b;
                b = next;
                i++;
            }    while (i < n) ;

            return fibonacci;
        }
    }



